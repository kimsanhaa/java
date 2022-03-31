import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Hello {

    public static void main(String[] args) {
        String [] temp = {"134","123","123"};
        ArrayList <String> ListTemp = new ArrayList<>(Arrays.asList(temp));

        System.out.println(ListTemp);
        // 하나의 문자열로 바꾸기
        // String.join 사용하기
        String result = String.join("," , ListTemp);
        System.out.println(result);

        HashMap<String, String> map = new HashMap<>();
        map.put("산하","123");

        System.out.println(map.get("산하"));

}


}
