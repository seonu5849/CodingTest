package org.zerock.myapp.level1;

import java.util.*;
import java.util.stream.Collectors;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        String s = "banana";
        int[] result = solution(s);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // [-1, -1, -1, 2, 2, 2]
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            System.out.println("lastIndexMap = " + lastIndexMap);
            if(lastIndexMap.containsKey(s.charAt(i))){
                System.out.println("s.charAt(i) = " + s.charAt(i));
                System.out.println("lastIndexMap = " + lastIndexMap.get(s.charAt(i)));
                System.out.println("i = " + i);
                answer[i] = i - lastIndexMap.get(s.charAt(i));
            }else{
                answer[i] = -1;
            }
            lastIndexMap.put(s.charAt(i), i);

        }
//        System.out.println("lastIndexMap = " + lastIndexMap);

        return answer;
    }
}
