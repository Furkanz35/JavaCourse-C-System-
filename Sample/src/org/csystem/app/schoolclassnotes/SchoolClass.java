package org.csystem.app.schoolclassnotes;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class SchoolClass {
    Random r = new Random();
    public String classCode;
    public int numberOfStudent;
    public Lecture lecture;
    public int[] examNotes;
    public double examMean;

    public SchoolClass(String classCodeInfo, int numberOfStudentCount, Lecture lectureName) {
        classCode = classCodeInfo;
        numberOfStudent = numberOfStudentCount;
        lecture = lectureName;
        examNotes = ArrayUtil.getRandomArray(r, numberOfStudentCount, 0, 100 );
        examMean = getExamMean(examNotes, numberOfStudent);
    }

    public int[] getExamNotes(Random r, int numberOfStudent)
    {
        int [] examNotes = new int[numberOfStudent];
        for(int i = 0; i < numberOfStudent; ++i) {
            examNotes[i] = r.nextInt(100);
        }
        return examNotes;
    }

    public float getExamMean(int [] examNotes, int studentCount) {
        return (float)ArrayUtil.sum(examNotes) / studentCount;
    }

    public static SchoolClass getClassWithHighNote(SchoolClass [] schoolClasses)
    {
        double max = 0;
        int maxIndex = 0;
        for (int i = 0; i < schoolClasses.length; ++i) {
            if( max < schoolClasses[i].examMean) {
                maxIndex = i;
                max = schoolClasses[i].examMean;
            }
        }
        return schoolClasses[maxIndex];
    }


}
