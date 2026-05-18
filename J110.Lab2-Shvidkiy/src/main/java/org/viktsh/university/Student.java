package org.viktsh.university;

public class Student extends Person{

    public Student(String name, Gender gender, String department) {
        super(name, gender, department);
    }

    public static String getVerb() {
        return "studies";
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getVerb() + " at " + getDepartment());
    }
}
