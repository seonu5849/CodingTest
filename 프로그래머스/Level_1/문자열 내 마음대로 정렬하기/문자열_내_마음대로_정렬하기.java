package org.zerock.myapp.level1;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
//        String[] strings = new String[]{"sun", "bed", "car"};
        String[] strings = new String[]{"abce", "abcd", "cdx"};
//        String[] strings = new String[]{"abc", "ab"};
//        String[] strings = new String[]{"bc", "bcb"};
        int n = 1;
        String[] result = solution(strings, n);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] strArr = new String[strings.length];

        for(int i=0; i<strings.length; i++){
            strArr[i] = strings[i].charAt(n) + strings[i];
        }
        sort(strArr);
        for(int i=0; i< strArr.length; i++){
            answer[i] = strArr[i].substring(1);
        }

        return answer;
    }

    public static void sort(String[] arr){ // 버블 정렬

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].compareTo(arr[j]) >= 0 ) {
                    change(arr, i, j);
                }
            }
        }
    }

    private static void change(String[] strings, int i, int j) {
        String temp = strings[j];
        strings[j] = strings[i];
        strings[i] = temp;
    }
}
