package doit_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum_1 =scan.nextInt();
        String inputNum_2 = scan.next();
        int sum =0;
        char [] inputNumChar = inputNum_2.toCharArray(); //String -> char [] toCharArray;

        for(char temp : inputNumChar){
          //  System.out.println(temp-'0'); // char 에서 int로 변환하는 방법은 '0'을 빼면 가능하다.
            sum += temp-'0';
        }
        System.out.println(sum);
    }
}
