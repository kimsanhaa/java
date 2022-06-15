package JAVA;

public class DFS {
    static boolean[] visted = new boolean[9];

    static int [][] graph = {{},{2,3,8}, {1,6,8}, {1,5}, {5,7},{3,4,6},{2}, {4,5},{1,2}};

    static void dfs(int nodeIndex){
        // 방문처리
        visted[nodeIndex]= true;

        //방문 노드 출력
        System.out.print(nodeIndex + "-->");

        //방문한 노드에 인접한 노드 찾기
        for(int node : graph[nodeIndex]){
            //인접한 노드가 방문한 적이 없다면 DFS수행
            if(!visted[node]){
                dfs(node);
            }
        }
    }

    public static void main(String[] args) {
        dfs(1);

    }
}
