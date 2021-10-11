package com.Codegym.bt;

public class NhanVien {
   private String name;
   private int luong= (int) (Math.random()*1000 )+100;

    public NhanVien(){}
    public NhanVien(String name, int luong) {
        this.name = name;
        this.luong = luong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public static void main(String[] args) {

            NhanVien[] array = new NhanVien[10];
            for(int i =0; i<array.length;i++){
                array[i] = new NhanVien();
                array[i].setName("a"+(i+1));

            }
            int sum=0;
            for(int i =0; i<array.length;i++){
                System.out.print("\nnhan vien " +array[i].getName()+" la " + array[i].getLuong());
                sum += array[i].getLuong();
            }
            System.out.print("\ntong luong" + sum);

        }
    }





