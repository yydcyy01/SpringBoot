package com.yydcyy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YYDCYY
 * @create 2019-10-13
 */
@Controller
public class Quick2Controller {
    @Value("${name}")
    private String name;

    @Value("${addr}")
    private String addr;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2(){
        return "name : " + name + ", addr = " + addr;
    }
}
