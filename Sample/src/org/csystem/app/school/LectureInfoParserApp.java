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
     /*	<ad soyad>:<ders adı>:<gg-aa-yyyy>:<gg-aa-yyyy>:<arasınav>:<final>
	Oğuz Karan:Matematik:04/04/2022:01/07/2022:78:67
	Barış Er:Radyo Haberleşmesi:03/04/2022:02/07/2022:89:100
	Ziya ÇAYLAN:PLC Programlama:10/04/2022:13/06/2022:90:98
	Emirhan Kabal:Fizik:07/03/2022:03/07/2022:85:75
	Ozan Yiğit:İstatistik:07/04/2017:19/06/2017:90:100
	Yunus Emre Uslu:Yazlım Geliştirme:28/04/2022:28/06/2022:60:70*/

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
