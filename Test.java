package com.LA;

public class Test {

	public static void main(String[] args) {
		Cat cat = new Cat("ίχίχ",2);
		try {
			Cat newcat = (Cat) cat.clone();
			System.out.println(cat);
			System.out.println(newcat);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
