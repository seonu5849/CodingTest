package org.zerock.myapp.level2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        String s = "cdcd";
        int result = solution(s);
        System.out.println("result = " + result); // 1
    }

    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                Character peek = stack.peek();
                if(s.charAt(i) == peek){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }

        return answer;
    }
}
