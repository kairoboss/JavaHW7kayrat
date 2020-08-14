package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> listA = new ArrayList<>();
        addNewString(listA);
        printList(listA);
        System.out.println("----------------");
        ArrayList<String> listB = new ArrayList<>();
        addNewString(listB);
        System.out.println("----------------");
        printList(listB);
        Collections.reverse(listB);
        Iterator<String> iterA = listA.iterator();
        Iterator<String> iterB = listB.iterator();
        ArrayList<String> listC = new ArrayList<>();
        while (listC.size() < 10) {
            while (iterA.hasNext()) {
                String a = iterA.next();
                listC.add(a);
                break;
            }
            while (listC.size() < 10) {
                String b = iterB.next();
                listC.add(b);
                break;
            }
        }
        System.out.println("----------------");
        printList(listC);
        StringsComparator myStringsComparator = new StringsComparator();
        listC.sort(myStringsComparator);
        System.out.println("Sorted: ");
        printList(listC);
    }

    public static void addNewString(ArrayList<String> list) {
        while (list.size() < 5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите новую строку");
            String newLine = sc.nextLine();
            list.add(newLine);
        }

    }

    public static void printList(ArrayList<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
    }
}
