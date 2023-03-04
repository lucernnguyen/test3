


public class Guitar {
    //fields
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
   
    //methods
    public Guitar(){
        serialNumber="";
        price=0;
        builder="";
        model="";
        backWood="";
        topWood="";
    }
    public Guitar(String serialNumber, int price, String builder, String model, String backWood,String topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder= builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getserialNumber(){
        return serialNumber;
    }
    public void setserialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public int getprice(){
        return price;
    }
    
    public void setprice(int price){
        this.price = price;
    }
    
    public String getbuilder(){
        return builder;
    }
    public void setbuilder(String builder){
        this.builder = builder;
    }
    
    public String getmodel(){
        return model;
    }
    public void setmodel(String model){
        this.model = model;
    }
    
    public String getbackWood(){
        return backWood;
    }
    public void setbackWood(String backWood){
        this.backWood = backWood;
    }
    
    public String gettopWood(){
        return topWood;
    }
    public void settopWood(String topWood){
        this.topWood = topWood;
    }
    
    public void createSound(){
        if(Guitar()=""){
            System.out.println("There is no guitar");
        }
        else{
        System.out.println("serialNumber: " + serialNumber);
        System.out.println("price: " + price);
        System.out.println("builder: " + builder);
        System.out.println("model: " + model);
        System.out.println("backWood: " + backWood);
        System.out.println("topWood: " + topWood);
    }
    }
    public static void main(String[] args) {
           
    }
}
