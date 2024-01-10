package org.zerock.myapp.level1;

import java.util.*;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        long n = 118372;
        Solution solution = new Solution();

        long result = solution.solution(n);

        System.out.println("result = " + result);
    }
}

class Solution {
    public long solution(long n){
        StringBuilder sb = new StringBuilder();
        String[] arrStr = String.valueOf(n).split("");
        List<String> list = new ArrayList<>(Arrays.asList(arrStr));

        Collections.sort(list, Collections.<String>reverseOrder());
        list.forEach(str -> sb.append(str));

        return Long.parseLong(sb.toString());
    }
}