package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> customSet = new HashSet<>();

        customSet.add("ELEMENT KPRBC");
        customSet.add("ELEMENT YPBTM");
        customSet.add("ELEMENT AADXU");
        customSet.add("ELEMENT RXCGJ");
        customSet.add("ELEMENT WYMVD");
        customSet.add("ELEMENT WFGEJ");
        customSet.add("ELEMENT TYGBS");
        customSet.add("ELEMENT MAPTK");
        customSet.add("ELEMENT GJXVE");
        customSet.add("ELEMENT BAFGL");

        return customSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> customSet = new TreeSet<>();

        customSet.add("ELEMENT KPRBC");
        customSet.add("ELEMENT YPBTM");
        customSet.add("ELEMENT AADXU");
        customSet.add("ELEMENT RXCGJ");
        customSet.add("ELEMENT WYMVD");
        customSet.add("ELEMENT WFGEJ");
        customSet.add("ELEMENT TYGBS");
        customSet.add("ELEMENT MAPTK");
        customSet.add("ELEMENT GJXVE");
        customSet.add("ELEMENT BAFGL");

        return customSet;
    }

    private static void printSet(Set<String> customSet) {
        for (String c: customSet) {
            System.out.println(c);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        boolean addedToHashSet = addElementToSet(hashSet, "ELEMENT AAA");
        System.out.println("HashSet:");
        printSet(hashSet);

        Set<String> treeSet = createTreeSet();
        boolean addedToTreeSet = addElementToSet(treeSet, "ELEMENT AAA");
        System.out.println("\nTreeSet:");
        printSet(treeSet);
    }

}
