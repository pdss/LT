package com.st.lt.DTO;

import lombok.Data;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-23 00:47
 * @Description:
 */
@Data
public class MyTest {
    private int id;
    private String name;
    public MyTest(int id,String name){
        this.id = id;
        this.name = name;
    }
}
