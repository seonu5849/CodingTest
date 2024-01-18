package org.zerock.myapp.level2;

// 최대값과 최솟값
public class MaximumAndMinimum {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String result = solution(s);
        System.out.println("result = " + result);
    }

    public static String solution(String s) {
        String[] strArr = s.split(" ");
        int max = 0;
        int min = 0;
        min = max = Integer.parseInt(strArr[0]); // min과 max를 배열의 초기값으로 설정
        for(int i=0; i< strArr.length; i++){
            int num = Integer.parseInt(strArr[i]);
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            System.out.println("max= "+max+", min = "+min);
        }

        return min + " " + max;
    }
}
