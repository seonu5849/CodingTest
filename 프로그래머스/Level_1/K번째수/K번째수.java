package org.zerock.myapp.level1;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2,5,3},{4,4,1},{1,7,3}};
        int[] result = solution(array, commands);
        System.out.println("result = " + Arrays.toString(result)); // 	[5, 6, 3]
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int a=0; a<commands.length; a++){
            int[] command = commands[a];
            int i = command[0]; // i ~ k 선언
            int j = command[1];
            int k = command[2];
            int[] arr = new int[j-i+1];

            int cnt = 0;
            for(int b=i; b<=j; b++){ // i~k까지의 숫자 담기
                arr[cnt] = array[b-1];
                cnt++;
            }
//            Arrays.sort(arr); // 정렬
            int[] result = sort(arr); // 버블 정렬 알고리즘 사용
            answer[a] = result[k-1]; // k 번째에 있는 숫자를 answer에 담기
        }

        return answer;
    }

    public static int[] sort(int[] arr){ // 버블 정렬

        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }
}
