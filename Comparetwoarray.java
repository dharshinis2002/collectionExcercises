import java.util.ArrayList;
import java.util.List;

public class Comparetwoarray {
    public static void main(String[] args) {
        List<String> Arraylist1 = new ArrayList<String>();
        Arraylist1.add("bottle");
        Arraylist1.add("box");
        Arraylist1.add("pen");
        Arraylist1.add("pencil");
        Arraylist1.add("phone");
        Arraylist1.add("lap");

        List<String> Arraylist2 = new ArrayList<String>();
        Arraylist2.add("bottle");

        Arraylist2.add("pen");


        List<String> Arraylist3 = new ArrayList<String>();
        for(String e:Arraylist1)
            Arraylist3.add(Arraylist2.contains(e)? "yes:":"no");
            System.out.println(Arraylist3);
        }


    }

