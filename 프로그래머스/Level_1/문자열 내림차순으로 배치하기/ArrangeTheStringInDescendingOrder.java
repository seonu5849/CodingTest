package org.zerock.myapp.level1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeTheStringInDescendingOrder {
    public static void main(String[] args) {
        String str = "Zbcdefg";
        String result = ArrangeTheStringInDescendingOrder.solution(str);
        System.out.println("result = " + result); // "gfedcbZ"
    }

    public static String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        stringBuilder.append(charArray);

        return stringBuilder.reverse().toString();
    }
}
