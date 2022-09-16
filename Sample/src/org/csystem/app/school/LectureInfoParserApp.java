package org.csystem.app.school;

import java.util.Scanner;

public class LectureInfoParserApp {

    public  static void run()
    {
    Scanner inp = new Scanner(System.in);

    for (;;) {
        System.out.println("Formatlı yazıyı giriniz:");
        String str = inp.nextLine();

        if("elma".equals(str))
            break;

        LectureInfoParser parser = new LectureInfoParser(str);
        LectureInfo lectureInfo = parser.lectureInfo;
        printLectureInfo(lectureInfo);
    }

    }
    public static void printLectureInfo(LectureInfo lectureInfo)
    {
        int grade = lectureInfo.getGrade();

        System.out.printf("Adı Soyadı:%s%n", lectureInfo.studentName);
        System.out.printf("Ders Adı:%s%n", lectureInfo.lectureName);
        System.out.printf("Arasınav Tarihi:%s%n", lectureInfo.midtermDate);
        System.out.printf("Final Tarihi:%s%n", lectureInfo.finalDate);
        System.out.printf("Arasınav Notu:%d%n", lectureInfo.midtermGrade);
        System.out.printf("Final Notu:%d%n", lectureInfo.finalGrade);
        System.out.printf("Geçme Notu:%d%n", grade);
        System.out.printf("Sonuç:%s%n", grade >= 50 ? "Geçti" : "Kaldı");
    }


}
