package org.viktsh.university;

public class Professor extends Person{
    private AcademicDegree academicDegree;
    private String speciality;

    public Professor(String name, Gender gender, String department, AcademicDegree academicDegree, String speciality) {
        super(name, gender, department);
        this.academicDegree = academicDegree;
        this.speciality = speciality;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public static String getVerb() {
        return "teaches";
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getVerb() + " at " + getDepartment());
        System.out.println(getGender().getPronoun() + " has " + getAcademicDegree() + " degree in " + getSpeciality() + ".");;
    }
}
