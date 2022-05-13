package com.example.businessintelligence.contoller;

import cn.dev33.satoken.util.SaResult;
import com.example.businessintelligence.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/10 23:36
 * @Version: v1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test1")
    public SaResult test1()
    {
        return SaResult.code(200).setData(testService.test1());
    }

//    @GetMapping("test2")
//    public SaResult test2()
//    {
//        return SaResult.code(200).setData(testService.randomPerson());
//    }
}
