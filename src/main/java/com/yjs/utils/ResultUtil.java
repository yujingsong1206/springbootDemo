package com.yjs.utils;

import com.yjs.domain.Result;

/**
 * Created by song-pc on 2017/11/12.
 */
public class ResultUtil {
    public static Result success(Object object, String msg) {
        Result result = new Result();
        result.setCode(1);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(-1);
        result.setMsg(msg);
        return result;
    }
}
