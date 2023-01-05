import
        java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversrElement {
    public static void main(String[] args) {
        List<String> Arraylist = new ArrayList<String>();
        Arraylist.add("mango");
        Arraylist.add("apple");
        Arraylist.add("guava");
        Arraylist.add("grapes");
        Arraylist.add("banana");
        Arraylist.add("orange");

        System.out.println("original array list:"+Arraylist);
        Collections.reverse(Arraylist);
        System.out.println("reverse array list:"+Arraylist);

    }
}