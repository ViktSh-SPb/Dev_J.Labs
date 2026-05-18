package org.viktsh.university;

public enum Gender {
    MALE("M", "He", "His"), FEMALE("F", "She", "Her");
    private String translate;
    private String pronoun;
    private String possessivePronoun;

    Gender(String translate, String pronoun, String possessivePronoun) {
        this.translate = translate;
        this.pronoun = pronoun;
        this.possessivePronoun = possessivePronoun;
    }

    public String getTranslate() {
        return translate;
    }

    public String getPronoun(){
        return pronoun;
    }

    public String getPossessivePronoun() {
        return possessivePronoun;
    }
}