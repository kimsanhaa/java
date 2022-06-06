package programmers;

public class x만큼간격이있는n개의숫자 {
    public static long[] solution(int x, int n) {

        long[] answer = new long[n];
        int i=0;
        int j=1;

        for(int k=0; k<n;k++){
            System.out.println(i);
            answer[i]=(long)x*j;
            i++;
            j++;
        }
        return answer;
    }
    public static void main(String[] args) {
        solution(4,3);


    }
}
