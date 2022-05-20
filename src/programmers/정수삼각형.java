package programmers;

public class 정수삼각형 {

    public  int solution(int[][] triangle){
        int [][] dp = new int[triangle.length][triangle.length];
        dp [0][0] = triangle[0][0];


        for(int i=1; i<triangle.length; i++){

            dp[i][0] = triangle[i][0] + dp[i - 1][0];
          dp[i][i] = triangle[i][i] + dp[i - 1][i - 1];
            for (int j=1; j<= triangle.length; j++){
                  dp[i][j] = triangle[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
            }
        }

       int answer = 0;
        for (int i = 0; i < triangle.length; i++) {
            answer = Math.max(answer, dp[triangle.length - 1][i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        int [][] triangle = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
    }
}
