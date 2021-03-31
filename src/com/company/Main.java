package com.company;

public class Main {

    public static void main(String[] args) {
     Logist logist = new Logist("DHL","Toktogula str");
     LKV lkv = new LKV("Тягач", "Germ", 1, logist,Purpose.SURFACE);
     lkv.customer(" Azat", 312);
     System.out.println(lkv.getInfo());

     Logist logist1 = new Logist("DHL", "Varashilova str");
     Sheep sheep = new Sheep("Ледокол", "Russia", 2, logist1, Purpose.SEE);
     sheep.customer("AZA", 312);
        System.out.println(sheep.getInfo());

    }
}
