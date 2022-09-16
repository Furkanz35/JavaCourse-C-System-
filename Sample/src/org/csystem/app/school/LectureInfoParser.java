package org.csystem.app.school;
import static org.csystem.app.datetime.DateUtil.getDateStrTR;

public class LectureInfoParser {
    public LectureInfo lectureInfo;

    public  LectureInfoParser(String str)
    {


        String [] lectureInfoStr = str.split("[:]+");
        lectureInfo = new LectureInfo();
        lectureInfo.studentName = lectureInfoStr[0];
        lectureInfo.lectureName = lectureInfoStr[1];
        lectureInfo.midtermDate = getDateStr(lectureInfoStr[2]);
        lectureInfo.finalDate = getDateStr(lectureInfoStr[3]);
        lectureInfo.midtermGrade = Integer.parseInt(lectureInfoStr[4]);
        lectureInfo.finalGrade = Integer.parseInt(lectureInfoStr[5]);
    }

    public static String getDateStr(String date)
    {
        String [] dateStr = date.split("[/]");
        return getDateStrTR(Integer.parseInt(dateStr[0]), Integer.parseInt(dateStr[1]), Integer.parseInt(dateStr[2]) );

    }
}
