package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsAssignment {

    public static void removeSmallInts(List<Integer> list, int minValue) {
        if (list == null)
            return;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() < minValue) {
                iterator.remove();
            }
        }
    }

    public static boolean containsDuplicates(Collection<Integer> integers) {
        if (integers == null)
            return false;
        Set<Integer> set = new HashSet<>(integers);
        return set.size() < integers.size();
    }

    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        Set<Integer> set = new HashSet<>();
        if (ints1 != null)
            set.addAll(ints1);
        if (ints2 != null)
            set.addAll(ints2);
        return set.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        Set<Integer> set1 = new HashSet<>(ints1 != null ? ints1 : new HashSet<>());
        Set<Integer> set2 = new HashSet<>(ints2 != null ? ints2 : new HashSet<>());
        set1.retainAll(set2);
        return set1.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static String mostFrequent(List<String> list) {
        if (list == null || list.isEmpty())
            return "";
        Map<String, Integer> counts = new HashMap<>();
        for (String str : list) {
            counts.put(str, counts.getOrDefault(str, 0) + 1);
        }
        return counts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
