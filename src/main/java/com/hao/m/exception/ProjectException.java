package com.hao.m.exception;

import com.hao.m.enums.ResultEnum;

public class ProjectException extends RuntimeException {

    private Integer code;

    public ProjectException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
