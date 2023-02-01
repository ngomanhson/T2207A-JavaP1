package Session3;

public class Car {
    private String brand;
    private String name;
    private  int price;

    public Car(String brand, String name, int price){
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand(){ //getter
        return brand;
    }
    public void setBrand (String brand){ //Setter
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
