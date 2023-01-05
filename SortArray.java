import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<String> Arraylist = new ArrayList<String>();
        Arraylist.add("redmi");
        Arraylist.add("samsung");
        Arraylist.add("oppo");
        Arraylist.add("realme");
        Arraylist.add("soni");
        Arraylist.add("poco");
        Arraylist.add("apple");

        System.out.println("before sort list" +Arraylist);

        Collections.sort(Arraylist);
        System.out.println("After sort list"+Arraylist);


    }
}