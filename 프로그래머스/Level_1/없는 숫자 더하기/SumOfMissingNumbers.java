package org.zerock.myapp.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfMissingNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,6,7,8,0};
        SumOfMissingNumbers solution = new SumOfMissingNumbers();
        int result = solution.solution(numbers);// 14
        System.out.println("result = " + result);
    }

    public int solution(int[] numbers) {
        /*int answer = 0;

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
        }*/

        /*
        * 리펙토링 - 람다
        * rangeClosed()은 IntStream 인터페이스에서 제공하는 메서드 중 하나, 시작값과 종료값을 포함한 범위의 정수 스트림 생성
        * noneMatch() 메서드는 stream 인터페이스에서 제공하는 메소드 중 하나, stream의 값과 비교하는 값(num)이 다르다면 true, 같다면 false를 출력한다.
        */
        int answer = IntStream.rangeClosed(0,9)
                .filter(num -> Arrays.stream(numbers).noneMatch(value -> num == value))
                .sum();

        return answer;
    }
}