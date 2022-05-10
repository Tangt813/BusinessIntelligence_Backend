package com.example.businessintelligence.service.serviceImpl;

import com.example.businessintelligence.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TestServiceImpl
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/10 23:36
 * @Version: v1.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test1() {

        return "hello world";

    }
}
