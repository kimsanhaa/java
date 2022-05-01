package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class baekJoon_1065 {
    //1065 한수 구하기
    public static void main(String[] args) {
        int DECIMAL_PLACE = 9;
        int HUNDRED_PLACES = 99;
        ArrayList<Integer> L_nums = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int input_num =scan.nextInt();
        if(input_num<10){
            for (int i=1; i<=input_num; i++){
                L_nums.add(i);
            }
            System.out.println(L_nums.size()) ;
        }
        else if (10<=input_num && input_num<100) {
            for (int i = 10; i <= input_num; i++) {

                String S_num = String.valueOf(i); //int -> Stirng
                int top_num = Integer.valueOf(S_num.substring(0, 1)); // String의 0 index를 int형으로 파싱
                int bottom_num = Integer.valueOf(S_num.substring(1, 2)); // String의 1 index를 int형으로 파싱

                if (top_num <= bottom_num || top_num > bottom_num) {
                    L_nums.add(i);
                }
            }
            System.out.println(L_nums.size()+DECIMAL_PLACE);
        }
        else {
            if(input_num==1000){
                System.out.println(L_nums.size()+HUNDRED_PLACES);
            }
            else {
                for (int i = 100; i <= input_num; i++) {
                    String S_num = String.valueOf(i); //int -> Stirng
                    int top_num = Integer.valueOf(S_num.substring(0, 1)); // String의 0 index를 int형으로 파싱
                    int mid_num = Integer.valueOf(S_num.substring(1, 2)); // String의 1 index를 int형으로 파싱
                    int bottom_num = Integer.valueOf(S_num.substring(2, 3));// String의 2 index를 int형으로 파싱
                    if ((mid_num - top_num) == (bottom_num - mid_num)) {
                        L_nums.add(i);

                    }
                }
                System.out.println(L_nums.size()+HUNDRED_PLACES);
            }



        }




    }

}
