package collection;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        if (list.contains(str)) {
            int a = list.indexOf(str);
            int b = list.lastIndexOf(str);
            return a == b;
        } else {
            return false;
        }
    }
}
