package com.company;

import com.company.Factory.KiaFactory;
import com.company.Factory.MercedesFactory;
import com.company.Factory.ToyotaFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose your car brand: 1)KIA; 2)TOYOTA 3)MERCEDES");
        Scanner sc = new Scanner(System.in);
        int brand = sc.nextInt();
        Car car = null;

        if (brand == 1) {

            car = CarFactory.getCar("KIA");
            System.out.println("Choose your car model: 1)RIO 2)SPORTAGE 3)CERATO");
            int model = sc.nextInt();

            if (model == 1) {
                car = KiaFactory.getModel("RIO");
            } else if (model == 2) {
                car = KiaFactory.getModel("SPORTAGE");
            } else if (model == 3) {
                car = KiaFactory.getModel("CERATO");
            }

        } else if (brand == 2) {

            car = CarFactory.getCar("TOYOTA");
            System.out.println("Choose your car model: 1)CAMRY 2)COROLLA 3)LAND CRUISER PRADO");
            int model = sc.nextInt();

            if (model == 1) {
                car = ToyotaFactory.getModel("CAMRY");
            } else if (model == 2) {
                car = ToyotaFactory.getModel("COROLLA");
            } else if (model == 3) {
                car = ToyotaFactory.getModel("LAND CRUISER PRADO");
            }
        } else if (brand == 3) {

            car = CarFactory.getCar("MERCEDES");
            System.out.println("Choose your car model: 1)AMG 2)A-Class 3)S-Class");
            int model = sc.nextInt();


            if (model == 1) {
                car = MercedesFactory.getModel("AMG");
            } else if (model == 2) {
                car = MercedesFactory.getModel("A-Class");
            } else if (model == 3) {
                car = MercedesFactory.getModel("S-Class");
            }
        }


        System.out.println("Write the your price:");
        int price = sc.nextInt();

        System.out.println("Write the your year of manufacture:");
        int yearOfManufacture = sc.nextInt();

        System.out.println("ghj");
        String carName = sc.next();

        System.out.println("gghj");
        String carNam = sc.next();

        System.out.println("dfgh");
        String carNa = sc.next();

        car = new Car.CarBuilder(carName, carNam, carNa).withPrice(price).withYearOfManufacture(yearOfManufacture).build();

        System.out.println(car.toString());









    }
}
