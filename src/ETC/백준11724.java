package ETC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 백준11724 {
    static boolean[] visited; //방문 확인 배열
    static ArrayList<Integer>[]A; //인접 리스트 넣기
    public static void main(String[] args)throws IOException {
        int count=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        A = new ArrayList[N+1];

        for(int i=0; i<N+1; i++){
            A[i]= new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 1; i < N+1; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }


            System.out.println(count);
        }
        public static void DFS(int N){
        if(visited[N]) {
            return;
        }
        visited[N]=true;
            for (int i : A[N]) {
                if(!visited[i]){
                    DFS(i);
                }

            }
        }



    }

