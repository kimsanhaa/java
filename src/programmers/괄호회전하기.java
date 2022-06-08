package programmers;

import java.util.Arrays;

public class 괄호회전하기 {
    public static int solution(String s) {
        int answer = -1;
        String bot = "()";
        String mid = "{}";
        String top = "[]";

        System.out.println("1");
        swap(s);
        System.out.println("2");
        swap(s);
        System.out.println("3");
        swap(s);
        return answer;
    }

    public static char [] swap (String s){
        char [] list = s.toCharArray();
        char [] swapList = new char[list.length];
        for (int i = 0; i < list.length-1; i++) {
            swapList[i]=list[i+1]; // 0 1 / 1 2 / 2 / ... / i=4 일떄 4 5 /
            if(i== list.length){
                swapList[list.length]=list[0];
            }
        }
        System.out.println(Arrays.toString(swapList));
        return swapList;


    }
    public static void main(String[] args) {
        solution("[](){}");

    }
}
