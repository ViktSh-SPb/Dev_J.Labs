package org.viktsh.university;

public enum Stage {
    BACHELOR("Bachelor"), MASTER("Master");
    private String translate;
    Stage(String translate){
        this.translate = translate;
    }

    @Override
    public String toString() {
        return translate;
    }
}
