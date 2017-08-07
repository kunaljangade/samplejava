package scrap;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by kjangade on 7/28/2017.
 */
public class IsPermutation {
    public static void main( String args[]){

        String a="Ra hl u 1";
        String b="Rhula1";

        String c=a.toLowerCase().replaceAll("\\s+","").trim();
        String d=b.toLowerCase().replaceAll("\\s+","").trim();

        char[] a1=c.toCharArray();
        char[] a2=d.toCharArray();

        System.out.println(a1);

        Arrays.sort(a1);
        Arrays.sort(a2);


        System.out.println( Arrays.equals(a1,a2));



    }
}
