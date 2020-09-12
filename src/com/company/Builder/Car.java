package com.company.Builder;

public class Car {
    private String carName;
    private String carModel;
    private int price;
    private String city;


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
        this.carModel = item.carModel;
        this.price = item.price;
        this.city = item.city;
    }



    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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



    public static class CarBuilder{
        private String carName;
        private String carModel;
        private int price;
        private String city;



        public CarBuilder(String carName, String carModel) {
            this.carName = carName;
            this.carModel = carModel;
        }

        public CarBuilder withPrice(int price) {
            this.price = price;
            return this;
        }

        public CarBuilder withYearOfManufacture(String city) {
            this.city = city;
            return this;
        }



        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car name: " + carName + ". "  + "Car model: " + carModel + ". " +"Car price: " + price + ". " + "Car city: " + city + ".";
    }
}
