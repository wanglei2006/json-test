package com.wanglei.json.util.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Bean100Util {

    private static String s = "abcdefghijklmnopqrstuvwxyz1234567890-=[]\\;',./`~!@#$%^&*()_+{}|:\"?><ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static SeriableBean100 initBean(){
        SeriableBean100 bean = new SeriableBean100();
        changeBean(bean);
        return bean;
    }

    public static void changeBean(SeriableBean100 bean){
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

        bean.setSource_user(randString(10, 20));
        bean.setStore_type(randString(10, 20));
        bean.setSupport_download(false);
        bean.setTags(list);
        bean.setTable(randString(10, 20));
        bean.setUpdate_timestamp(randLong(1111111111111L, Long.MAX_VALUE));
        bean.setViews(randLong(111111L, Long.MAX_VALUE));
        bean.setYoutube_id(randString(10, 20));
        bean.setSubscription_id(randString(10, 20));
        bean.setDelete_timestamp(randLong(111111L, Long.MAX_VALUE));
        bean.setDeleted_reason(randString(10, 20));
        bean.setDeleted_user(randString(10, 20));
        bean.setType(randString(10, 20));
        bean.setRecommend_text(randString(10, 20));
        bean.setSubtitle(randString(10, 20));
        bean.setEncrypted(true);
        bean.setSource_channel_description(randString(10, 20));
        bean.setSi(randString(10, 20));
        bean.setSource_id(randString(10, 20));
        bean.setStyle(randString(10, 20));
        bean.setFull_movie_id(randString(10, 20));
        bean.setQuality_tags(list);
        bean.setDirectors(list);
        bean.setActors(list);
        bean.setChannels(list);
        bean.setProvinces(list);
        bean.setSeries_id(randString(10, 20));
        bean.setSource_name(randString(10, 20));
        bean.setYoutube_channel(randString(10, 20));
        bean.setVersion(randString(10, 20));
        bean.setPublish_user(randString(10, 20));
        bean.setSource_status(randString(10, 20));
        bean.setScore(243.4F);
        bean.setYear(23332);
        bean.setScreen_timestamp(23344354454L);
        bean.setTimeliness(false);
        bean.setUsed(3232);
        bean.setBoost(23);
        bean.setRecommended(true);
        bean.setIs_pay(true);
        bean.setIs_vip_free(false);
        bean.setTransform_hls_count(2132);
        bean.setQuality_score(23342.2F);
        bean.setPublish_timestamp(2323434L);
        bean.setIs_partner_pay(false);
        bean.setIs_direct(true);
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
