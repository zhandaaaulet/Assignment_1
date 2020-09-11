package com.company.Factory;

import com.company.Cars.AClass;
import com.company.Cars.Amg;
import com.company.Cars.LandCruiserPrado;
import com.company.Cars.SClass;
import com.company.Mercedes;

public class MercedesFactory {
    public static Mercedes getModel(String model) {
        if ("AMG".equalsIgnoreCase((model))) {
            return new Amg();
        } else if ("A-Class".equalsIgnoreCase(model)) {
            return new AClass();
        } else if ("S-Class".equalsIgnoreCase(model)) {
            return new SClass();
        }

        return null;
    }
}
