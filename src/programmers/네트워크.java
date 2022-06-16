package programmers;

import java.util.ArrayList;

public class 네트워크 {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean [] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            //만약 visited[i]번째가 false면 DFS실행
            if (!visited[i]) {
                DFS(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }
    //int[][] computers = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    boolean[] DFS(int [][] computers, int i, boolean[] visited){
        //visited[0]==false;  int 0; visited={ false, false, false};
        visited[i]=true;
        // visited = true, false , false
        //for문
        for(int j=0; j< computers.length; j++){
            // i== 0 pass -> 1 ,2
            if(i !=j && computers[i][j]==1 &&visited[j]==false){
                //j==1 computers[0][1]=1 충족한다.

               visited= DFS(computers, j, visited);
                //DFS(computers, 1,,visited);
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] computers = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        네트워크 temp = new 네트워크();
        temp.solution(n,computers);
    }
}
