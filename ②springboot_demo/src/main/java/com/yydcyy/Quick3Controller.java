package com.yydcyy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YYDCYY
 * @create 2019-10-13
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {

    private String name;
    private String age;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }



    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
        return "Quick3Controller{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", addr='" + addr + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
