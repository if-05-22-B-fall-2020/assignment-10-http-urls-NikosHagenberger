import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpUrlChecker{
    public static Matcher getMatcher(String httpSting){


        Pattern pattern = Pattern.compile("http://b.com");
        Matcher matcher = pattern.matcher(httpSting);

        return matcher;
    }
}
