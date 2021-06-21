package com.example.chachedemo.service.impl;

import com.example.chachedemo.entity.po.Test;
import com.example.chachedemo.mapper.TestMapper;
import com.example.chachedemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
//    如果没有设置key值的话，就会默认使用参数作为key值
//    @Cacheable(cacheNames = "getTestById")
    @Cacheable(cacheNames = "getTestById",key = "#id")
    public Test getTestById(int id) {
        System.out.println("查询" + id + "号员工");
        return testMapper.getTestById(id);
    }

//    一定需要key值
    @Override
    @CachePut(cacheNames = "getTestById", key = "#test.id")
    public Test updateTest(Test test) {
        testMapper.updateTestById(test);
//        return 值一定得要是查询接口的返回值，不然缓存是失效然后报错
        return testMapper.getTestById(test.getId());
    }

    @Override
    @CacheEvict(cacheNames = "getTestById", key = "#id")
    public void deleteTest(int id) {
//        这样缓存被清为一个null 的对象
        testMapper.deleteTestById(id);
    }
}
