package model;

public class Car {

    private String model;
    private int year;
    private int id;

    public Car() {
    }

    public Car(int id, String model, int year) {

        this.model = model;
        this.year = year;
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", id=" + id +
                '}';
    }

}
