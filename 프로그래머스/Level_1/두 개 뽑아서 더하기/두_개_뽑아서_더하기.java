package org.zerock.myapp.level1;

import java.util.*;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,0,2,7};
        int[] result = solution(numbers);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // [2,3,4,5,6,7]
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>(); // 정렬을 위해 TreeSet 사용

        for(int i=0; i<numbers.length; i++){ // 두 값을 더하고 set에 저장
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = setToArray(set);
        return answer;
    }

    public static int[] setToArray(Set<Integer> set){
        int[] result = new int[set.size()];
        int i=0;

        for (Integer number : set) {
            result[i] = number;
            i++;
        }

        return result;
    }
}
