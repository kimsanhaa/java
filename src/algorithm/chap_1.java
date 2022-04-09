package algorithm;

import java.util.Scanner;

public class chap_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1부터 n까지 합을 구합니다.");
        System.out.printf("n의 값");
        int n = scan.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++){
         sum = sum+i;
        }
        System.out.println(sum);

    }
}
