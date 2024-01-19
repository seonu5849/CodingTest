package org.zerock.myapp.level2;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
//        String s = "3people unFollowed me";
        String s = " A  sdf fFt ";
        String result = solution(s);
        System.out.println("result = " + result); // "3people Unfollowed Me"
    }

    public static String solution(String s) {
        String answer = "";
        
        String[] arr = s.toLowerCase().split(" ", -1);
        
        for(int i=0; i< arr.length; i++){
            System.out.println("arr[i] = " + arr[i]);
            if(arr[i].length() == 0) {
                answer+= " ";
            }else{
                String s1 = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                answer = answer + s1 + " ";
            }
        }

        return "|"+answer.substring(0, answer.length()-1)+"|";
    }
}
