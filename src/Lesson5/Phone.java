package Lesson5;

public class Phone {
    private String name;
    private String model;
    private int price;
    private int memory;

    public Phone(String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }
    public Phone() {

    }
    public String getName() {

        return name;
    }
    public void setName() {

        this.name = name;
    }
    public String getModel() {

        return model;
    }
    public void setModel() {

        this.model = model;
    }
    public int getPrice() {

        return price;
    }
    public void setPrice() {

        this.price = price;
    }
    public int getMemory() {

        return memory;
    }
    public void setMemory() {
        this.memory = memory;
    }
    public String getCategory() {
        if (price > 1000) return "TOP";
        else if (price <= 1000 && price >= 500) return "MEDIUM";
        return "SIMPLE";
    }
}