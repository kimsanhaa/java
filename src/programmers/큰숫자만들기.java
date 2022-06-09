package programmers;

import java.util.ArrayList;

public class 큰숫자만들기 {
    public static String solution(String number, int k) {
        String answer = "";
        char [] charList = number.toCharArray();
        int [] intList = new int[charList.length];
        ArrayList<Integer> ArrayList = new ArrayList<>();
        for (int i = 0; i < charList.length; i++) {
            intList[i]=charList[i]-'0';
        }

        ArrayList.add(1);
        System.out.println(ArrayList.get(0));


            for (int i = 0; i < intList.length; i++) {
               if(k==0){ArrayList.add(intList[i]);}//end if;

                if(i==0){ArrayList.add(intList[i]);}
                else if(i>0) {
                    if (intList[i] > ArrayList.get(i-1)) {
                        ArrayList.remove(i - 1);
                        k--;
                    }
                    else{ArrayList.add(intList[i]);};
                }

            }// end for;
//


        return answer;
    }

    public static void main(String[] args) {
        String number="1924";
        int k =2;
        solution(number,k);
    }
}
