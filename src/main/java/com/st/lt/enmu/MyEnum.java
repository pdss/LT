package com.st.lt.enmu;

import lombok.Getter;

@Getter
public enum MyEnum {
    USER_NOT_EXIST(100,"用户不存在")
    ;
    private int code;
    private String msg;
    MyEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
