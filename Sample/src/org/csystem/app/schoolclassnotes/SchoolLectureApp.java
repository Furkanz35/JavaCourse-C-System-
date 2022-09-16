package org.csystem.app.schoolclassnotes;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class SchoolLectureApp {

    public static void main(String[] args) {
        SchoolLectureTest.run();
    }
}


class SchoolLectureTest {
    public static void run()
    {
        Random r = new Random();
        Scanner inp = new Scanner(System.in);

        System.out.println("Okulda kaç tane sınıf bulunduğunu giriniz:");
        int classCount = Integer.parseInt(inp.nextLine());
        System.out.println("Hangi ders için sonuçları görmek istersiniz");
        Lecture lecture = new Lecture(inp.nextLine());

        SchoolClass [] schoolAll = new SchoolClass[classCount];

        for(int i = 0; i < classCount; ++i ) {
            System.out.println("Sınıf ismini giriniz:");
            String className = inp.next();
            System.out.println("Sınıfta kaç öğrenci olduğunu giriniz:");
            int studentCount = inp.nextInt();
            schoolAll[i] = new SchoolClass(className, studentCount, lecture);

            System.out.println("------------------------------------------------------------------");
        }

        for(int i = 0; i < classCount; ++i) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println();
            System.out.printf("Sınıf ismi = %s%n", schoolAll[i].classCode);
            System.out.printf("Sınıftaki öğrenci sayısı = %d%n", schoolAll[i].numberOfStudent);
            System.out.printf("Ders ismi = %s%n", schoolAll[i].lecture.lectureName);
            System.out.printf("Sınıftaki öğrencilerin %s dersinden aldığı notlar:%n",schoolAll[i].lecture.lectureName);
            ArrayUtil.print(2, schoolAll[i].examNotes);
            System.out.printf("Dersin sınıf ortalaması = %.2f%n", schoolAll[i].examMean);
            System.out.println();
            System.out.println("-------------------------------------------------------------------");
        }
        System.out.println();
        System.out.println();

        System.out.printf("Bu sınıflar arasında en yüksek ortalamya sahip olan sınıf : [ %s ]", SchoolClass.getClassWithHighNote(schoolAll).classCode );


    }
}
