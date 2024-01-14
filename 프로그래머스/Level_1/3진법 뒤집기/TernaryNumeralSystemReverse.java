package org.zerock.myapp.level1;

public class TernaryNumeralSystemReverse {
    public static void main(String[] args) {
        int n = 45;
        int result = TernaryNumeralSystemReverse.solution(n);
        System.out.println("result = " + result);
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            sb.append(n%3);
            n = n/3;
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}
