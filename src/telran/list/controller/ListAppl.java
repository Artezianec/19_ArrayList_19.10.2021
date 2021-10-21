package telran.list.controller;

import telran.list.interfaces.IList;
import telran.list.model.MyArrayList;

public class ListAppl {

	public static void main(String[] args) {
		IList<Integer> list = new MyArrayList<>();
		System.out.println(list.size());
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(null);
		System.out.println(list.size());
		int index = list.indexOf(10);
		System.out.println(index);
		Integer num = list.get(4);
		System.out.println(num);
	}

}
