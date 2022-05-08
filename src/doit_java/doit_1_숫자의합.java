package doit_java;

import java.util.Scanner;

public class doit_1_숫자의합 {
    //수도코드
    //1.inputNum_1 입력받기 -> 숫자의 개수
    //2.inputNum_2 입력받기 -> N개 만큼 숫자 입력받기
    //3. intputNum_2  String -> Char[]로 변환
    //4. 변환된 intputNum을 for문을 돌면서 sum에 더해주기
    //5. sum 리턴하기.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum_1 = scan.nextInt();
        String inputNum_2 = scan.next();
        int sum = 0;
        char[] inputNumChar = inputNum_2.toCharArray(); //String -> char [] toCharArray;

        for (char temp : inputNumChar) {
            //  System.out.println(temp-'0'); // char 에서 int로 변환하는 방법은 '0'을 빼면 가능하다.
            sum += temp - '0';
        }
        System.out.println(sum);
    }
}
