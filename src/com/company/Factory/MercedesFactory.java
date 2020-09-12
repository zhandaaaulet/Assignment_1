package com.company.Factory;

import com.company.Cars.MercedesList.AClass;
import com.company.Cars.MercedesList.Amg;
import com.company.Cars.MercedesList.SClass;
import com.company.Cars.MercedesList.Mercedes;

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
