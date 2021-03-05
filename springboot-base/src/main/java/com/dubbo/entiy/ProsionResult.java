package com.dubbo.entiy;

import java.io.Serializable;

/**
 * @program: springbootdubbonocas
 * @description: 返回结果类
 * @author: JH
 * @create: 2021-03-04 17:26
 */
public class ProsionResult<T> implements Serializable {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private String message;
    private T data;

    public ProsionResult(){}

    private ProsionResult(ProsionResult<T> result){
        this.code=result.code;
        this.message=result.message;
        this.data=result.data;
    }

    public static class Builder<T>{
        private ProsionResult<T> result;
        public Builder(){
            result=new ProsionResult<>();
        }
        public Builder code(int code){
            result.code=code;
            return this;
        }
        public Builder message(String massage){
            result.message=massage;
            return this;
        }
        public Builder data(T data){
            result.data=data;
            return this;
        }
        public ProsionResult<T> build(){
            return new ProsionResult<>(result);
        }
    }
}