package com.yjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by song-pc on 2017/10/10.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Autowired
    private Girl girl;

    @RequestMapping(value = {"/say", "/hi"}, method = RequestMethod.GET)
    public String say() {
        //return cupSize;
        return "大小：" + girl.getCupSize() + " 年龄：" + girl.getAge();
    }

    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    public String say1(@PathVariable("id") int id) {
        return "id: " + id;
    }

    //@RequestMapping(value = "/say2", method = RequestMethod.GET)
    @GetMapping(value = "/say2")
    public String say2(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "id: " + id;
    }
}
