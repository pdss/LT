package com.st.lt.exception;

import com.st.lt.enmu.MyEnum;
import lombok.Data;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-23 00:25
 * @Description:
 */
@Data
public class MyException extends RuntimeException {
    private int code;

    public MyException(MyEnum myEnum){
        super(myEnum.getMsg());
        this.code = myEnum.getCode();
    }
}
