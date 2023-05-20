package encapsulation;

public class Cake {
    private int cakeId;
    private String flavor;
    private String color;
    private String shape;
    private double price;

    public void setCakeId(int cakeId){
        this.cakeId=cakeId;
    }
    public int getCakeId(){
        return cakeId;
    }
    public void setFlavor(String flavor){
        this.flavor=flavor;
    }
    public String getFlavor(){
        return flavor;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setShape(String shape){
        this.shape=shape;
    }
    public String getShape(){
        return shape;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
}
