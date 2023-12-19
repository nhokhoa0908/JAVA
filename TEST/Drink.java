package TEST;

public class Drink {
    String code;
    String name;
    String make;
    double volume;
    double price;
    String company;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
    public Drink(String code, String name, String make, double volume, double price, String company) {
        this.code = code;
        this.name = name;
        this.make = make;
        this.volume = volume;
        this.price = price;
        this.company = company;
    }
    @Override
    public String toString() {
        return "Drink [code=" + code + ", name=" + name + ", make=" + make + ", volume=" + volume + "ml" + ", price=" + price + ", company=" + company + "]";
    }
    
}
