import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emptyarray {
    public static void main(String[] args) {
        List<String> Arraylist=new ArrayList<String>();
        Arraylist.add("dharshini");
        Arraylist.add("vinitha");
        Arraylist.add("shruthika");
        Arraylist.add("uthaya");
        Arraylist.add("ahalya");
        Arraylist.add("selvi");

        System.out.println("original array:"+Arraylist);
        Arraylist.removeAll(Arraylist);
        System.out.println("after remove array"+Arraylist);

    }
}
