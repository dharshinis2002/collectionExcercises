import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        List<String> Arraylist = new ArrayList<String>();
        Arraylist.add("honda");
        Arraylist.add("audi");
        Arraylist.add("RX");
        Arraylist.add("suzuki");
        Arraylist.add("marti");
        Arraylist.add("yamaga");

        System.out.println("before shuffle list:"+Arraylist);

        Collections.shuffle(Arraylist);

        System.out.println("after shuffle list:"+Arraylist);

    }
}