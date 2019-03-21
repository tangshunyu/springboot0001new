package com.atguigu.springboot000001.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @Auther: tangshunyu
 * @Date: 2019/3/21
 * @Description:
 * @version: 1.0
 */

@ControllerAdvice
public class exceptionHandlerController {
    @ResponseBody
    @ExceptionHandler({Exception.class})
    public HashMap<String,Object> exceptionHandler(Exception e){
        System.out.println(e.getMessage());
        HashMap<String, Object> errorMsg = new HashMap<>(16);
        errorMsg.put("错误信息",e.getMessage());
        return errorMsg;
    }

}
