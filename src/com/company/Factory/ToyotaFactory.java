package com.company.Factory;

import com.company.Cars.ToyotaList.Camry;
import com.company.Cars.ToyotaList.Corolla;
import com.company.Cars.ToyotaList.LandCruiserPrado;
import com.company.Cars.ToyotaList.Toyota;

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
