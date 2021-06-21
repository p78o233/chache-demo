package com.example.chachedemo.service;

import com.example.chachedemo.entity.po.Test;

public interface TestService {
    public Test getTestById(int id);

    public Test updateTest(Test test);

    public void deleteTest(int id);
}
