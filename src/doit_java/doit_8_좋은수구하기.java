package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class doit_8_좋은수구하기 {
    public static void main(String[] args) throws IOException {
        //N, list 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
for(int i =3; i<9 ; i++) {
    int startIndex = 0;
    int endIndex = n - 1;
    System.out.println(i + "번째");
    while (startIndex < endIndex) {
        if (list.get(i) == list.get(startIndex) + list.get(endIndex)) {
            result++;
            startIndex++;
            endIndex--;
            System.out.println("check");
        }
         else if (list.get(i) > list.get(startIndex) + list.get(endIndex)){ startIndex++;
        System.out.println(">");}
         else if (list.get(i) < list.get(startIndex) + list.get(endIndex)){  endIndex--;
            System.out.println("<");}
    }
}

        System.out.println("end");
    }


}
