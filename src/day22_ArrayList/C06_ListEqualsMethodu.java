package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_ListEqualsMethodu {
    public static void main(String[] args) {

        List<Integer> sayilari1= new ArrayList<>(Arrays.asList(2,6,9));
        List<Integer> sayilari2= new ArrayList<>(Arrays.asList(6,9,2));

        System.out.println(sayilari1.equals(sayilari2));

        Collections.sort(sayilari1);
        Collections.sort(sayilari2);

        System.out.println(sayilari1.equals(sayilari2));

    }
}
