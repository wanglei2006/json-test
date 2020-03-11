package com.wanglei.json.util.test;

import java.util.Date;

public class Bean20Util {

	private static String s = "abcdefghijklmnopqrstuvwxyz1234567890-=[]\\;',./`~!@#$%^&*()_+{}|:\"?><ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static SeriableBean20 initBean(){
		SeriableBean20 bean = new SeriableBean20();
		changeBean(bean);
		return bean;
	}

	public static void changeBean(SeriableBean20 bean){
		Date date = new Date();
		bean.setAddTime(date);
		bean.setAddUser(randString(10, 20));
		bean.setAvatarUrl(randString(128, 256));
		bean.setBeanName(randString(10, 20));
		bean.setCompanyIdPath(randString(100, 256));
		bean.setCompanyNamePath(randString(100, 256));
		bean.setDescription(randString(10, 50));
		bean.setEmail(randString(10, 50));
		bean.setEmailStatus(randInt(0, 5));
		bean.setId(randLong(1111111111111L, Long.MAX_VALUE));
		bean.setMark(randString(10, 300));
		bean.setNickname(randString(10, 20));
		bean.setPassword(randString(32, 32));
		bean.setPhone(randString(15, 15));
		bean.setPhoneStatus(randInt(0,5));
		bean.setRealname(randString(10, 20));
		bean.setSalt(randString(6, 6));
		bean.setSex("��");
		bean.setUpdateTime(date);
		bean.setUpdateUser(randString(10, 20));
	}

	public static long randLong(long min,long max){
		long result = ((long)(Math.random()*(max - min))) + min;
		return result;
	}

	public static int randInt(int min,int max){
		int result = ((int)(Math.random()*(max - min))) + min;
		return result;
	}

	public static String randString(int minLength,int maxLength){
		int result = ((int)(Math.random()*(maxLength - minLength))) + minLength;
		String r = "";
		int length = s.length();
		char [] c = s.toCharArray();
		while(r.length() < result){
			r = r + c[(int)(Math.random()*length)];
		}
		return r;

	}

}
