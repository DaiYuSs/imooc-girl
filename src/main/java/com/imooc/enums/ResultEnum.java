package com.imooc.enums;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/11/4
 */
public enum ResultEnum {

    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    PRIMARY_SCHOOL(100, "小学生禁止入内"),
    MIDDLE_SCHOOL(101, "初中生禁止入内");

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
