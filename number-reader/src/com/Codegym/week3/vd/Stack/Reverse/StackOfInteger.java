package com.Codegym.week3.vd.Stack.Reverse;

public class StackOfInteger {
  private int size;
   private int index =0;
   private int array[];
   public StackOfInteger(int size){
       this.size = size;
       array = new int[size];
   }
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        array[index] = element;
        index ++;
        ;
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
    public int size() {
        return size;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return array[--index];
    }
    public void Reverse(){
        int arr1[] =new  int [this.size()];
        for(int i =0 ; i<this.size();i++){
            arr1[i]= this.array[i];
        }
        for(int i =0 ; i<this.size();i++){
             this.array[i] = arr1[this.size()-i-1];
        }

   }
    public void Show()
    {
        for(int i=0;i<this.size;i++)
        {
            System.out.println(array[i]);
        }
    }




}
