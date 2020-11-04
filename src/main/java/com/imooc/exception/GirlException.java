package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/11/4
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
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
