import java.util.ArrayList;
import java.util.List;

public class Teacher1 {
    String name;
    String degree;
    String location;
    int std;
    int age;

    Teacher1(String name, String degree, String location, int std, int age) {
        this.name = name;
        this.degree = degree;
        this.location = location;
        this.std = std;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;

    }

    public String getDegree() {
        return degree;
    }

    public void setDegree() {
        this.degree = degree;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation() {
        this.location = location;

    }

    public int getstd() {
        return std;
    }

    public void setStd() {
        this.std = std;

    }

    public int getage() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }


    public static int method1(ArrayList<Teacher1> teacherlist, String location) {
        int count = 0;
        for (Teacher1 m2 : teacherlist) {
            if (m2.getLocation() == location) {
                count++;
            }
        }
        return count;
    }

    public static int method2(ArrayList<Teacher1> teacherlist, String location, int std) {
        int count = 0;
        for (Teacher1 m2 : teacherlist) {
            if (m2.getLocation() == location && m2.getstd() == std) {
                count++;
            }
        }
        return count;
    }

    public static int method3(ArrayList<Teacher1> teacherlist, String location, int age) {
        int count = 0;
        int sum=0;
        for (Teacher1 m2 : teacherlist) {
            if (m2.getLocation() == location && m2.getage() == m2.age) {
                count++;
                sum+= m2.getage();
            }
        }
        return sum;
    }

    public static int method4(ArrayList<Teacher1> teacherlist, String degree, int age) {
        int count = 0;

        for (Teacher1 m2 : teacherlist) {
                if (m2.getage()>20) {
                    if (m2.getage()> 40) {
                        count++;
                    }
                }  }
             return count;
    }

    public static int method5(ArrayList<Teacher1> teacherlist, int age) {
        int count = 0;
        for (Teacher1 m2 : teacherlist) {
            if (m2.age == age) {
                count++;
            }
        }
        return count;
    }
}
