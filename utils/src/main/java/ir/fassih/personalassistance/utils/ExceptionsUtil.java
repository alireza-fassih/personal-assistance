package ir.fassih.personalassistance.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionsUtil {

    private ExceptionsUtil() {
        // Util class
    }


    public static String getStackTrace(Exception exception) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        exception.printStackTrace(pw);
        return sw.toString();
    }

}
