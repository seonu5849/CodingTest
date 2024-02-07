package org.zerock.myapp.level1;

import java.util.*;
import java.util.stream.Collectors;

public class 명예의_전당1 {
    public static void main(String[] args) {
        int k = 4;
//        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] result = solution(k, score);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // 	[10, 10, 10, 20, 20, 100, 100]
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<score.length; i++){
            queue.add(score[i]);
            if(queue.size() > k){
                queue.poll();
            }
            answer[i] = queue.peek();
        }

        return answer;
    }
}
