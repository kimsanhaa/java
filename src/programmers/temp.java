package programmers;

import doit_java.Main;

import java.util.ArrayList;

public class temp {
    public static void main(String[] args) {
        System.out.println(solution("for the      last week"));

    }

    public static String solution(String s) {
        String[] split = s.split(" ");
        String [] list = new String[split.length];
        int i=0;


        for (String s1 : split) {
           s1=s1.toLowerCase();
            char[] chars = s1.toCharArray();
            if(!Character.isDigit(chars[0])){
                chars[0] = Character.toUpperCase(chars[0]);
            }
            String answer = new String(chars);
            list[i]=answer;
            i++;
        }
        String join = String.join(" ", list);


        return join;
    }
}
