package collection;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        if (index < list.size() - 1) {
            list.set(index, list.remove(list.size() - 1));
        } else {
            list.remove(list.size() - 1);
        }
        return list;
    }
}
