package org.viktsh.files;

public class PictureSize {

    private int heihght;
    private int width;

    public PictureSize(int heihght, int width) {
        this.heihght = heihght;
        this.width = width;
    }

    public int getHeihght() {
        return heihght;
    }

    public void setHeihght(int heihght) {
        if(heihght>0){
            this.heihght = heihght;
        } else throw new IllegalArgumentException("Некорректное значение высоты изображения");

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0){
            this.width = width;
        } else throw new IllegalArgumentException("Некорректное значение ширины изображения");
    }

    @Override
    public String toString(){
        return width+"x"+heihght;
    }
}
