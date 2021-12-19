package s19_string_regex.exercise.validateClassroomName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassroomName {
    private static final String CLASSROOM_REGEX = "^[A|C|P]\\d{4}[G|H|I|K|L|M]$";
    public ClassroomName(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSROOM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
