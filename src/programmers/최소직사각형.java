package programmers;

import java.util.ArrayList;

public class 최소직사각형 {
    public static int solution(int[][] sizes) {
       int answer=0;
       int Max_x=0;
       int Max_y=0;
        for (int i = 0; i < sizes.length; i++) {
            int x=Math.max(sizes[i][0],sizes[i][1]);
            int y=Math.min(sizes[i][0],sizes[i][1]);
            System.out.println("sizes=="+"{"+sizes[i] [0]+","+sizes[i][1]+"}");
            System.out.println("x=="+x +" y=="+y);
            System.out.println("전 Max_x=="+Max_x+" Max_y=="+Max_y);
            Max_x=Math.max(Max_x,x);
            Max_y=Math.max(Max_y,y);
            System.out.println("후 Max_x=="+Max_x+" Max_y=="+Max_y);
        }



        return answer;
    }

    public static void main(String[] args) {
 //      int [][] result = new int[][]{{10,7},{12,3},{8,15},{14,7},{5,15}};
        int [][] result = new int[][]{{60,50},{30,70},{60,30},{80,40}};
//        int [][] result = new int[][]{{14,4},{19,6},{6,16},{18,7},{7,11}};
        solution(result);

    }
}
