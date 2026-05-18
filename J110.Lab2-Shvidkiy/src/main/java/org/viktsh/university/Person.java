package org.viktsh.university;

public class Person {
    private String name;
    private Gender gender;
    private String department;

    public Person(String name, Gender gender, String department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public void print(){
        System.out.print("This is " + getName() + ". " + getGender().getPronoun() + " ");
    }
    public static void printAll(Person[] person){
        for (int i = 0; i < person.length; i++){
            person[i].print();
            System.out.println("-----------------");
        }
    }
}
