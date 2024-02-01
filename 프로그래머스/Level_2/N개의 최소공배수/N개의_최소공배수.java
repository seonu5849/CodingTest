package org.zerock.myapp.level2;

public class N개의_최소공배수 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,8,14};
        int result = solution(arr);
        System.out.println("result = " + result); // 168
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int n = arr[0]; // 처음 초기값 arr의 첫번쨰 원소로 초기화
        int m = 0;

        for(int i=0; i<arr.length-1; i++){
            m = arr[i+1];

            int gcd = gcdMethod(n, m);
            n = n * m / gcd; // LCD (최소공배수)를 n에 담음
        }

        answer = n; // 최종적으로 나온 n = LCD

        return answer;
    }

    // 유클리드 호제법을 사용한 GCD(최대공약수) 공식
    public static int gcdMethod(int n, int m){
        int gcd = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0 && m%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
