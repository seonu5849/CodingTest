package org.zerock.myapp.level2;

public class 다음_큰_숫자 {
    private int count;

    public static void main(String[] args) {
        int n = 78;
        int result = solution(n);
        System.out.println("result = " + result); // 83
    }

    public static int solution(int n) {
        int answer = 0;

        int criteria = binaryOfOne(n);
        int comparative = 0;
        int increase = n+1;

        while (true) {
            comparative = binaryOfOne(increase);

            if (criteria == comparative) {
                answer = increase;
                break;
            }

            increase++;
        }

        return answer;
    }

    public static int binaryOfOne(int n){
        int count = 0;
        String binary = Integer.toString(n, 2);
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
