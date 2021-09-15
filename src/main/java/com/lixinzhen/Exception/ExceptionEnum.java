package com.lixinzhen.Exception;

/**
 * 描述     异常枚举
 *
 * @author lixinzhen
 * @create 2021/9/15 10:23
 */
public enum ExceptionEnum {
    NEED_USER_NAME(10001,"用户名不能为空"),
    NEED_PASSWORD(10002,"密码不能为空"),
    NEED_PASSWORD_TO_SHORT(10003,"密码不能少于8位"),
    NAME_EXISTED(10004,"不能重名，注册失败"),
    INSERT_FAILED(10005,"插入失败，请重试"),
    WRONG_PASSWORD(10006,"密码错误");
    /**
     * 异常码
     */
    Integer code;
    /**
     * 异常信息
     */
    String msg;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
