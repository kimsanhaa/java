package algorithm;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        int n ;
        Scanner scan = new Scanner(System.in);

        System.out.println("2자리 정수를 입력하세요");

        do {
            System.out.printf("입력");
             n = scan.nextInt();
        } while (n<10 || n>99);

        System.out.println( n+"입력완료");

    }
}
