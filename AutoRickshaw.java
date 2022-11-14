
/**
 *AutoRickShaw is extended class of Parent class named Vehicle which holds different type of Attributes.
 *
 * @author (Dipesh Bharati)
 * @ID (np05cp4s220022)
 */
//Creation of subclass AutoRickShaw
public class AutoRickshaw extends Vehicle
{
    // instance variables
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;

    /**
     * Constructor for objects of class AutoRickShaw
     */
    public AutoRickshaw( int vehicleId, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, int engineDisplacement, String torque, int fuelTankCapacity, String groundClearance)
    {
        // initialise instance variables
        super(vehicleId, vehicleName, vehicleWeight, vehicleColor);
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor);
        this.engineDisplacement = engineDisplacement;
        this.torque = torque;
        this.fuelTankCapacity = fuelTankCapacity;
        this.groundClearance = groundClearance;
        this.isBooked = false;
    }
    //Getter method
    public int getEngineDisplacement()
    {
        return this.engineDisplacement;
    }
    public String getTorque()
    {
        return this.torque;
    }
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
    public int getFuelTankCapacity()
    {
        return this.fuelTankCapacity;
    }
    public String getGroundClearance()
    {
        return this.groundClearance;
    }
    public int getChargeAmount()
    {
        return this.chargeAmount;
    }
    public String getBookedDate()
    {
        return this.bookedDate;
    }
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
    //end of getter method
    //setter method
    public void setChargeAmount(int chargeAmount)
    {
        this.chargeAmount = chargeAmount;
    }
    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }
    //end of setter method
    //creating method for book
    public void book(String bookedDate, int chargeAmount, int numberOfSeats)
    {
        if(!isBooked) {
            this.bookedDate = bookedDate;
            this.setChargeAmount(chargeAmount);
            this.setNumberOfSeats(numberOfSeats);
            this.isBooked = true;
            System.out.println("vehicle with ID "+this.getVehicleId()+" is Booked");
        }
        else {
            System.out.println("Your AutoRickshaw is already booked");
        }
    }
    //Final method was created to display the output
    public void display()
    {
        super.display();
        if(isBooked == true)
        {
            System.out.println("The EngineDisplacement is "+this.getEngineDisplacement());
            System.out.println("The torque is "+this.getTorque());
            System.out.println("The Fueltank is "+this.getFuelTankCapacity());
            System.out.println("This Ground Clearance is "+this.getGroundClearance());
            System.out.println("The booked date is "+this.getBookedDate());
        }
        if(chargeAmount == 0)
        {
            System.out.println("!!NOT CHARGED YET");
        }
        else
        {
            System.out.println("The charged amount is "+this.getChargeAmount());
        }
        if(numberOfSeats == 0)
        {
            System.out.println("!!There are no seats Available");
        }
        else
        {
            System.out.println("Seats are Available");
        }
    }
    
}   


