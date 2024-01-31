package org.zerock.myapp.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 영어_끝말잇기 {
    public static void main(String[] args) {
        int n = 5;
//        String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words = new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//        String[] words = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
        int[] result = solution(n, words);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> duplcate = new HashSet<>();
        int count = 1; // 차례는 기본적으로 첫번째 부터 시작

        // 중복이 아니면서 끝문자가 맞으면 true
        for(int i=0; i<words.length-1; i++){
            if((i+1)%n == 0) { // i는 0부터 시작하기 때문에 차례를 구하기 위해 i+1 로 함.
                count++;
            }

            String endWord = words[i].substring(words[i].length()-1); // 이번 문자의 끝 문자
            String startWord = words[i+1].substring(0,1); // 다음 문자의 첫 문자

            // 지금까지 입력한 단어와 지금 입력하는 단어가 중복되는지 검증, 이번 문자의 끝문자와 다음 문자의 첫문자가 같은지 검증 = 검증이 성공되면 duplicate에 담기
            if(!duplcate.contains(words[i+1]) && endWord.equals(startWord)){
                duplcate.add(words[i]);
            }else{
                // i+2를 한 이유 : i는 현재문자, i+1은 다음문자이다. 조건식에서 다음문자와 현재문자를 검증하면서 다음문자가 문제가 있는지를 검증하는 것이기 때문에, i+1 을 하여 다음 문자를 기준으로 한다.
                answer[0] = (i+2)%n==0?n:(i+2)%n;
                answer[1] = count;
                break;
            }
        }


        return answer;
    }
}
