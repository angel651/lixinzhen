package com.lixinzhen.Exception;

/**
 * 描述     统一异常
 *
 * @author lixinzhen
 * @create 2021/9/15 10:32
 */
public class UserException extends Exception{
    private final Integer code;
    private final String message;

    public UserException (Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public UserException(ExceptionEnum exceptionEnum){
        this(exceptionEnum.getCode(),exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
