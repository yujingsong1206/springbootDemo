package com.yjs.exception;

/**
 * Created by song-pc on 2017/11/12.
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
