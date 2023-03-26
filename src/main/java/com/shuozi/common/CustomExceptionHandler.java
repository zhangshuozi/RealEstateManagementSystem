package com.shuozi.common;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R<String[]> exceptionHandler(MethodArgumentNotValidException ex)
    {
        log.info(ex.getMessage());
        String str = ex.getMessage();
//        存储报错中文数据
        StringBuilder s  = new StringBuilder();
        int count =0;

        //第一种方法
        char[] chars = str.toCharArray();

        int[] sit = new int[chars.length];
        int frontLength = 0;//定义该变量用于记录匹配"~"的元素前面的长度
        while(str.contains("~")){//只要该str字符串中有匹配"~"的元素，才进行以下操作
            int index = str.indexOf("~");//定义该变量用于记录匹配"~"的元素在当前字符串的位置
            //匹配"~"的元素位置等于frontLength加上index；加1为了从1开始计数，更加直观：  index+frontLength+1为所在的位置
            sit[count] =index+frontLength+1;
            ++count;

            if (count == 2)
            {
                for (int i = sit[0] ;i<=sit[1];i++) {
                    s.append(chars[0]++);
                }
                s.append("|");
            }
            frontLength += (index + 4);
            str = str.substring(index + 4);//将字符串中匹配"~"元素的前面部分及其本身截取，留下后面的部分
        }
        System.out.println(s);

        return null;
    }



//    public class GetStrPosition {
//        public static void main(String[] args) {
//
//
//            //第二种方法
//            String str_2 = "I love Java I love Python I love Internet";
//            String[] strArr = str_2.split(" ");
//            for (int i = 0; i < strArr.length; i++) {
//                if(strArr[i].equals("love")){
//                    int frontLength_2 = 0;//定义该变量用于记录匹配"love"的元素前面的长度
//                    for(int j = 0; j < i; j++){
//                        frontLength_2 += strArr[j].length();
//                    }//该循环是为了加上前面数组元素的长度
//                    frontLength_2 += i;//加上前面空格的个数
//                    //加1是因为，在数组中匹配该"love"元素的位置，并不仅仅只是前面所有元素的长度加上空格个数，还得算上该元素本身出现的位置
//                    System.out.println(String.format("str[%d] = love", frontLength_2 + 1));
//                }
//            }
//        }
//    }






}
