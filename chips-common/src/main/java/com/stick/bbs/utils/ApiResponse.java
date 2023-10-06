package com.stick.bbs.utils;


import com.stick.bbs.exception.ResponseCode;
import lombok.Data;

/**
 * 响应数据
 * @param <T>
 */
@Data
public class ApiResponse<T> {
    //编码 0表示成功 其他值表示失败
    private int code = ResponseCode.SUCCESS.getCode();
    //消息内容
    private String msg = ResponseCode.SUCCESS.getMsg();
    //响应数据
    private T data;

    public static <T> ApiResponse<T> success() {
        return success(null);
    }

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> res = new ApiResponse<>();
        res.setData(data);
        return res;
    }

    public static <T> ApiResponse<T> fail() {
        return fail(ResponseCode.FAILED);
    }

    public static <T> ApiResponse<T> fail(String msg) {
        return fail(ResponseCode.FAILED.getCode(), msg);
    }

    public static <T> ApiResponse<T> fail(ResponseCode responseCode) {
        return fail(responseCode.getCode(),responseCode.getMsg());
    }

    public static <T> ApiResponse<T> fail(int code, String msg) {
        ApiResponse<T> res = new ApiResponse<>();
        res.setCode(code);
        res.setMsg(msg);
        return res;
    }
}
