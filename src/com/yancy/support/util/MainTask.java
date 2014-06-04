package com.yancy.support.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTask {
    public void execute() throws IOException
    {
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("do my job"+dateFormat.format(new Date()));
        //Runtime.getRuntime().exec("cmd /c start E:/mbl/BusinessOffice/MoneDB/bin/bakup.bat");
    }
}