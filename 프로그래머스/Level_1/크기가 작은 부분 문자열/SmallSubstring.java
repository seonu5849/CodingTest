package org.zerock.myapp.level1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class SmallSubstring {

    // 크키가 작은 부분 문자열
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        int result = solution(t, p);
        System.out.println("result = " + result); // 2
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();

        for(int i=0; i<=t.length() - pLength; i++){
            long value = Long.parseLong(t.substring(i, pLength + i));
            if(value <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }
}
