package com.company;

import java.util.Random;

public final class Sheep extends LKV {
     public Sheep(String type, String madeIn, int count, Logist company, Purpose purpose){
         super(type,madeIn,count,company,purpose);
     }

     public String getTransportName(){
         String transportName = null;
         Random random = new Random();
         int r = random.nextInt(2) + 1;
         String[] maschines = {"Северная судостроитльный завод", "Нерпа", "Лимендийский судостроитльный завод"};
         for (int i = 0; i < maschines.length; i++) {
             if (r == i) {
                 transportName = maschines[i];
             }

         }
         return transportName;

     }

     public String getInfo(){
         return "Данные по перевозчику и по судну: " + " \nМарка: " + getTransportName() + " \nКоличество судн: " + getCount() +
                 "\nПроисхождение судны: " + getMadeIn() + "\nТип судна: " + getType() + "\nТип перевозок: " + getPurpose() +
                 "\nАдрес перевозщика: " + getCompany().getAddress() + " \nЛогист компания: " + getCompany().getName() + "\n----------------------------------------";
     }



}
