package com.st.lt.result;

import lombok.Data;

import javax.annotation.security.DenyAll;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-23 00:24
 * @Description:
 */
@Data
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;
}
