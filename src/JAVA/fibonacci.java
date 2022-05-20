package JAVA;

public class fibonacci {
    public static int fibo(int x){
        if(x==1|| x==2) return 1;
        return fibo(x-1) + fibo(x-2);
    }

    public static int fiboTopdown(int x){
        int [] dp = new int[100];
        if(x==1 || x==2) return 1;
        // 이미 계산한 적 있는 문제라면 그대로 반환
        else  if (dp[x] !=0) return dp[x];
        //아직 계산한 적 없는 문제는 점화식에 따라서 피보나치 결과 반환
        dp[x] = fiboTopdown(x-1)+fiboTopdown(x-2);
        return dp[x];
    }

    public static void main(String[] args) {
        int fibo = fibo(4);
        System.out.println(fibo);

        fiboTopdown(10);
    }
}
