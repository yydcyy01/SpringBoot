package com.yydcyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YYDCYY
 * @create 2019-10-11
 */
@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public  String quick(){
        return "你好啊, 羽扬! -- 来自 QuickController 的鼓励";
    }
}
