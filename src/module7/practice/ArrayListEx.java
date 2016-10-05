package module7.practice;

import java.util.*;
import java.util.function.UnaryOperator;

public class ArrayListEx {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(-11);
        queue.add(0);
        int a = queue.element();


//        Set<String> set = new TreeSet<>();
//        set.add("aaa");
//        set.add("ccc");
//        set.add("bbb");

        Set<Integer> set1 = new TreeSet<>();

        set1.add(11);
        set1.add(9);
        set1.add(15);

        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        List<String> list = new ArrayList<>(set);
        list.add("bbb");

        System.out.println(list);



//        List<String> list = new ArrayList<>();
//
//        System.out.println(list);
//
//        list.add("item");
//        list.add("item");
//        list.add("item");
//        list.add("item");
//        list.add("as");
//        System.out.println(list);
//
////        list.add(1, "item9");
////        System.out.println(list);
////        list.set(1, "ddd");
////        System.out.println(list);
////
////
////        List<String> list1 = new ArrayList<>();
////
////        list.add("s");
////        list.add("s");
////        list.add("s");
////        list.add("item");
////
////        list1.addAll(list);
////        list.addAll(list1);
////        System.out.println(list);
////        System.out.println(list.indexOf("item"));
//
////        list.clear();
////        System.out.println(list);
//
//        UnaryOperator<String> op = new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                if (s.contains("item")) {
//                    return null;
//                }
//
//                return s;
//
//            }
//
//
//        };
////        list.replaceAll(op);
////        System.out.println(list);
//        List<String> list2 = new ArrayList<>();
//        list2.add("item");
//        list2.add("ds");
//
//
////        list.retainAll(list2);
////        System.out.println(list2);
//        System.out.println(list.remove("item"));
//        System.out.println(list);
//        System.out.println(list.remove("item"));
//        System.out.println(list);System.out.println(list.remove("item"));
//        System.out.println(list);System.out.println(list.remove("item"));
//        System.out.println(list);
    }




}