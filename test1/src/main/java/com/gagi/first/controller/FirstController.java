package com.gagi.first.controller;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GaGi on 2017/4/26.
 */
public class FirstController implements Controller{
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","haha");
        map.put("2","gaga");
        modelAndView.addObject(map);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
