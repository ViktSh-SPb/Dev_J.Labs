package org.viktsh;

import org.viktsh.files.*;
import org.viktsh.university.*;

/**
 * Hello world!
 *
 */
public class MainClass
{
    public static void main( String[] args )
    {
        Person[] person = new Person[6];
        person[0] = new Professor("Ronald Turner", Gender.MALE, "Computer Science", AcademicDegree.PHD, "Programming paradigms");
        person[1] = new Professor("Routh Hollings", Gender.FEMALE, "Jurisprudence", AcademicDegree.MASTERSCIENCE, "Domestic arbitration");
        person[2] = new Master("Leo Wilkinson", Gender.MALE, "Computer Science", Stage.BACHELOR, 3);
        person[3] = new Master("Anna Cunningham", Gender.FEMALE, "World Economy", Stage.BACHELOR, 1);
        person[4] = new Master("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", Stage.MASTER, 1);
        person[5] = new Aspirant("Ronals Correa", Gender.MALE, "Computer Science", "Design of a functional programming language");

        System.out.println("┌----------------------------┐");
        System.out.println("|\u001B[32m       Контингент ВУЗа      \u001B[0m|");
        System.out.println("└----------------------------┘");
        Person.printAll(person);

        File[] file = new File[4];
        file[0] = new Doc("j110-lab2-hiers.docx", 23212, "docx", 2);
        file[1] = new Picture("spb-map.png", 1703527, "image", 1024, 3072);
        file[2] = new Multimedia("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", "05:28");
        file[3] = new Video("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", "01:48:08", 640, 352);

        System.out.println("┌----------------------------┐");
        System.out.println("|\u001B[32m           Файлы            \u001B[0m|");
        System.out.println("└----------------------------┘");

        File.printAll(file);
        System.out.println();

        Video[] video = new Video[3];
        video[0] = new Video("Terminator2.avi", 1487633298, "video", "Terminator 2, 1991", "02:17:30", 640, 352);
        video[1] = new Video("Лекция1.Введение.Классы.mp4", 171318672, "video", "Лекция 1. Введение. Классы 05.10.23", "01:17:38", 1920, 1080);
        video[2] = new Video("Пластилиновая_ворона.mp4", 57593856, "video", "Пластилиновая ворона. Мультфильм, 1981", "08:57", 648, 480);
        Video.printAll(video);
        /*
        Метод printAll определен в классе File и класс Video наследует его. В качестве аргумента он принимает ссылку на массив объектов File
        и выполняет их метод Print. Метод Print переопределен в каждом классе-потомке. Каждый объект выполняет свою реализацию этого метода.
         */
    }
}
