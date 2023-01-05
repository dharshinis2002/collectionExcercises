import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swaptwoarray {
    public static void main(String[] args) {


        List<String> Arraylist = new ArrayList<String>();
        Arraylist.add("bottle");
        Arraylist.add("box");
        Arraylist.add("pen");
        Arraylist.add("headset");
        Arraylist.add("charge");

        for (String a:Arraylist){
            System.out.println(" before swap arraylist:"+a);
        }

        Collections.swap(Arraylist ,2,1);
        for (String b:Arraylist){
            System.out.println("after swap arraylist: "+b);
        }

    }
}