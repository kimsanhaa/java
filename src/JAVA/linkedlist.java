package JAVA;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.add("data4");
        for (String s : list) {
            System.out.println(s);
        }
        list.addFirst("add");
        list.addLast("data5");
        for (String s : list) {
            System.out.println(s);
        }


    }
}
