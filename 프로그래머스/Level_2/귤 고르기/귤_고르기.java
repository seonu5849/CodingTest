package org.zerock.myapp.level2;

import java.util.*;
import java.util.stream.Collectors;

public class 귤_고르기 {
    public static void main(String[] args) {
        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
//        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
//        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
        int result = solution(k, tangerine);
        System.out.println("result = " + result); // 3
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum  = 0;
        List<Integer> list = countDuplicates(tangerine);
        list.sort(Collections.reverseOrder());

        for (Integer num : list) {
            answer++;
            sum += num;
            if(k <= sum){
                break;
            }
        }

        return answer;
    }

    private static List<Integer> countDuplicates(int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for (Integer num : map.keySet()) {
            list.add(map.get(num));
        }
        return list;
    }
}
