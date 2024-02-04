package org.zerock.myapp.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억_점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] result = solution(name, yearning, photo);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result)); // [19, 15, 6]
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = arrayToMap(name, yearning);

        for(int i=0; i<photo.length; i++){
            int score = 0;
            for(int j=0; j<photo[i].length; j++){
                String photoName = photo[i][j];
                if(map.containsKey(photoName)) {
                    score += map.get(photoName);
                }
            }
            answer[i] = score;
        }


        return answer;
    }

    public static Map<String, Integer> arrayToMap(String[] name, int[] yearning) {
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]);
        }

        return map;
    }
}
