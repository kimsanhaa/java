package JAVA;

public class dynamicProgramming {
    int dp (int x){
        int [] d = new int[100];
        if(x ==1) return 1;
        else if(x ==2) return 1;
        else if (d[x] !=0) return d[x];
        return d[x] = dp(x-1)+dp(x-2);
    }
    public static void main(String[] args) {
        dynamicProgramming temp = new dynamicProgramming();
        int dp = temp.dp(50);


    }
}
