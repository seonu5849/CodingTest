package org.zerock.myapp.level1;

import java.util.Arrays;

// 삼총사
public class ThreeMusketeers {
    public static void main(String[] args) {
//        int[] number = new int[]{-2, 3, 0, 2, -5};
//        int[] number = new int[]{-1, 1, -1, 1};
        int[] number = new int[]{-3, -2, -1, 0, 1, 2, 3};
        int result = solution(number);
        System.out.println("result = " + result); // 2
    }

    public static int solution(int[] number) {
        int answer = 0;

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        for(int i=0; i<number.length-2; i++){
            System.out.println("number[i] = " + number[i]);
            for(int j=i+1; j<number.length-1; j++){
                System.out.println("\tnumber[j] = " + number[j]);
                for(int k=j+1; k<number.length; k++){
                    System.out.println("\t\tnumber[k] = " + number[k]);
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
