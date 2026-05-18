package org.viktsh.university;

public class Master extends Student{
    private Stage stage;
    private int course;

    public Master(String name, Gender gender, String department, Stage stage, int course) {
        super(name, gender, department);
        this.stage = stage;
        this.course = course;
    }

    public Stage getStage() {
        return stage;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getGender().getPronoun() + " is " + getCourse() + "'th year stage " + getStage() + " student.");
    }
}
