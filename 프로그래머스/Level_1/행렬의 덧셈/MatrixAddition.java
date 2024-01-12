package org.zerock.myapp.level1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1,2}, {2,3}};
        int[][] arr2 = new int[][]{{3,4}, {5,6}};
//        int[][] arr1 = new int[][]{{1},{2}};
//        int[][] arr2 = new int[][]{{3},{4}};
        int[][] result = MatrixAddition.solution(arr1, arr2);
        System.out.println("result = " + Arrays.deepToString(result));

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];
        for(int i=0; i<arr1.length; i++){
            int[] arrr1 = arr1[i];
            int[] arrr2 = arr2[i];
            answer[i] = new int[arrr1.length];
            for(int j=0; j<arrr1.length; j++){
                answer[i][j] = arrr1[j] + arrr2[j];
            }
        }

        return answer;
    }
}
