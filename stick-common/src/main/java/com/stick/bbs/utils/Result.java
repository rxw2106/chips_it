package com.stick.bbs.utils;


import com.stick.bbs.exception.ResultCode;
import lombok.Data;

/**
 * 响应数据
 * @param <T>
 */
@Data
public class Result<T> {
    //编码 0表示成功 其他值表示失败
    private int code = 0;
    //消息内容
    private String msg = "success";
    //响应数据
    private T data;

    public static <T> Result<T> ok() {
        return ok(null);
    }

    public static <T> Result<T> ok(T data) {
        Result<T> res = new Result<>();
        res.setData(data);
        return res;
    }

    public static <T> Result<T> error() {
        return error(ResultCode.FAILED);
    }

    public static <T> Result<T> error(String msg) {
        return error(ResultCode.FAILED.getCode(), msg);
    }

    public static <T> Result<T> error(ResultCode resultCode) {
        return error(resultCode.getCode(),resultCode.getMsg());
    }

    public static <T> Result<T> error(int code, String msg) {
        Result<T> res = new Result<>();
        res.setCode(code);
        res.setMsg(msg);
        return res;
    }
}
