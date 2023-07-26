package com.stick.bbs.utils;


import com.stick.bbs.exception.ResultCode;
import lombok.Data;

/**
 * 响应数据
 * @param <T>
 */
@Data
public class ApiResponse<T> {
    //编码 0表示成功 其他值表示失败
    private int code = 0;
    //消息内容
    private String msg = "success";
    //响应数据
    private T data;

    public static <T> ApiResponse<T> ok() {
        return ok(null);
    }

    public static <T> ApiResponse<T> ok(T data) {
        ApiResponse<T> res = new ApiResponse<>();
        res.setData(data);
        return res;
    }

    public static <T> ApiResponse<T> error() {
        return error(ResultCode.FAILED);
    }

    public static <T> ApiResponse<T> error(String msg) {
        return error(ResultCode.FAILED.getCode(), msg);
    }

    public static <T> ApiResponse<T> error(ResultCode resultCode) {
        return error(resultCode.getCode(),resultCode.getMsg());
    }

    public static <T> ApiResponse<T> error(int code, String msg) {
        ApiResponse<T> res = new ApiResponse<>();
        res.setCode(code);
        res.setMsg(msg);
        return res;
    }
}
