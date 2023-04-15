package collection;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {

    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        for (String s : list) {
            if (!s.contains(str)) {
                check.add(index, str);
            } else {
                return false;
            }
        }
        return true;
    }
}
