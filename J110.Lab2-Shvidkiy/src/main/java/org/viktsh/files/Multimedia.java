package org.viktsh.files;

public class Multimedia extends File {
    private String content;
    private MediaDuration duration;

    public Multimedia(String name, int size, String format, String content, String duration) {
        super(name, size, format);
        setContent(content);
        setDuration(duration);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {

        if (content.length() < 40) {
            this.content = content;
        } else {
            throw new IllegalArgumentException("Слишком длинное описание");
        }
    }

    public MediaDuration getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = new MediaDuration(duration);
    }

    @Override
    public String getFileInfo(){
        return super.getFileInfo()+", "+getContent()+", "+getDuration();
    };
}
