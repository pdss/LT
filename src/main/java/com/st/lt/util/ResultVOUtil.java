package com.st.lt.util;

import com.st.lt.DTO.MyTest;
import com.st.lt.enmu.MyEnum;
import com.st.lt.result.ResultVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-23 00:43
 * @Description:
 */
public class ResultVOUtil {
    public static ResultVO error(int code,String msg){

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        MyTest sadas = new MyTest(1, "sadas");
        MyTest dqwdq = new MyTest(2, "dqwdq");
        MyTest asda = new MyTest(3, "asda");
        List<MyTest> list = new ArrayList<>();
        list.add(sadas);
        list.add(dqwdq);
        list.add(asda);
        resultVO.setData(list);
        return resultVO;
    }
    public static ResultVO success(List list){
        ResultVO<Object> objectResultVO = new ResultVO<>();
        objectResultVO.setCode(1);
        objectResultVO.setMsg("成功");
        objectResultVO.setData(list);
        return objectResultVO;
    }
}
