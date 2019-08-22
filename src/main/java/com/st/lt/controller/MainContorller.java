package com.st.lt.controller;

import com.st.lt.enmu.MyEnum;
import com.st.lt.entity.User;
import com.st.lt.exception.MyException;
import com.st.lt.mapper.UserMapper;
import com.st.lt.result.ResultVO;
import com.st.lt.service.UserService;
import com.st.lt.service.impl.UserServiceImpl;
import com.st.lt.util.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-21 09:40
 * @Description:
 */
@RestController
public class MainContorller {
    @Autowired
    UserServiceImpl service;
    @GetMapping("/")
    public ResultVO test(){
        return ResultVOUtil.success(service.getAllUser());
    }
    @GetMapping("/1")
    public ResultVO test1(){
        throw new MyException(MyEnum.USER_NOT_EXIST);
    }
    @GetMapping("/2")
    public ResultVO test2(){
       int i = 1/0;
       return new ResultVO();
    }
}
