package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/20   15:39
 */
@Controller
public class PageController {

    /**
     * 首页跳转
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    /**
     * 跳转其他页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
