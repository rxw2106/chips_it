package com.stick.bbs.exception;

import lombok.Getter;

@Getter
public enum ResponseCode {
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAILED(501,"参数校验失败"),
    ERROR(502,"未知错误"),
    ERROR_LOGIN_NOT_EMPTY(510,"账号或密码不能为空"),
    ERROR_LOGIN_LOCK(511,"密码输错次数过多,已被锁定30分钟");


    private final Integer code;
    private final String msg;

    ResponseCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
