package org.viktsh.files;

public class File {
    private String name;
    private int size;
    private String format;

    public File(String name, int size, String format) {
        setName(name);
        setSize(size);
        setFormat(format);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches(".{1,28}\\.(\\d|\\w){3,4}")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Недопустимое имя файла");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Размер не может быть отрицательным");
        }
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if((format.length())<10){
            this.format = format;
        }else {
            throw new IllegalArgumentException("Формат должне быть не более 10 символов");
        }
    }
    public void print(){
        System.out.printf("%-30s │ %10s │ %-66s │", getName(), getSize(), getFileInfo());
    }
    public static void printAll(File[] file) {
        System.out.println("───────────────────────────────┬────────────┬────────────────────────────────────────────────────────────────────┐");
        System.out.printf("%-30s │ %-10s │ %-66s │\n", "File name", "Size", "Details");
        System.out.println("───────────────────────────────┼────────────┼────────────────────────────────────────────────────────────────────┤");
        for (int i = 0; i < file.length; i++) {
            file[i].print();
            System.out.println();
        }
        System.out.println("───────────────────────────────┴────────────┴────────────────────────────────────────────────────────────────────┘");
    }
    public String getFileInfo(){
        return format;
    }
}
