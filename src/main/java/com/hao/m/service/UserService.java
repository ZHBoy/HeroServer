package com.hao.m.service;


import com.hao.m.domain.ZhUserEntity;
import com.hao.m.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void insertTwo() {


    }

    public ZhUserEntity getAge(Integer id) throws Exception {

        ZhUserEntity userEntity = userRepository.findOne(id);
        return userEntity;

    }
}