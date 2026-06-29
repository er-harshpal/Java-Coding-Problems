package InterfaceUsage;

import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}

class AgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class comparatorUsage {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(101,"Rahul",20));
        list.add(new Student(103,"Amit",19));
        list.add(new Student(102,"Neha",21));
        Collections.sort(list,new AgeComparator());

        for(Student s:list)
            System.out.println(s);
    }
}