package org.viktsh.files;

public class Doc extends File {
    private int pages;

    public Doc(String name, int size, String format, int pages) {
        super(name, size, format);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String getFileInfo(){

        return super.getFileInfo()+", "+getPages()+" pages";
    }
}
