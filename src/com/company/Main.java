package com.company;

import com.company.Builder.Car;
import com.company.Factory.KiaFactory;
import com.company.Factory.MercedesFactory;
import com.company.Factory.ToyotaFactory;
import com.company.Factory.CarFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Choose your car brand: 1)KIA; 2)TOYOTA; 3)MERCEDES;");
        Scanner sc = new Scanner(System.in);
        int brand = sc.nextInt();
        Car car;

        if (brand == 1) {
            car = CarFactory.getCar("KIA");
            System.out.println("Choose your car model: 1)RIO; 2)SPORTAGE; 3)CERATO;");
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
            System.out.println("Choose your car model: 1)CAMRY; 2)COROLLA; 3)LAND CRUISER PRADO;");
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
            System.out.println("Choose your car model: 1)AMG; 2)A-Class; 3)S-Class;");
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

        System.out.println("Write the your city:");
        String city = sc.next();

        System.out.println("Write the name of your car:");
        String carName = sc.next();

        System.out.println("Write the model of your car:");
        String carModel = sc.next();

        car = new Car.CarBuilder(carName, carModel).withPrice(price).withYearOfManufacture(city).build();


        System.out.println("Thank you for your purchase! " + car.toString());


    }
}
