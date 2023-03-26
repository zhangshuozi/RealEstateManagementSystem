package com.shuozi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RealEstateManagementSystemApplicationTests {

    @Test
    void contextLoads()
    {
        String str ="[-太长了不行的哦 要死掉了呢-]";
        char[] chars = str.toCharArray();
        int[] i = new int[chars.length];
        int count =0;
        StringBuilder s = new StringBuilder();
        int frontLength = 0;//定义该变量用于记录匹配"~"的元素前面的长度
        while(str.contains("-")){//只要该str字符串中有匹配"~"的元素，才进行以下操作
            int index = str.indexOf("-");//定义该变量用于记录匹配"~"的元素在当前字符串的位置
            //匹配"~"的元素位置等于frontLength加上index；加1为了从1开始计数，更加直观：  index+frontLength+1为所在的位置
            System.out.println(index+frontLength+1);
            i[count] = index+frontLength+1;
            count++;
            frontLength += (index + 4);
            str = str.substring(index + 4);//将字符串中匹配"~"元素的前面部分及其本身截取，留下后面的部分
        }

        for (int a : i) {
            System.out.print("i="+a);
        }


        int count1 = 0;
        for (int j = 0; j < i.length; j++) {
                if (j%2 != 0)
                {
//                    i[j-1]  i[j]
                    for (int x = i[j-1];x<=i[j];x++)
                    {
                        s.append(chars[x]);
                    }
                    s.append("|");
                }
        }
        System.out.print(s);
    }

}
