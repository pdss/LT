package com.st.lt.exception;

import com.st.lt.result.ResultVO;
import com.st.lt.util.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: luotao
 * @CreateTime: 2019-08-23 00:36
 * @Description:
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandle{
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO exceptionHandle(Exception e){
        if(e instanceof MyException){

            log.warn("异常码{}，异常信息{}",((MyException) e).getCode(),((MyException) e).getMessage());
            return ResultVOUtil.error(((MyException) e).getCode(), ((MyException) e).getMessage());
        }
        log.error("系统异常{}",e.getMessage());
        return ResultVOUtil.error(-1, "服务器异常");
    }
}
