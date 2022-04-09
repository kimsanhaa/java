import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalTime now = LocalTime.now();
//        int hour = now.getHour();
//        int min = now.getMinute();
        String input = scan.next();
        System.out.println(input);
        int hour = Integer.valueOf(input.substring(0,2));
//        int min = Integer.valueOf(input.substring(2,3));
        System.out.println(hour);
//        System.out.println(min);


//        //현재 시간 출력
//        System.out.println(hour+" "+min);
//        // 시간 입력하기
//        int inputScan = scan.nextInt();
//
//        int checkTime = inputScan + min;
//
//        if(checkTime>=60){
//            hour = hour+ checkTime/60;
//            if(hour>=24){
//                hour = hour-24;
//            }
//
//            min =checkTime-60*(checkTime/60);
//            System.out.println(hour+" "+min);
//
//        }else{
//            System.out.println(hour+" "+checkTime);
//        }
//



    }



    } // end class ();




