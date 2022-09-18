package org.csystem.app.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    private String m_lecturname;
    private int[][] m_grades;
    private double [] m_averages;
    private double m_average;

    private void fillGrades()
    {
        Random r = new Random();
        Scanner inp = new Scanner(System.in);

        System.out.printf("%s sınavına giricek şube sayısını giriniz:%n", m_lecturname);
        m_grades = new int[Integer.parseInt(inp.nextLine())][];
        m_averages = new double[m_grades.length];

        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d. şubenin öğrenci sayısını giriniz:%n", i + 1);
            int count = Integer.parseInt(inp.nextLine());

            m_grades[i] = ArrayUtil.getRandomArray(r, count, 0 , 100);
        }
    }

    public ExamSimulation(String name) {

        m_lecturname = name;
    }

    public void run() {

        fillGrades();
        findAverages();
    }

    public void printGrade()
    {
        System.out.printf("%s dersi sınav notları:%n", m_lecturname);
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d. şubenin notları:%n", i + 1);
            ArrayUtil.print(3, m_grades[i]);
        }
    }

    private void findAverages()
    {
        int totalNumberOfStudents = 0;
        int totalGrades = 0;

        for(int i = 0; i < m_grades.length; ++i){
            int total = ArrayUtil.sum(m_grades[i]);

            m_averages[i] = (double)total / m_grades[i].length;
            totalGrades += total;
            totalNumberOfStudents += m_grades[i].length;
        }
        m_average = (double) totalGrades / totalNumberOfStudents;

    }

    public int getGrade(int i, int k)
    {
        return m_grades[i][k];
    }

    public double getClassAverage(int i)
    {
        return m_averages[i];
    }

    public double getAverage()
    {
        return m_average;
    }

    public String getLectureName() {
        return m_lecturname;
    }

    public void setLectureName(String m_lecturname) {
        this.m_lecturname = m_lecturname;
    }

    private void printAverages() {
        System.out.printf("%s dersi için not ortalamları : %n", m_lecturname);
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < m_averages.length; ++i) {
            System.out.printf("%d. şubenin not ortalması : %.2f%n", i + 1, m_averages[i]);
        }
        System.out.println("----------------------------------------------------");
    }

    public void printReport()
    {
        System.out.println("##################################################################");
        printGrade();
        printAverages();
        System.out.printf("Okul ortalaması : %.2f%n", m_average);

        System.out.println("##################################################################");

    }
}


