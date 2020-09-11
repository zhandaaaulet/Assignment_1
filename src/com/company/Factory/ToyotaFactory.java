package com.company.Factory;

import com.company.Cars.Camry;
import com.company.Cars.Corolla;
import com.company.Cars.LandCruiserPrado;
import com.company.Toyota;

public class ToyotaFactory {
    public static Toyota getModel(String model) {
        if ("CAMRY".equalsIgnoreCase((model))) {
            return new Camry();
        } else if ("COROLLA".equalsIgnoreCase(model)) {
            return new Corolla();
        } else if ("LAND CRUISER PRADO".equalsIgnoreCase(model)) {
            return new LandCruiserPrado();
        }

        return null;
    }
}
