package collection;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        for (String s : list) {
            return list.get(0);
        }
        return "";
    }
}
