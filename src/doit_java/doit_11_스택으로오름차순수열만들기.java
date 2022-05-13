package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class doit_11_스택으로오름차순수열만들기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int [] list = new int[N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            list[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean result = true;
        for(int i=0; i<N; i++){
            int nowNum=list[i];
            if(nowNum>=num) {
                //스택값이 수열 값 보다 같거나 큰 경우
                while (nowNum >= num) {
                    System.out.println(num+"넣음 ! ");
                    stack.push(num++);
                    bf.append("+\n");

                }
                int k=stack.pop();
                System.out.println(k+"빠짐 !");
                bf.append("-\n");
            }
            // 스택값이 수열 값 보다 작은 경우
            else{
                int n= stack.pop();
                // 최 상단의 값이 현재 수열 값 보다 크면 정렬 불가능
                if(n>nowNum){
                    System.out.println("NO");
                    result=false;
                    break;
                }
                // 스택값이 수열 값 보다 작고 stack 최 상단 값이 수열보다 작은 경우
                else{

                    bf.append("-\n");
                }

            }
        }
        System.out.println(list);
        if(result) System.out.println(bf.toString());









    }
}
