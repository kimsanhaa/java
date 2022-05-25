package pupleIO;

import java.util.HashMap;

public class 더하고빼기 {

    public static int appleNum(int n){
        int num = n;
        int sum=0;

        while(num!=0){
            sum +=num%10;
            num /=10;
        }
        int result = n - sum;
        if(result>100) return appleNum(result);
        else if(result<101){
            return result;}
        return 0;
    }

    public String Solution (int n){
    int result =0;
    result = appleNum(n);

    if (result%9==0) return "apple";

    return null;
    }
    public static void main(String[] args) {
        더하고빼기 temp = new 더하고빼기();
        String answer = temp.Solution(10000);
        System.out.println(answer);
    }
}
