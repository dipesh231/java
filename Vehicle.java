/**
 * Vehicle is a Parent class which holds different type of Attributes.
 * @author (Dipesh Bharati)
 * @ID (np05cp4s220022)
 */
//creation of class Vehicle
public class Vehicle
{
    // instance variables
    private int vehicleId;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(int vehicleId, String vehicleName, String vehicleWeight, String vehicleColor)
    {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleWeight = vehicleWeight;
        this.vehicleColor = vehicleColor;
    }
    //Getter method
    public int getVehicleId()
    {
        return this.vehicleId;
    }
    public String getVehicleName()
    {  
        return this.vehicleName;
    }
    public String getVehicleWeight()
    {
        return this.vehicleWeight;
    }
    public String getVehicleColor()
    {
        return this.vehicleColor;
    }
    public String getVehicleSpeed()
    {
        return this.vehicleSpeed;
    }
    //End of getter method
    //Setter method
    public void setVehicleSpeed(String vehicleSpeed)
    { 
        this.vehicleSpeed=vehicleSpeed;
    }
    public void setVehicleColor(String vehicleColor)
    {
        this.vehicleColor = vehicleColor;
    }
    //End of setter method
    //Final method was created to display the output
    public void display()
    {
        System.out.println("Vehicle Id : "+this.getVehicleId());
        System.out.println("Vehicle Name : "+this.getVehicleName());
        System.out.println("Vehicle Speed : "+this.getVehicleSpeed());
        System.out.println("Vehicle Color : "+this.getVehicleColor());
        if(getVehicleWeight().equals("")) {
            System.out.println("Vehicle Weight is not mentioned");
        }
        else {
            System.out.println("Vehicle Weight : "+this.getVehicleWeight());
        }
    }
}
