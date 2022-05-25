package pupleIO;

import java.util.ArrayList;

public class 친구찾기 {

    public ArrayList<String> Solution(String[] users){
        ArrayList<String> friends = new ArrayList<>(users.length);

        for (String user : users) {
            if(user.length()==4) friends.add(user);
        }
        return friends;

    }
    public static void main(String[] args) {
        친구찾기 temp = new 친구찾기();
        String [] users= new String[]{"Ryan", "Kieran", "Mark"};
        ArrayList<String> answer = temp.Solution(users);
        System.out.println(answer.toString());

    }
}
