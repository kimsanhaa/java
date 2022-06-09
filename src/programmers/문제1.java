package programmers;

import java.util.ArrayList;
import java.util.HashSet;

public class 문제1 {
    public static String solution(String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            char[] chars = s2.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(i%2==0){
                    arrayList.add(String.valueOf(Character.toUpperCase(chars[i])));
                }
                else{arrayList.add(String.valueOf(chars[i]));}

            }
            arrayList.add(" ");
        }
       arrayList.remove(arrayList.size()-1);

        String answer = String.join("",arrayList);



        return answer;
    }

    public static void main(String[] args) {
        solution("try hello world");
    }
}
