package pupleIO;

import java.util.HashMap;
import java.util.Map;


public class 아이큐테스트 {
    public String Solution (String numbers){
    int index=0;
    int num=0;
    String type;
    String result="";
        Map<Integer, Integer> oddNum = new HashMap<>();
        Map<Integer, Integer> evenNum = new HashMap<>();

        String[] StringArr = numbers.split(" ");
        int [] intArr = new int[StringArr.length];
        for (int i = 0; i < StringArr.length; i++) {
            intArr[i] = Integer.parseInt(StringArr[i]);
        }

        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]%2==1)oddNum.put(i+1, intArr[i]);
            else{evenNum.put(i+1,intArr[i]);}
        }

        if(oddNum.size()>evenNum.size()){
            type="짝수";
            for(int key: evenNum.keySet())index=key;
            for(int key: evenNum.values())num=key;
        }
        else{
            type="홀수";
            for(int key: oddNum.keySet())index=key;
            for(int key: oddNum.values())num=key;
        }

        result = index+" #"+ num+"만 "+type;
        return result;


    }
    public static void main(String[] args) {
        아이큐테스트 temp = new 아이큐테스트();
        String numbers = "1 2 1 1";
        String answer = temp.Solution(numbers);
        System.out.println(answer);
    }
}
