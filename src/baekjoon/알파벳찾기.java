package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알파벳찾기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String text = st.nextToken();
        char[] chars = text.toCharArray();

//        for (int i = 0; i < chars.length; i++) {
//            int charNum = chars[i];
//            System.out.println(charNum);
//            for(int j=97; j<123; j++){
//
//            }
//
//        }

//        for(int i=97; i<123; i++){
//            System.out.println(i);
//            boolean chk = false;
//            for (int j = 0; j < chars.length; j++) {
//                int charNum = chars[j];
//                if(i==charNum){
//                    chk=true;
//                    System.out.print(j+" ");
//                    break;
//                }
//
//            }
//            if(chk) System.out.print("-1 ");
//
//        }

        for(int i=97; i<123; i++){
            char english = (char) i;
            boolean chk=false;
            for (int j = 0; j < chars.length; j++) {
                if(english==chars[j]){
                    chk=true;
                    System.out.print(j+" ");
                    break;
                }
            }
            if(chk==false) System.out.print("-1 ");

        }




    }
}
