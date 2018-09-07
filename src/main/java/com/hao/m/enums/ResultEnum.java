package com.hao.m.enums;

public enum  ResultEnum {
    UNKNOW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),

    PARAM_NULL_ERROR(3,"参数不正确"),
    DEPARTMENT_NULL_ERROR(4,"部门编号不能为空"),
    USER_NAME_NULL_ERROR(5,"用户名不能为空"),
    USER_NAME_OR_PASSWORD_ERROR(6,"用户名或密码错误"),
    USER_CODE_NULL_ERROR(7,"用户ID不能为空"),
    USER_CODE_OR_ORG_CODE_NULL_ERROR(8,"用户ID或部门编号为空"),
    USER_AUTHOR_CODE_NULL_ERROR(9,"设备编号不能为空"),

    ;
    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
