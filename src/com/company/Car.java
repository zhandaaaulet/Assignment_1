package com.company;

public class Car {
    private String carName;
    private String carBrand;
    private String carModel;
    private int price;
    private int yearOfManufacture;


   /* public Car() {
        carName = "No name";
        carBrand = "No value";
        carModel = "No value";
        price = 0;
        yearOfManufacture = 0;

    }*/

    public Car() {

    }

    public Car(CarBuilder item) {
        this.carName = item.carName;
        this.carBrand = item.carBrand;
        this.carModel = item.carModel;
        this.price = item.price;
        this.yearOfManufacture = item.yearOfManufacture;
    }



    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public static class CarBuilder{
        private String carName;
        private String carBrand;
        private String carModel;
        private int price;
        private int yearOfManufacture;



        public CarBuilder(String carName, String carBrand, String carModel) {
            this.carName = carName;
            this.carBrand = carBrand;
            this.carModel = carModel;
        }

        public CarBuilder withPrice(int price) {
            this.price = price;
            return this;
        }

        public CarBuilder withYearOfManufacture(int yearOfManufacture) {
            this.yearOfManufacture = yearOfManufacture;
            return this;
        }



        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return carName + " " + carBrand + " " + carModel + " " + price + " " + yearOfManufacture;
    }
}
