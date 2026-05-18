package org.viktsh.university;

public class Aspirant extends Student{
    String thesisTitle;

    public Aspirant(String name, Gender gender, String department, String thesisTitle) {
        super(name, gender, department);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getGender().getPossessivePronoun() + " thesis title is " + getThesisTitle());
    }
}
