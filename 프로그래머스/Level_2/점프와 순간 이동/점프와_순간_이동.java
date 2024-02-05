package org.zerock.myapp.level2;

public class 점프와_순간_이동 {
    public static void main(String[] args) {
        int n = 5000;
        int result = solution(n);
        System.out.println("result = " + result); // 5
    }

    public static int solution(int n) {
        int ans = 0;
        System.out.println("n = " + n);
        while (n != 0){
            if(n%2==1){
                n--;
                ans++;
                System.out.println("n(-) = " + n);
            }else{
                n /= 2;
                System.out.println("n(/) = " + n);
            }
        }

        return ans;
    }
}
