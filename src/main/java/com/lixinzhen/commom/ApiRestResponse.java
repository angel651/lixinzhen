package com.lixinzhen.commom;

import com.lixinzhen.Exception.ExceptionEnum;

/**
 * 描述     通用返回对象
 *
 * @author lixinzhen
 * @create 2021/9/15 10:43
 */
public class ApiRestResponse<T> {
    /**
     * 状态码
     */
    private Integer status;
    /**
     * 信息
     */
    private String msg;
    /**
     * 泛型对象
     */
    private T data;
    /**
     * 状态正常
     */
    private static final int OK_CODE = 10000;
    /**
     * 信息成功
     */
    private static final String  OK_MSG = "SUCCESS";

    public ApiRestResponse(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ApiRestResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ApiRestResponse() {
        this(OK_CODE,OK_MSG);
    }

    /**
     * 请求成功的时候调用该方法,返回状态和信息
     * @param <T>
     * @return
     */
    public static <T> ApiRestResponse<T> success(){
        return new ApiRestResponse<>();
    }

    /**
     * 返回请求成功后的数据
     * @param result
     * @param <T>
     * @return
     */
    public static <T> ApiRestResponse<T> success(T result){
        ApiRestResponse<T> response = new ApiRestResponse<>();
        response.setData(result);
        return response;
    }

    /**
     * 返回请求错误
     * @param code
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ApiRestResponse<T> error(Integer code,String msg){
        return new ApiRestResponse<>(code,msg);
    }

    /**
     * 通过异常枚举获取错误信息
     * @param ex
     * @param <T>
     * @return
     */
    public static <T> ApiRestResponse<T> error(ExceptionEnum ex){
        return new ApiRestResponse<>(ex.getCode(),ex.getMsg());
    }

    @Override
    public String toString() {
        return "ApiRestResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static int getOkCode() {
        return OK_CODE;
    }

    public static String getOkMsg() {
        return OK_MSG;
    }
}

