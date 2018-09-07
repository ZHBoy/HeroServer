package com.hao.m.controller;

import com.hao.m.domain.ZhUserEntity;
import com.hao.m.enums.ResultEnum;
import com.hao.m.respository.UserRepository;
import com.hao.m.service.UserService;
import com.hao.m.utils.Result;
import com.hao.m.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "/user", description = "用户相关")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    /**
     * 查询所有数据
     * @return
     */
    @ApiOperation(value="获取所有用户")
    @PostMapping(value = "/query/all")
    public Result<List<ZhUserEntity>> getUserList(){
        return ResultUtil.success(userRepository.findAll());
    }


    /**
     * 添加一个用户
     * @return
     */
    @ApiOperation(value="添加用户")
    @PostMapping(value = "/insert/one")
    public Result<ZhUserEntity> insertUser(@RequestBody ZhUserEntity json){

//        ZhUserEntity zhUser = new ZhUserEntity();
//        zhUser.setUserName(json);

        return ResultUtil.success(userRepository.save(json));
    }



    /**
     * 根据用户名删除一个用户
     * @param userName
     * @return
     */
    @ApiOperation(value="根据用户名删除一个用户")
    @PostMapping(value = "/delete/one")
    public Result<Integer> deleteScheduleById(
            @RequestParam(value = "userName",required = false) String userName){

        if (userName == null || userName.isEmpty()){
            return ResultUtil.error(ResultEnum.USER_NAME_NULL_ERROR.getCode(),ResultEnum.USER_NAME_NULL_ERROR.getMsg());
        }

        userRepository.delete(0);

        return ResultUtil.success(1);
    }

}
