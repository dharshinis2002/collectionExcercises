import java.util.ArrayList;
import java.util.List;

public class Twoarraylist {
    public static void main(String[] args) {
        List<String> Arraylista=new ArrayList<String>();

        Arraylista.add("bottle");
        Arraylista.add("box");
        Arraylista.add("pen");
        Arraylista.add("pencil");

        System.out.println("first Array list:"+Arraylista);

        List<String> Arraylistb=new ArrayList<String>();
        Arraylistb.add("phone");
        Arraylistb.add("lap");

        System.out.println("second arraylist:"+Arraylistb);

        List<String> ArrayList=new ArrayList<String>();
        ArrayList.addAll(Arraylista);
        ArrayList.addAll(Arraylistb);

        System.out.println("new array list:"+ArrayList);








    }
}
