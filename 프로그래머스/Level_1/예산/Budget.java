package org.zerock.myapp.level1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int[] d = new int[]{1,3,2,5,4};
        int budget = 9;
        int result = solution(d, budget);
        System.out.println("result = " + result);
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        
        for(int i : d){
            sum += i;
            if(sum <= budget){
                answer++;
            }else{
                break;
            }
        }

        return answer;
    }
}
