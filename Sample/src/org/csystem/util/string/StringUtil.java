package org.csystem.util.string;

import java.util.Random;

public class StringUtil {

    public static  String turkishAlphabet = "AaBbCcÇçDdEeFfGgĞğHhIıİiJjKkLlMmNnOoÖöPpQqRrSsŞşTtUuÜüVvWwXxYyZz";
    public static String getRandomTurkishWord()
    {
        Random r = new Random();
        int letterCount = r.nextInt(10);
        char [] str = new char[letterCount];
        for(int i = 0; i < letterCount; ++i){
            str[i] = turkishAlphabet.charAt(r.nextInt(turkishAlphabet.length()));
    }

        return new String(str);


    }

    public static String join(String [] strArray, String str)
    {
        String joinedString = "";
        for (int i = 0; i < strArray.length; ++i)
        {
            joinedString += strArray[i] + str;
        }
        return joinedString.substring(0,joinedString.length() - str.length());
    }
    public static String join(String [] strArray, char ch)
    {
      return join(strArray, String.valueOf(ch));
    }

}
