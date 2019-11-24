package youzidata.com.lz.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MathP250_5 {
    public static void main(String[] args) {
//        // 从集合{1，2，…，9}中选取不同数字构成七位数，如果5和6不相邻，则有多少种方法？
//        Character[] ia = {'1','2','3','4','5','6','7','8','9'};
//        Set<Character> sc = new HashSet<>();
////        List<Character> characters = Arrays.asList(ia);
//        for (int i = 0; i < ia.length-2; i++) {
//            if(sc.size() < 7){
//                sc.add(ia[i]);
//            }
//        }
//        long i = 9*8*7*6*5*4*3-7*6*5*4*3*2;
        long i = 9*8*7*6*5*4*3-7*6*5*4*3*2*6*5*4*3*2*1;
//        long i = 7*7*6*5*4*3*2;
//        long i = 120*120*120-2*120*120+2*120;
        System.out.println(i);
    }
}
