import java.util.ArrayList;
import java.util.List;

public class Insertanelement {
    public static void main(String[] args) {
        List<String> ArrayList =new ArrayList<String>();
        ArrayList.add("dharshini");
        ArrayList.add("mabi");
        ArrayList.add("hello");
        ArrayList.add("hi");
        ArrayList.add("siva");
        ArrayList.add("ond");

        ArrayList.add(2,"Dharshini");
        System.out.println(ArrayList);
    }
}
