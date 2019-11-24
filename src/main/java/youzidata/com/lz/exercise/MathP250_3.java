package youzidata.com.lz.exercise;

import java.util.Arrays;
import java.util.List;

public class MathP250_3 {
    // 有多少个十进制三位数的数字恰有一个5和一个7？
    public static void main(String[] args) {
        int total = 0;
        for (int i = 100; i < 1000; i++) {
            String s = String.valueOf(i);
            char[] chars = s.toCharArray();
            int num5 = 0;
            int num7 = 0;
            for (int j = 0; j < chars.length; j++) {
                // '0'=48, '5'=53, '7'=55, '8'=56. '9'=57
                if (chars[j] == 56)
                    num5++;
                if (chars[j] == 57)
                    num7++;
            }
            if(num5 == 1 && num7 == 1){
                System.out.println(i);
                total++;
            }
        }
        System.out.println(total);
    }
}
