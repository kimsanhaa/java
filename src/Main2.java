import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
   public int Solution (String arr[]) {
    int answer =0;
       ArrayList<Integer> Arrays = new ArrayList<>();
       int firtsNum = Integer.parseInt(arr[0]);
       Arrays.add(firtsNum);
       for(int i=1; i<arr.length; i++){
          if(arr[i]=="-"){
               Arrays.add(-Integer.parseInt(arr[i+1]));
           }
           else if(arr[i]=="+"){
               Arrays.add(Integer.parseInt(arr[i+1]));}

       }
       //임의로 가장 작은 숫자;
       int Max =0;

       for(int i=0;i<Arrays.size()-1; i++){
           int sum=0;
           for(int j = 0; j<Arrays.size() ; j++){
               sum=+Arrays.get(j);

           }
           Max=sum;
           for(int k=0; k<Arrays.size(); k++){
                sum = Arrays.get(i);
           }

       }







       return answer;
   }



    public static void main(String[] args) {
     Main2 temp = new Main2();
  String [] arr = new String[]{"1", "-", "3", "+", "5", "-", "8"};
     int result = temp.Solution(arr);
    }

}
