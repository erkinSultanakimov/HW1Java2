package com.company;

import java.util.Random;

public class LKV extends Transport {
    private Purpose purpose;
    public LKV(){
        super();

    }
    public LKV(String type, String madeIn, int count, Logist company, Purpose purpose) {
        super(type, madeIn, count, company);
        this.purpose = purpose;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public String getInfo() {
        return "Данные по перевозчику и по транспорту: " + " \nМарка: " + getTransportName() + " \nКоличество машин: " + getCount() +
                "\nПроисхождение машины: " + getMadeIn() + "\nТип ЛКВ: " + getType() + "\nТип перевозок: " + getPurpose() +
                "\nАдрес перевозщика: " + getCompany().getAddress() + " \nЛогист компания: " + getCompany().getName() + "\n----------------------------------------";
    }

    public String getTransportName() {
        String transportName = null;
        Random random = new Random();
        int r = random.nextInt(2) + 1;
        String[] maschines = {"mercedes", "Man", "Daf"};
        for (int i = 0; i < maschines.length; i++) {
            if (r == i) {
                transportName = maschines[i];
            }

        }
        return transportName;
    }

    public final void customer(String name, int country){
        System.out.println("Имя клиента:" + name + " Код страны клиента: " + country);
    }

    public void customer(int country,String name){
        System.out.println("Имя клиента:" + name + " Код страны клиента: " + country);
    }


}
