package lab8.ex1;

import java.util.*;

public class Main {
    /*static int getTopStudent(List<Student> students) {
        Optional o = students.stream().filter((Student s) -> s.getGradYear() == 2011).map((Student s) -> s.getScore().max(Integer::compareTo);
        return (Integer)o.get();
    }*/
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("S1", 2011,8),
                new Student("S2", 2011,9),
                new Student("S3", 2012,10),
                new Student("S4", 2011,11));

        //System.out.println(getTopStudent(students));
    }
}
