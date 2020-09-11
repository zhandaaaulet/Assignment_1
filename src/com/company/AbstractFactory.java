package com.company;

public interface AbstractFactory<T> {
     T getCar(String brand);
}
