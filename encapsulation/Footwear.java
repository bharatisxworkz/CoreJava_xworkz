package encapsulation;

public class Footwear {
    private int Id;
    private String brand;
    private int size;
    private double price;
    private String material;

    public void setId(int Id){
        this.Id=Id;
    }
    public int getId(){
        return Id;
    }
    public void setBrand( String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public String getMaterial(){
        return material;
    }
}
