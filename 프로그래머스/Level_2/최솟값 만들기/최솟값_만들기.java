package org.zerock.myapp.level2;

import java.util.*;

public class 최솟값_만들기 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 4, 2};
        int[] B = new int[]{5, 4, 4};
        int result = solution(A, B);
        System.out.println("result = " + result); // 29
    }

    public static int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        List<Integer> reverse = new ArrayList<>();

        for(int i=B.length-1; i>=0; i--){
            reverse.add(B[i]);
        }

        for(int i=0; i<A.length; i++){
            answer += A[i] * reverse.get(i);
        }
        return answer;
    }
}
