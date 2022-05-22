package zzzzzzzzzzzu;

public class zzz_1 {
    public long solution(long n) {
        int [] y= new int[(int)n];

        for(int x=1;x<n;x++){
            y[x]= (int) ((n+1)*x);
        }

        long answer = 0;

        for (int i : y) {
            answer+=i;
        }
        return answer;
    }
    public static void main(String[] args) {
        zzz_1 temp  = new zzz_1();
        long n=5;
        temp.solution(n);

    }
}
