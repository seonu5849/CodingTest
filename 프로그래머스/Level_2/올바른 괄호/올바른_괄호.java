package org.zerock.myapp.level2;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
//        String s = "()()";
        String s = "(()()";
        boolean result = solution(s);
        System.out.println("result = " + result); // true
    }

    static boolean solution(String s) {
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                if(arr[i].equals("(")){
                    stack.push(arr[i]);
                }else{
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
