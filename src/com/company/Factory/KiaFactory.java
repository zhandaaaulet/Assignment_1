package com.company.Factory;

import com.company.Cars.KiaList.Cerato;
import com.company.Cars.KiaList.Rio;
import com.company.Cars.KiaList.Kia;
import com.company.Cars.KiaList.Sportage;

public class KiaFactory {
    public static Kia getModel(String model) {
        if ("RIO".equalsIgnoreCase((model))) {
            return new Rio();
        } else if ("SPORTAGE".equalsIgnoreCase(model)) {
            return new Sportage();
        } else if ("CERATO".equalsIgnoreCase(model)) {
            return new Cerato();
        }

        return null;
    }
}
