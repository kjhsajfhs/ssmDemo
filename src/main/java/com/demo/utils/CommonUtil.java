package com.demo.utils;


import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;

import java.util.Map;

public class CommonUtil {
	public static final String SUCCESS = "0000";
    public static final String FAILED = "1111";
    public static final String WIRTER_JSON="application/json;charset=UTF-8";
    public static final String WIRTER_PLAIN="text/plain;charset=UTF-8";
    public static final String WIRTER_HTML="text/html;charset=UTF-8";
    public static final String PASSWD="a888888@a88888888@a12345678@a1234567@a123456789@a888888888@a8888888888";

    /**
     * 显示到页面-成功
     * @author  Xiangzhu_fu
     * @version  2016-11-29
     * @param msg
     * @param data
     * @return
     */
    public static Map<String,Object> responseSuccess( String msg, Object data) {
    	Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", SUCCESS);
        jo.put("msg", msg);
        jo.put("data", data);
        return jo;
    }

    /**
     * 显示到页面-成功2
     */
    public static Map<String,Object> responseSuccess2( String msg, Object data) {
    	Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", "2222");
        jo.put("msg", msg);
        jo.put("data", data);
        return jo;
    }

    public static Map<String,Object> responseSuccess( String msg) {
        Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", SUCCESS);
        jo.put("msg", msg);
        jo.put("data", "");
        return jo;
    }

    public static Map<String,Object> responseSuccess(Object data) {
        Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", SUCCESS);
        jo.put("msg", "成功");
        jo.put("data", data);
        return jo;
    }
    /**
     * 响应到页面-失败
     * @author  Xiangzhu_fu
     * @version  2016-11-29
     * @param msg
     * @param data
     * @return
     */
    public static Map<String,Object> responseError( String msg, Object data) {
    	Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", FAILED);
        jo.put("msg", msg);
        jo.put("data", data);
        return jo;
    }

    public static Map<String,Object> responseError( String msg) {
        Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", FAILED);
        jo.put("msg", msg);
        jo.put("data", "");
        return jo;
    }

    public static Map<String,Object> responseError(Object data) {
        Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", FAILED);
        jo.put("msg", "失败");
        jo.put("data", data);
        return jo;
    }

    public static Map<String,Object> responseException() {
        Map<String,Object> jo = new HashMap<String,Object>();
        jo.put("code", FAILED);
        jo.put("msg", "系统出现异常，请联系管理员");
        return jo;
    }



    public static HttpServletRequest getRequst() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

}