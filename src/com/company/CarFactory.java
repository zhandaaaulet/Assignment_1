package com.company;

public class CarFactory {


    public static Car getCar(String choice) {
        if("KIA".equalsIgnoreCase((choice))) {
            return new Kia();
        }
        else if("TOYOTA".equalsIgnoreCase(choice)) {
            return new Toyota();
        }
        else if("MERCEDES".equalsIgnoreCase(choice)) {
            return  new Mercedes();
        }

        return null;
    }
}
