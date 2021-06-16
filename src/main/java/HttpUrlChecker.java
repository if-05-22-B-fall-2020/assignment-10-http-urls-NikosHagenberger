import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpUrlChecker{
    public static Matcher getMatcher(String httpSting){


        Pattern pattern = Pattern.compile("^(http)://([a-zA-Z0-9])*[.]([a-zA-Z]|[.]|[-])*$");
        Matcher matcher = pattern.matcher(httpSting);

        return matcher;
    }
}
