package org.viktsh.files;

public class Picture extends File {
    private PictureSize pictureSize;

    public Picture(String name, int size, String format, int width, int height) {
        super(name, size, format);
        setPictureSize(width, height);
    }

    public PictureSize getPictureSize() {
        return pictureSize;
    }

    public void setPictureSize(int width, int height) {
        this.pictureSize = new PictureSize(width, height);
    }

    @Override
    public String getFileInfo(){
        return super.getFileInfo()+", "+getPictureSize();
    }
}
