package org.zerock.myapp.level2;

public class 멀리_뛰기 {
    public static void main(String[] args) {
        int n = 4;
        long result = solution(n);
        System.out.println("result = " + result); // 5
    }

    public static long solution(int n) {
        long answer = 0;

        int fibo0 = 0;
        int fibo1 = 1;

        for(int i=0; i<n; i++){
            answer = fibo0 + fibo1;

            answer %= 1234567;

            fibo0 = fibo1;
            fibo1 = (int) answer;
        }

        return answer;
    }
}
