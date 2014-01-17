package com.yancy.support.dao.solr;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;

import java.util.Map;

public class StringUtils {

    public static Map<String, String> PRIVINCE_MAP = Maps.newHashMap();

    static {
        PRIVINCE_MAP.put("北京", "beijing");
        PRIVINCE_MAP.put("天津", "tianjin");
        PRIVINCE_MAP.put("河北", "hebei");
        PRIVINCE_MAP.put("山西", "shanxi");
        PRIVINCE_MAP.put("内蒙古", "neimenggu");
        PRIVINCE_MAP.put("辽宁", "liaoning");
        PRIVINCE_MAP.put("吉林", "jilin");
        PRIVINCE_MAP.put("黑龙江", "heilongjiang");
        PRIVINCE_MAP.put("上海", "shanghai");
        PRIVINCE_MAP.put("江苏", "jiangsu");
        PRIVINCE_MAP.put("浙江", "zhejiang");
        PRIVINCE_MAP.put("安徽", "anhui");
        PRIVINCE_MAP.put("福建", "fujian");
        PRIVINCE_MAP.put("江西", "jiangxi");
        PRIVINCE_MAP.put("山东", "shandong");
        PRIVINCE_MAP.put("河南", "henan");
        PRIVINCE_MAP.put("湖北", "hubei");
        PRIVINCE_MAP.put("湖南", "hunan");
        PRIVINCE_MAP.put("广东", "guangdong");
        PRIVINCE_MAP.put("广西", "guangxi");
        PRIVINCE_MAP.put("海南", "hainan");
        PRIVINCE_MAP.put("重庆", "chongqing");
        PRIVINCE_MAP.put("四川", "sichuan");
        PRIVINCE_MAP.put("贵州", "guizhou");
        PRIVINCE_MAP.put("云南", "yunnan");
        PRIVINCE_MAP.put("西藏", "xizang");
        PRIVINCE_MAP.put("陕西", "shanxii");
        PRIVINCE_MAP.put("甘肃", "gansu");
        PRIVINCE_MAP.put("青海", "qinghai");
        PRIVINCE_MAP.put("宁夏", "ningxia");
        PRIVINCE_MAP.put("新疆", "xinjiang");
        PRIVINCE_MAP.put("台湾", "taiwan");
        PRIVINCE_MAP.put("香港", "xianggang");
        PRIVINCE_MAP.put("澳门", "aomen");
        PRIVINCE_MAP.put("其他" ,"qita");
    }

	public static String upcaseFirstChar(String str){
		if(str == null || "".equals(str)){
			return str;
		}
		return str.substring(0, 1).toUpperCase().concat(str.substring(1));
	}

    /**
     * 汉字转拼音的方法
     * @param name 汉字
     * @return 拼音
     */
    public static String hanyuToPinyin(String name){
        String pinyinName = "";
        char[] nameChar = name.toCharArray();
        HanyuPinyinOutputFormat defaultFormat =
                new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < nameChar.length; i++) {
            if (nameChar[i] > 128) {
                try {
                    pinyinName += PinyinHelper.toHanyuPinyinStringArray
                            (nameChar[i], defaultFormat)[0];
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return pinyinName;
    }
    
    public static String toGetMethodName(String str){
    	String[] sub = str.split("_| ");
    	String[] upSub = new String[sub.length];
    	for (int i = 0; i < sub.length; i++) {
    		upSub[i] = upperFirst(sub[i]);
		}
    	return "get" + Joiner.on("").join(upSub);
    }
    
    public static String upperFirst(String str){
    	return str.substring(0,1).toUpperCase() + str.substring(1,str.length());
    }
	
}
