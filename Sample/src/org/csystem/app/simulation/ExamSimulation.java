package org.csystem.app.simulation;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    public String lecturname;
    public int[][] grades;
    public double [] averages;
    public double average;

    public void fillGrades()
    {
        Random r = new Random();
        Scanner inp = new Scanner(System.in);

        System.out.printf("%s sınavına giricek şube sayısını giriniz:%n", lecturname);
        grades = new int[Integer.parseInt(inp.nextLine())][];
        averages = new double[grades.length];

        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d. şubenin öğrenci sayısını giriniz:%n", i + 1);
            int count = Integer.parseInt(inp.nextLine());

            grades[i] = ArrayUtil.getRandomArray(r, count, 0 , 100);
        }
    }

    public ExamSimulation(String name) {

        lecturname = name;
    }

    public void run() {

        fillGrades();
        findAverages();
    }

    public void printGrade()
    {
        System.out.printf("%s dersi sınav notları:%n", lecturname);
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < grades.length; ++i) {
            System.out.printf("%d. şubenin notları:%n", i + 1);
            ArrayUtil.print(3, grades[i]);
        }
    }

    public void findAverages()
    {
        int totalNumberOfStudents = 0;
        int totalGrades = 0;

        for(int i = 0; i < grades.length; ++i){
            int total = ArrayUtil.sum(grades[i]);

            averages[i] = (double)total / grades[i].length;
            totalGrades += total;
            totalNumberOfStudents += grades[i].length;
        }
        average = (double) totalGrades / totalNumberOfStudents;

    }

    public void printAverages() {
        System.out.printf("%s dersi için not ortalamları : %n", lecturname );
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < averages.length; ++i) {
            System.out.printf("%d. şubenin not ortalması : %.2f%n", i + 1, averages[i]);
        }
        System.out.println("----------------------------------------------------");
    }

    public void printReport()
    {
        System.out.println("##################################################################");
        printGrade();
        printAverages();
        System.out.printf("Okul ortalaması : %.2f%n", average);

        System.out.println("##################################################################");

    }
}


