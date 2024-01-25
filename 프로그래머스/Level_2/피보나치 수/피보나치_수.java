package org.zerock.myapp.level2;

public class 피보나치_수 {
//    private static int count;
//    private static int fibonacci;

    public static void main(String[] args) {
        int n = 5;
        int result = solution(n);
        System.out.println("result = " + result); // 2
    }

    public static int solution(int n) {
        int answer = 0;

        int fibonacci_1 = 0;
        int fibonacci_2 = 1;

        for(int i=2; i<=n; i++){
            answer = fibonacci_1 + fibonacci_2;

            answer %= 1234567;

            fibonacci_1 = fibonacci_2;
            fibonacci_2 = answer;
        }

        return answer;
    }
}
