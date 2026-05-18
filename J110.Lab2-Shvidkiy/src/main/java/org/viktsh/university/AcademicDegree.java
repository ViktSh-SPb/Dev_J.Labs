package org.viktsh.university;

public enum AcademicDegree {
    MASTERSCIENCE("MSc"), DOCTORSCIENCE("DSc"), PHD("PhD");
    private String translate;
    AcademicDegree(String translate){
        this.translate = translate;
    }

    @Override
    public String toString() {
        return translate;
    }
}