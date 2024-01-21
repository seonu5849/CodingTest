package org.zerock.myapp.level2;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
//        String s = "()()";
        String s = "(((())))()";
        boolean result = solution(s);
        System.out.println("result = " + result); // true
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                }else{
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
