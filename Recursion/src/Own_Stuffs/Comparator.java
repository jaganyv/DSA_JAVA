package Own_Stuffs;

import java.util.ArrayList;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(6);
        list2.add(8);
        list2.add(9);


        list.sort((a,b)->a-b);
        list2.sort((a,b)->b-a);
        System.out.println(list);
        System.out.println(list2);
    }
}
