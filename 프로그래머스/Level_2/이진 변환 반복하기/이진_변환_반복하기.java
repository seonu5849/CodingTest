package org.zerock.myapp.level2;

import java.util.Arrays;

public class 이진_변환_반복하기 {

    private static int zeroCnt;
    private static int loopCount;

    public static void main(String[] args) {
        String s = "110010101001";
        int[] result = solution(s);
        System.out.println("result = " + Arrays.toString(result)); //[3,8]
    }

    // [1이 될때까지의 과정횟수, 제거한 0의 개수]
    public static int[] solution(String s) {
        int[] answer = new int[2];

        toBinary(s);
        answer[0] = loopCount;
        answer[1] = zeroCnt;

        return answer;
    }

    public static String toBinary(String s){
        if(s.equals("1")){ // 재귀함수를 통해 만약 s의 값이 "1" 이 되면 루프를 종료하도록 하는 코드
            return "";
        }

        int zeroCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                zeroCount++;
            }
        }

        int oneLength = s.length() - zeroCount; // 1의 개수
        zeroCnt += zeroCount; // 총 0의 개수
        loopCount++; // 1이 될때까지 진행된 횟수

        return toBinary(Integer.toBinaryString(oneLength));
    }
}
