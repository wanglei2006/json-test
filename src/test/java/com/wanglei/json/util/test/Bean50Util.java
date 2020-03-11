package com.wanglei.json.util.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Bean50Util {

	private static String s = "abcdefghijklmnopqrstuvwxyz1234567890-=[]\\;',./`~!@#$%^&*()_+{}|:\"?><ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static SeriableBean50 initBean(){
		SeriableBean50 bean = new SeriableBean50();
		changeBean(bean);
		return bean;
	}

	public static void changeBean(SeriableBean50 bean){
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
		bean.setIdNum(randString(18, 18));
		bean.setIdType(randString(5, 10));
		bean.setLastLoginTime(date);
		bean.setMark(randString(10, 300));
		bean.setNickname(randString(10, 20));
		bean.setPassword(randString(32, 32));
		bean.setPhone(randString(15, 15));
		bean.setPhoneStatus(randInt(0,5));
		bean.setQq(randString(6, 10));
		bean.setRealname(randString(10, 20));
		bean.setSalt(randString(6, 6));
		bean.setSex("mail");
		bean.setSignNum(randString(20, 50));
		bean.setStatus(randInt(0, 5));
		bean.setUpdateTime(date);
		bean.setUpdateUser(randString(10, 20));
		bean.setWechatNum(randString(30, 50));
        bean.setMail(randString(30, 50));
        bean.setDesk(randString(20, 50));
        bean.setTable(randString(30, 50));
        bean.setDuration(4334343L);
        bean.setFormat(randString(5, 20));
		bean.setNumber(2323.2f);
		bean.setFull_item_id(randString(20, 44));
		List list = Arrays.asList("eweweewfrwef","2e332r34r344r","wefrewfwr32efwefw");
		bean.setLangs(list);
		bean.setLikes(randLong(1111111111111L, Long.MAX_VALUE));
		bean.setSource_site(randString(5, 20));
		bean.setSource_time(randLong(1111111111111L, Long.MAX_VALUE));
		bean.setSource_url(randString(5, 20));
		bean.setP1(randString(5, 20));
		bean.setP2(randString(5, 20));
		bean.setP3(randString(5, 20));
		bean.setP4(randString(5, 20));
		bean.setP5(randString(5, 20));
		bean.setP6(randString(5, 20));
		bean.setP7(randString(5, 20));
		bean.setP8(randString(5, 20));
		bean.setP9(randString(5, 20));
		bean.setP10(randString(5, 20));
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
