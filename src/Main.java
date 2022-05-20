import java.lang.reflect.Array;
import java.util.*;

public class Main {
   public int Solution (int[] A, int [] B){
       int answer = 0;
       Arrays.sort(A);
       Arrays.sort(B);
       int j = B.length-1;
       for(int i=A.length-1; i>=0; i--){
           if(A[i] < B[j]){
               answer++;
               j--;
           }
       }


       return answer;

   }

    public static void main(String[] args) {
     Main temp = new Main();
     int [] A = new int[]{5,1,3,7};
     int [] B = new int[]{2,2,6,8};
     int result = temp.Solution(A,B);
    }

}
