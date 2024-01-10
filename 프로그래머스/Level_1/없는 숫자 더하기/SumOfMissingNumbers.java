package org.zerock.myapp.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfMissingNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,6,7,8,0};
        SumOfMissingNumbers solution = new SumOfMissingNumbers();
        int result = solution.solution(numbers);// 14
        System.out.println("result = " + result);
    }

    public int solution(int[] numbers) {
        int answer = 0;

        for(int i=0; i<=9; i++){
            boolean found = false;

            for(int number : numbers){
                if(number == i){
                    found = true;
                    break;
                }
            }

            if(!found){
                answer+=i;
            }
        }

        return answer;
    }
}