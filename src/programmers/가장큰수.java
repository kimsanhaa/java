package programmers;

import sun.security.rsa.RSAUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";
        String [] stringNumbers = new String[numbers.length];
    for(int i=0; i< numbers.length; i++)stringNumbers[i]= Integer.toString(numbers[i]);

        Arrays.sort(stringNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });


        if(stringNumbers[0].equals("0")) return "0";

        return String.join("",stringNumbers);
    }
    public static void main(String[] args) {
        가장큰수 temp = new 가장큰수();
        int [] numbers = new int[]{6,10,2};
        temp.solution(numbers);

    }
}
