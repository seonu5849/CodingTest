package org.zerock.myapp.level1;

public class 시저_암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        String result = solution(s, n);
        System.out.println("result = " + result); // "e F d"
    }

    public static String solution(String s, int n) {
        String answer = "";
        int A = 'A';
        int a = 'a';

        for(int i=0; i<s.length(); i++){
            int ascii = s.charAt(i);

            if(ascii >= 65 && ascii <= 90){
                answer += (char)(A + ((ascii + n - A) % 26));
            }else if(ascii >= 97 && ascii <= 122){
                answer += (char)(a + ((ascii + n - a) % 26));
            }else{
                answer += " ";
            }

        }

        return answer;
    }
}
