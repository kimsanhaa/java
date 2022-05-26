package JAVA;

import java.util.Comparator;

public class Comparable_Comparator implements Comparable<Comparable_Comparator> , Comparator<Comparable_Comparator> {
    int yearModel; //연식
    int displacement; //배기량

    public Comparable_Comparator(int yearModel, int displacement) {
        this.yearModel = yearModel;
        this.displacement = displacement;
    }
    @Override
    public int compareTo(Comparable_Comparator o) {

       return this.yearModel-o.yearModel;

    }

    @Override
    public int compare(Comparable_Comparator o1, Comparable_Comparator o2) {

        return o1.yearModel-o2.yearModel;
    }

    public static void main(String[] args) {
        Comparable_Comparator car_1= new Comparable_Comparator(1,1600);
        Comparable_Comparator car_2 = new Comparable_Comparator(10,6300);
        Comparable_Comparator car_3 = new Comparable_Comparator(5,3300);

//        int isBig = car_1.compareTo(car_2);
//        System.out.println(isBig);


        int isBig = car_1.compare(car_2,car_3);
        if(isBig>0) System.out.println("car_2이 car_3보다 큼");
        else if(isBig>0) System.out.println("car_2와 car_3 똑같다");
        else{ System.out.println("car_2이 car_3보다 큼");}


    }
}
