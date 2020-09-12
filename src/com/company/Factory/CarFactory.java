package com.company.Factory;

import com.company.Builder.Car;

import com.company.Cars.KiaList.Kia;
import com.company.Cars.MercedesList.Mercedes;
import com.company.Cars.ToyotaList.Toyota;

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
