package baekJoon;

import java.util.ArrayList;
//4673 셀프넘버

public class baekJoon_4673 {
    public static void main(String[] args) {
        String S_num;
        int I_num = 0;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList <Integer> selfNums = new ArrayList<Integer>();
        for (int k=0; k<10000; k++) {
            selfNums.add(k);
        }


        for (int i=0; i<10000; i++){

            //10 출력
            S_num = String.valueOf(i); // S_num = 2
            for(int j=0; j<S_num.length();j++){
                //System.out.println("j :"+j);
                I_num = I_num+Integer.parseInt(S_num.substring(j,j+1));
//                  System.out.println("안에 요소만 더 하기"+I_num);
            }
            I_num= I_num+i;
//              System.out.println(I_num+"의 생성자는 -->"+i);
            selfNums.remove(new Integer(I_num));
//              System.out.println("---------------------------------------------");
            I_num=0;
        }

        for (int m=0; m<selfNums.size();m++){
            System.out.println(selfNums.get(m));
        }

    }
}
