package day45_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterator01 {

    public static void main (String[] args) {

        List<String> l1= new ArrayList<>(Arrays.asList("z",",e","h","r","a"));
        System.out.print("listin ilk hali"+l1);

        // l1 elemanlarını for loop kullanarak yazdırın.

        for(int i=0; i< l1.size();i++)

            System.out.println("for ile : "+l1.get(i)+" ");
    }
}
