import java.util.ArrayList;

public class Teacher {
    public static void main(String[] args) {

        Teacher1 tea1= new Teacher1("dharshini", "BA", "palamputhur", 5, 22);
        Teacher1 tea2 = new Teacher1("suruthika", "Bsc", "thekkur", 5, 20);
        Teacher1 tea3= new Teacher1("uthaya", "Msc", "ond", 5, 22);
        Teacher1 tea4 = new Teacher1("selvi", "Bsc", "tmk", 3, 30);
        Teacher1 tea5 = new Teacher1("vaishali", "Msc", "ond", 7, 30);
        Teacher1 tea6 = new Teacher1("tamil", "Mba", "pudur", 4, 26);
        Teacher1 tea7 = new Teacher1("vasan", "Bca", "pkt", 6, 36);
        Teacher1 tea8 = new Teacher1("keerthi", "BBA", "tmk", 7, 35);
        Teacher1 tea9 = new Teacher1("miruthu", "MA", "thekkur", 5, 50);
        Teacher1 tea10 = new Teacher1("nivi", "N&D", "ork", 6, 45);

        ArrayList<Teacher1> teacherlist = new ArrayList<>();

       teacherlist.add(tea1);
       teacherlist.add(tea2);
        teacherlist.add(tea3);
        teacherlist.add(tea4);
        teacherlist.add(tea5);
        teacherlist.add(tea6);
        teacherlist.add(tea7);
        teacherlist.add(tea8);
        teacherlist.add(tea9);
        teacherlist.add(tea10);

        System.out.println(Teacher1.method1(teacherlist,"tmk"));
        System.out.println(Teacher1.method2(teacherlist,"ond",5));
        System.out.println(Teacher1.method3(teacherlist,"ond",20));
        System.out.println(Teacher1.method4(teacherlist,"Bsc",20));
        System.out.println(Teacher1.method5(teacherlist,22));






}

}




