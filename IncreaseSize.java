import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IncreaseSize {
    public static void main(String[] args) {
        List<String> Arraylist = new ArrayList<String>();
        Arraylist.add("dharshini");
        Arraylist.add("mabi");

        System.out.println("original Array list:" + Arraylist);

        Arraylist.add("siva");
        Arraylist.add("asiha");
        System.out.println("new array list: " + Arraylist);
    }
}