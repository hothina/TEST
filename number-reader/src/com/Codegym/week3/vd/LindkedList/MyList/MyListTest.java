package com.Codegym.week3.vd.LindkedList.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listName = new MyList<>(10);
        listName.add("A");
        listName.add("B");
        listName.add("C");
        listName.add("E");
        listName.add(3, "D");
        listName.remove(1);
        listName.print();
    }
}
