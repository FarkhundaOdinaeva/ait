package inheritance.auto.model;

public class Auto {

    private String model;
    private int year;
    private int power;
    private String color;

    public void printDetails() {
        System.out.println("Модель " + this.model + ", Год " + this.year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}