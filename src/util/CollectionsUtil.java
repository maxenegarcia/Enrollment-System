package util;

import java.util.*;

public class CollectionsUtil {

    private CollectionsUtil() {
    }

    public static <T> List<T> copyList(List<T> source) {
        return new ArrayList<>(source);
    }

    public static boolean isNullOrEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }
}