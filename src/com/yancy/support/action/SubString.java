package com.yancy.support.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
	public class SubString {
    //第一种方法
    public Set exist(String[] page,String[] datas){
        List sList1 = Arrays.asList(page);//数组转换为List
        Set set1 = new HashSet(sList1);//List转换为Set
        Set set2=new HashSet();
            for (int i = 0; i < datas.length; i++) {
                if (set1.add(datas[i])) {
                    set2.add(datas[i]);//将其中一个的数据往Set中添加，
                            //如果存在返回false,则已经存在
                }
            }
        return set2;
    }
    //第二种方法
    public List<String> exist2(String[] page,String[] datas){
        List<String> strs = new ArrayList<String>();
        for (int i = 0; i < datas.length; i++)  
        {
            //需要搞清楚两个数组的顺序，主要分清哪个数组中的值是否存在于哪一个数组，下面判断是datas数组中的值是否存在于page中
            boolean exists = Arrays.asList(page).contains((datas[i]));  
            if (!exists)  
            {  
                strs.add(datas[i]);  
            }  
        }  
        return strs;
    }
    public static void main(String[] args) {

        SubString subs=new SubString();
        String[] strs={"c","a","b","f"}; 
        String[] strs2={"e","c","d","b","a"}; 
        Set set=subs.exist(strs2, strs);
        System.out.println(set.size());
        Iterator it=set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); 
        }
    }
}
