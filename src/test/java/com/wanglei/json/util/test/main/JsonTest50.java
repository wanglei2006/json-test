package com.wanglei.json.util.test.main;

import com.alibaba.fastjson.JSON;
import com.wanglei.json.util.FastjsonUtil;
import com.wanglei.json.util.JacksonUtil;
import com.wanglei.json.util.test.Bean50Util;
import com.wanglei.json.util.test.SeriableBean50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonTest50 {
	public static void testFastjson(List<SeriableBean50> list, List<String> strList) {
		long t = 0;
		for(int i=0;i<10;i++) {
			long s = System.currentTimeMillis();
			for(SeriableBean50 b : list) {
				FastjsonUtil.toJson(b);
			}
			long e = System.currentTimeMillis();
			t = t + (e - s);
		}
		System.out.println("fastjson->" + (t/10));
		t = 0;
		for(int i=0;i<10;i++) {
			long s = System.currentTimeMillis();
			for(String str : strList) {
				FastjsonUtil.toObject(str, SeriableBean50.class);
			}
			long e = System.currentTimeMillis();
			t = t + (e - s);
		}
		System.out.println("fastjson反解析->" + (t/10));
	}



	public static void testJackson(List<SeriableBean50> list, List<String> strList) {
		long t = 0;
		for(int i=0;i<10;i++) {
			long s = System.currentTimeMillis();
			for(SeriableBean50 b : list) {
				JacksonUtil.toJson(b);
			}
			long e = System.currentTimeMillis();
			t = t + (e - s);
		}
		System.out.println("jackson->" + (t/10));
		t = 0;
		for(int i=0;i<10;i++) {
			long s = System.currentTimeMillis();
			for(String str : strList) {
				JacksonUtil.fromJson(str, SeriableBean50.class);
			}
			long e = System.currentTimeMillis();
			t = t + (e - s);
		}
		System.out.println("jackson反解析->" + (t/10));
	}


	public static void main(String [] args) {

		Arrays.asList(10, 100, 1000, 10000, 100000).forEach(num -> {
			List<SeriableBean50> list = new ArrayList<SeriableBean50>(num);
			List<String> strList = new ArrayList<String>();
			for(int i=0;i<num;i++){
				SeriableBean50 b = Bean50Util.initBean();
				list.add(b);
				strList.add(JSON.toJSONString(b));
			}
			System.out.println(num + "次循环平均值， 50个字段初始化完毕...");
			testFastjson(list,strList);
			testJackson(list,strList);
			System.out.println("---------------------------------------------------------------------------------------------");
		});
	}
	
}
