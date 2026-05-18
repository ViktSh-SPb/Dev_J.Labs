package org.viktsh.files;

public class Video extends Multimedia {
    private PictureSize pictureSize;

    public Video(String name, int size, String format, String content, String duration, int width, int height) {
        super(name, size, format, content, duration);
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
