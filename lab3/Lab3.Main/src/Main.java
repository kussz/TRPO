import java.util.*;
import java.lang.*;
public class Main {
   public static void main(String[] args) {
       int[] array = {18, 17, 89, 5, 73,128, 28, 64, 11, 36, 50};
       System.out.println(Arrays.toString(array));
       RadiusSort.sort(array);
       System.out.println(Arrays.toString(array));
   }
}