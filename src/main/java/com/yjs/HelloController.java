package com.yjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by song-pc on 2017/10/10.
 */
@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Autowired
    private Girl girl;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        //return cupSize;
        return "大小：" + girl.getCupSize() + " 年龄：" + girl.getAge();
    }
}
