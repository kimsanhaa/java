package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class doit_25_친구관계파악하기 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    static boolean arrive;
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N];
        visited = new boolean[N];

        for(int i=0; i<N; i++){A[i]= new ArrayList<>();}


        for(int i=0; i<M; i++){
            st=new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }
        for(int i=0; i<M; i++){
            DFS(i,1);
            if(arrive) break;
        }
        if(arrive) System.out.println("1");
        else{
            System.out.println("0");
        }
    }

    static void DFS(int num, int depth){
        if(depth==5 || arrive){
            arrive=true;
            return;
        }
        visited[num]=true;
        for (int i : A[num]) {
            if(!visited[i]){
                DFS(i,depth+1);
            }
        }
        visited[num]=false;

    }
}
