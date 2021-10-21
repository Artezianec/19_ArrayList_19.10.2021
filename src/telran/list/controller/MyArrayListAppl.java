package telran.list.controller;

import telran.list.interfaces.IList;
import telran.list.model.MyArrayList;

public class MyArrayListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(null);
        System.out.println(list.size());
        list.indexOf(2);
    }
}
