package com.Codegym.week3.vd.Framework.findTree;

public interface Tree<E> {
    public boolean insert(E e);
    public void inorder();
    public int getSize();
}
