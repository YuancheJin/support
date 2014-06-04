package com.yancy.support.dao.redshift;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;
import com.jolbox.bonecp.BoneCPDataSource;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class Redshift {
    public enum DataBase {
        REDSHIFTWEIBO("/redshift-jdbc.properties");

        private String configFile;

        private DataBase(String configFile) {
            this.configFile = configFile;
        }

        public String config() {
            return this.configFile;
        }
    }

    private static volatile Map<DataBase, BoneCP> dbs = new HashMap();

    private static volatile BoneCPDataSource ds;

    public static Connection getConnection(DataBase db) throws Exception {
    	System.out.println("redshift connection");
        if (dbs.get(db) == null) {
            synchronized (Redshift.class) {
                if (dbs.get(db) == null) {
                    Class.forName("org.postgresql.Driver");
                    Properties prop = new Properties();
                    InputStream in = Redshift.class.getResourceAsStream(db.config());
                    prop.load(in);
                    prop.setProperty("ssl", "true");
                    BoneCP pool1 = new BoneCP(new BoneCPConfig(prop));
                    dbs.put(db, pool1);
                    Runtime.getRuntime().addShutdownHook(
                            new Thread(new Runnable() {
                                public void run() {
                                    Redshift.shutdownRedshiftConnectPool();
                                }
                            }));
                }
            }
        }
        Connection conn = dbs.get(db).getConnection();
        conn.setAutoCommit(false);
//        conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
        return conn;
    }

    public static DataSource getDataSource(DataBase db) throws Exception {
        if (ds == null) {
            synchronized (Redshift.class) {
                if (ds == null) {
                    Class.forName("org.postgresql.Driver");
                    Properties prop = new Properties();
                    InputStream in = Redshift.class.getResourceAsStream(db.config());
                    prop.load(in);
                    ds = new BoneCPDataSource(new BoneCPConfig(prop));
                }
            }
        }
        return ds;
    }

    public static void shutdownRedshiftConnectPool() {
        synchronized (dbs) {
            for (BoneCP pool : dbs.values()) {
                pool.shutdown();
            }
        }
    }


}
