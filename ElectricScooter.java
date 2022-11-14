/**
 * ElectricScooter is extended class of Parent class named Vehicle which holds different type of Attributes.
 * @author (Dipesh Bharati)
 * @ID (np05cp4s220022)
 */
//Creation of subclass ElectricScooter
public class ElectricScooter extends Vehicle
{
    // instance variables
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    /**
     * Constructor for objects of class ElectricScooter
     */
    public ElectricScooter(int vehicleId , String vehicleName , String vehicleWeight , String vehicleColor , String vehicleSpeed , int batteryCapacity )
    {
        super(vehicleId, vehicleName, vehicleWeight, vehicleColor);
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor); 
        this.batteryCapacity = batteryCapacity;
        this.range = 0;
        this.price = 0;
        this.brand = "";
        this.mileage = "";
        this.chargingTime = "";
        this.hasPurchased = false;
        this.hasSold = false;
    }
    //Getter method
    public int getRange()
    {
        return this.range;
    }
    public int getBatteryCapacity()
    {
        return this.batteryCapacity; 
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getChargingTime()
    {
        return this.chargingTime;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public String getMileage()
    {
        return this.mileage;
    }
    public boolean getHasPurchased()
    {
        return this.hasPurchased;
    }
    public boolean getHasSold()
    {
        return this.hasSold;
    }
    //End of getter method
    //setter method
    public void setTheBrand(String brand)
    {
        if(!hasPurchased) {
            this.brand = brand;
        }
        else {
            System.out.println("The vehicle has already been sold therefore the brand cannot be changed ");
        }
    }
    //End of setter method
    //creating method for purchase
    public void purchase(String brand , int price , String chargingTime , String mileage , int range)
    {
        if(!hasPurchased) {
            this.setTheBrand(brand);
            this.price = price;
            this.chargingTime = chargingTime;
            this.mileage = mileage;
            this.range = range;
            this.hasPurchased = true;
        }
    }
    //creating method for sell
    public void sell( int price )
    {
        if(!hasSold) {
            this.price = price; 
            this.chargingTime = "";
            this.mileage = "";
            this.batteryCapacity = 0;
            this.range = 0;
            this.hasSold = true;
            this.hasPurchased = false;
        }
        else {
            System.out.println("The scooty has already been sold ");
        }
    }
    //Final method was created to display the output
    public void display()
    {
        super.display();
        if(hasPurchased == true) {
            System.out.println("The brand is "+this.getBrand());
            System.out.println("This Battery capacity is "+this.getBatteryCapacity());
            System.out.println("The mileage is "+this.getMileage());
            System.out.println("The charging time is "+this.getChargingTime());
        }
    }
}

