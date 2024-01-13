package org.zerock.myapp.level1;

import java.util.Arrays;

public class GCDAndLCM {
    public static void main(String[] args) { // 최대공약수와 최소공배수
        int n = 11;
        int m = 15;
        int[] result = solution(n, m);
        System.out.println("result = " + Arrays.toString(result)); // [1, 10]
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = 0;
        int lcd = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0 && m%i==0){
                System.out.println("i = " + i);
                gcd = i;
            }
        }
        lcd = n * m / gcd;
        answer[0] = gcd;
        answer[1] = lcd;
        return answer;
    }

}
