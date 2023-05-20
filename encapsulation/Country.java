package encapsulation;

public class Country {
    private int Id;
    private int countryCode;
    private String countryName;
    private int noOfStates;
    private String population;
    private String currency;
    private String capital;
    private String economy;

    public void setId(int Id){
        this.Id=Id;
    }
    public int getId(){
        return Id;
    }
    public void setCountryCode(int countryCode){
        this.countryCode=countryCode;
    }
    public int getCountryCode(){
        return countryCode;
    }
    public void setCountryName(String countryName){
        this.countryName=countryName;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setNoOfStates(int noOfStates){
        this.noOfStates=noOfStates;
    }
    public int getNoOfStates(){
        return noOfStates;
    }
    public void setPopulation(String population){
        this.population=population;
    }
    public String getPopulation(){
        return population;
    }
    public void setCurrency(String currency){
        this.currency=currency;
    }
    public String getCurrency(){
        return currency;
    }
    public void setCapital(String capital){
        this.capital=capital;
    }
    public String getCapital(){
        return capital;
    }
    public void setEconomy(String economy){
        this.economy=economy;
    }
    public String getEconomy(){
        return economy;
    }
}
