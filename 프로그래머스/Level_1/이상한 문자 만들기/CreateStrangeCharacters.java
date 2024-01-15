package org.zerock.myapp.level1;

public class CreateStrangeCharacters {
    public static void main(String[] args) {
        String s = "           try hello world              ";
        String result = solution2(s);
        testResult(result);
    }

    public static String solution2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arrary = s.split(" ",-1);

        for(int i=0; i<arrary.length; i++){
            String firstStr = arrary[i];
            String[] arr = firstStr.split("");

            for(int j=0; j<arr.length; j++){
                String secondStr = arr[j];
                if(j%2 == 0){
                    sb.append(secondStr.toUpperCase());
                }else{
                    sb.append(secondStr.toLowerCase());
                }
            }
            sb.append(" ");
        }

        String answer = sb.toString().substring(0, sb.length()-1);
        return answer;
    }

    // test를 위한 로직
    public static void testResult(String result){
        if("           TrY HeLlO WoRlD              ".equals(result)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
