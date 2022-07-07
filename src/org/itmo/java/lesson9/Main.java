package org.itmo.java.lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add("String");
        list.add(true);

//        System.out.println(list);

        List<String> strings = new ArrayList<>();
        strings.add("1234");
        strings.add("string");
        strings.add("false");

//        strings.add(123);
//        strings.add(false);

//        System.out.println(strings);
//        Collections.sort(strings);
//        System.out.println(strings);
//
//        Collections.reverse(strings);
//        System.out.println(strings);

        List<Integer> integers = new ArrayList<>();
        integers.add(1234);
        integers.add(1234);
        integers.add(1234);
        integers.add(1234);
        integers.add(1234);
        integers.add(12334);
        integers.add(421234);
        integers.add(421234);
        integers.add(421234);
        integers.add(421234);
        integers.add(421234);
        integers.add(421234);
        integers.add(551234);
        integers.add(1235444);
        integers.add(1235444);
        integers.add(1235444);
        integers.add(1235444);
        integers.add(1235444);
        integers.add(1235444);
        integers.add(1235444);
        integers.add(1235444);
        integers.add(1235444);


        List<Integer> integers2 = Arrays.asList(213, 431, 34);
//        integers2.add(12314);

//        for (Integer integer : integers) {   // <- удаление по условию невозможно!
//            if(integer % 2 == 0) {
//                integers.remove(integer);
//            }
//        }

//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next() > 421234) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(integers);

//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }

//        Integer integer = integers.get(5);  <- IndexOutOfBoundsException

        Set<String> set = new TreeSet<>();                        // new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

//        System.out.println(set);

        set.add("String");
        set.add("777");
        set.add("world");
        set.add("Hello");

//        System.out.println(set);

        Set<Integer> integerSet = new HashSet<>(integers);
//        System.out.println(integerSet);

        //   key     value
        Map<String, Integer> map = new HashMap<>();

        map.put("John", 1234511);
        map.put("Alice", 123414451);
        map.put("Katie", 13223451);
        map.put("Bob", 12323451);
        map.put("Mike", 13123451);
//        map.put("Mike", 777);

//        System.out.println(map);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

//        System.out.println(keys);
//        System.out.println(values);

        Integer integer = map.get("Katie");
//        System.out.println(integer);


        System.out.println(getKeyByValue(map, 13123451));
    }

    public static void method(List<String> strings) {

    }

    public static String getKeyByValue(Map<String, Integer> map, Integer value) {
        String result = null;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer mapValue = pair.getValue();
            if(value.equals(mapValue)){
                result = key;
            }
        }
        return result;
    }
}
