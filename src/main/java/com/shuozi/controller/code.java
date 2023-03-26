package com.shuozi.controller;

public class code
{
    public static void main(String[] args) {
        String str = "dqwk[podkqw[dopkqw[p~对了~dqw0podkqwopkdqw";
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
    }
}
