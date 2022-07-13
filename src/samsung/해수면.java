package samsung;

import java.io.IOException;
public class 해수면 {
    static int cnt = 0; //0이면 +1;
    static boolean[][] checkList = new boolean[5][5];
    static int[][] temp = {{6,8,2,6,2}, {3,2,3,4,6}, {6,7,3,3,2}, {7,2,5,3,6}, {8,9,5,2,7}};
   static int N=4;
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
               if(temp[i][j]>N &&!checkList[i][j]){
                   System.out.println("--cnt 증가--");
                   cnt++;
                   search(i,j);
               }
            }
        }

        System.out.println(cnt);
        System.out.println("end");
    }// end main;

    static void search(int i, int j) {
        if(j== temp.length || i== temp.length)return;
        checkList[i][j]=true;
        System.out.println("i=="+i+" j=="+j);
        //x축
        if(j!=temp.length-1 && temp[i][j+1]>N &&!checkList[i][j+1]) search(i,j+1);
        if(j!=0 && temp[i][j - 1] >N && !checkList[i][j - 1])search(i, j - 1);
        //y축
        if(i!= temp.length-1 && temp[i+1][j]>N&&!checkList[i+1][j])search(i+1,j);
        if(i!=0 && temp[i-1][j] >N && !checkList[i-1][j])search(i-1, j);
    }

}

