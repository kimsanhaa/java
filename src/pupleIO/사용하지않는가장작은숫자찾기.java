package pupleIO;

import java.util.ArrayList;
import java.util.HashSet;

public class 사용하지않는가장작은숫자찾기 {
    public int Solution (int [] list){
        int result =-1;

        HashSet<Integer> hashList  = new HashSet<>();
        //중복 지우기
        for(int rep : list) hashList.add(rep);
        //ArrayList 변환
        ArrayList<Integer> ArrayList = new ArrayList<>(hashList);
        int max = ArrayList.get(0);
        for(int rep : ArrayList){
            if(max<rep) max=rep;
        }

        //가장 작은 숫자를 찾는 로직
        for(int i=0; i<=max; i++){
            Boolean check =false;
            for(int j=0; j< ArrayList.size(); j++){

                if(i==ArrayList.get(j)){
                    check=true;
                   break;
                }
            }
            //없는 값
            if(check==false){
                result=i;
                break;
            }
        }
        //모든 값이 다 true이면 최대값 +1 출력
        if(result==-1) result=max+1;

        return result;
    }
    public static void main(String[] args) {
        int [] result = new int[]{0,1,2,4};
        사용하지않는가장작은숫자찾기 temp = new 사용하지않는가장작은숫자찾기();
        int answer = temp.Solution(result);
        System.out.println(answer);
    }
}
