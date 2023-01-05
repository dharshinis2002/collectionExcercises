import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List<String> Arraylist=new ArrayList<String>();
        Arraylist.add("dharshini");
        Arraylist .add("mabi");
        Arraylist .add("hello");
        Arraylist .add("hi");
        Arraylist.add("siva");
        Arraylist.add("ond");

        System.out.println(Arraylist);

        Arraylist.remove(3);
        System.out.println("After remove 3rd index list "+Arraylist);


    }
}
