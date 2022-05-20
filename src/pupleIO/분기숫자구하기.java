package pupleIO;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import static java.lang.Math.abs;

public class 분기숫자구하기 {
    public String Solution(int month){
      if(month<=3) return "1";
      else if(4<=month && month<=6) return "2";
      else if(7<=month && month<=9) return "3";
      else if(10<=month && month <=12) return "4";
      else return "1부터 12까지의 숫자만 입력합니다.";
    }
    public static void main(String[] args) {
        분기숫자구하기 temp = new 분기숫자구하기();
        String result = temp.Solution(13);
    }
}
