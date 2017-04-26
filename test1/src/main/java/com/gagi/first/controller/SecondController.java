package com.gagi.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GaGi on 2017/4/26.
 */

@Controller
public class SecondController {
    @RequestMapping("/queryMap.action")
    public ModelAndView queryMap(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","1");
        map.put("2","2");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(map);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
