package com.shuozi.common;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice(annotations = {RestController.class, Controller.class})
@Log4j2
@ResponseBody
public class CustomExceptionHandler
{
//    Duplicate entry '00000000000000000003' for key 'owner.PRIMARY'
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String>  exceptionHandler(SQLIntegrityConstraintViolationException ex)
    {
        log.info(ex.getMessage());
        if (ex.getMessage().contains("Duplicate entry"))
        {
            String[] split = ex.getMessage().split(" ");
            String s = split[2] +"已经存在了";
            return R.error(s);
        }
        return R.error("系统繁忙");
    }

}
