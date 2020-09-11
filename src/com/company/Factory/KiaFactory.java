package com.company.Factory;

import com.company.Cars.*;
import com.company.Kia;
import com.company.Mercedes;

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
