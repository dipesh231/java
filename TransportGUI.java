//Creation of GUI for AutoRickshaw
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JComboBox;
import java.util.ArrayList;
import java.awt.Color;

public class TransportGUI {
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private JFrame homeFrame,frame,frameElectric;
    private JTextField fieldID,fieldName,fieldWeight,fieldColor,fieldSpeed,fieldEngineDisplacement,fieldTorque,fieldTankCapacity,fieldGroundClearance;
    private JTextField fieldiD,fieldAmount,fieldSeats;
    private JTextField fieldElectricId,fieldElectricName,fieldElectricWeight,fieldElectricColor,fieldElectricSpeed,fieldElectricBattery;
    private JTextField fieldPurElectricId,fieldBrand,fieldPrice,fieldChargingTime,fieldMileage,fieldRange;
    private JTextField fieldSellElectricID,fieldSellPrice;
    private JButton BTNBK;
    private JButton BTNDS;
    private JButton BTNCLR;
    private JButton BTNADD;
    private JButton back;
    private JButton electricScooterBtn,autoRickshawBtn,BTNelectricDisplay;
    private JButton BTNADDScooter,BTNPurchase,BTNSell,BTNelectricCLR;
    private JComboBox<String> d,m,y;
    final static int INVALID = -2;

    //Creating GUI  
    public TransportGUI(){
        homeFrame = new JFrame("Home");
        try {
            homeFrame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("darkwood.jpg")))));

        } catch (IOException e) {
            System.out.println("image doesn't exist");
        }

        frame = new JFrame();
        try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("light.jpg")))));

        } catch (IOException e) {
            System.out.println("image doesn't exist");
        }

        frameElectric = new JFrame("Electric Scooter");
        try {
            frameElectric.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("light.jpg")))));

        } catch (IOException e) {
            System.out.println("image doesn't exist");
        }

        autoRickshawBtn = new JButton("AutoRickShaw");
        autoRickshawBtn.setBounds(250,150,200,50);
        homeFrame.add(autoRickshawBtn);
        autoRickshawBtn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {

                    frame.setVisible(true);
                    homeFrame.setVisible(false);
                }
            });

        electricScooterBtn = new JButton("Electric Scooter");
        electricScooterBtn.setBounds(250,250,200,50);
        homeFrame.add(electricScooterBtn);
        electricScooterBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    frameElectric.setVisible(true);
                    homeFrame.setVisible(false);
                }

            });

        JLabel title = new JLabel("Welcome");
        title.setBounds(250, 10, 300, 50);
        homeFrame.add(title);
        title.setFont(new Font("serif", Font.PLAIN, 50));
        title.setForeground(Color.white);

        JLabel label = new JLabel("AutoRickshaw");
        label.setBounds(600, 10, 500, 50);
        frame.add(label);
        label.setFont(new Font("serif", Font.PLAIN, 40));

        JLabel label2 = new JLabel("Electric Scooter");
        label2.setBounds (600, 10, 500, 50);
        frameElectric.add(label2);
        label2.setFont(new Font("serif", Font.PLAIN, 40));

        frame.setSize(1920,1080 );
        frame.setLayout(null);
        frame.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frameElectric.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameElectric.setLayout(null);
        frameElectric.setSize(1920,1080 );

        homeFrame.setLayout(null);
        homeFrame.setSize(700,500);
        homeFrame.setVisible(true);
        homeFrame.setLocation(400, 150);

        //GUI for AddAutoRickshaw

        JLabel vehicleID = new JLabel("Vehicle ID : ");
        vehicleID.setBounds(50, 90, 95, 35);
        frame.add(vehicleID);

        fieldID = new JTextField();
        fieldID.setBounds(180, 90, 200, 35);
        frame.add(fieldID);

        JLabel vehicleName = new JLabel("Vehicle Name:");
        vehicleName.setBounds(50, 150, 105, 35);
        frame.add(vehicleName);

        fieldName = new JTextField();
        fieldName.setBounds(180, 150, 200, 35);
        frame.add(fieldName);

        JLabel vehicleWeight = new JLabel("Vehicle Weight : ");
        vehicleWeight.setBounds(50, 210, 105, 35);
        frame.add(vehicleWeight);

        fieldWeight = new JTextField();
        fieldWeight.setBounds(180, 210, 200, 35);
        frame.add(fieldWeight);

        JLabel vehicleColor = new JLabel("Vehicle Color: ");
        vehicleColor.setBounds(50, 270, 105, 35);
        frame.add(vehicleColor);

        fieldColor = new JTextField();
        fieldColor.setBounds(180, 270, 200, 35);
        frame.add(fieldColor);

        JLabel vehicleSpeed = new JLabel("Vehicle Speed:");
        vehicleSpeed.setBounds(50, 330, 105, 35);
        frame.add(vehicleSpeed);

        fieldSpeed = new JTextField();
        fieldSpeed.setBounds(180, 330, 200, 35);
        frame.add(fieldSpeed);

        JLabel engineDisplacement = new JLabel("Engine Displacement:");
        engineDisplacement.setBounds(50, 390, 128, 35);
        frame.add(engineDisplacement);

        fieldEngineDisplacement = new JTextField();
        fieldEngineDisplacement.setBounds(180, 390, 200, 35);
        frame.add(fieldEngineDisplacement);

        JLabel torque = new JLabel("Torque:");
        torque.setBounds(500, 150, 105, 35);
        frame.add(torque);

        fieldTorque = new JTextField();
        fieldTorque.setBounds(640, 150, 200, 35);
        frame.add(fieldTorque);

        JLabel fuelTankCapacity = new JLabel("Fuel Tank Capacity:");
        fuelTankCapacity.setBounds(500, 90, 135, 35);
        frame.add(fuelTankCapacity);

        fieldTankCapacity = new JTextField();
        fieldTankCapacity.setBounds(640, 90, 200, 35);
        frame.add(fieldTankCapacity);

        JLabel groundClearance = new JLabel("Ground Clearance:");
        groundClearance.setBounds(500, 210, 135, 35);
        frame.add(groundClearance);

        fieldGroundClearance = new JTextField();
        fieldGroundClearance.setBounds(640,210, 200, 35);
        frame.add(fieldGroundClearance);

        //GUI for bookAutoRickshaw    
        JLabel iD = new JLabel("Vehicle ID:");
        iD.setBounds(1000, 90, 135, 35);
        frame.add(iD);

        fieldiD = new JTextField();
        fieldiD.setBounds(1140, 90, 200, 35);
        frame.add(fieldiD);

        JLabel bookedDate = new JLabel("Booked Date:");
        String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        String year[]={"2015","2016","2017","2018","2019","2020","2021","2022"};
        d = new JComboBox<>(day);
        m = new JComboBox<>(month);
        y = new JComboBox<>(year);
        bookedDate.setBounds(1000, 150, 135, 35);
        d.setBounds(1140,150,50,35);
        m.setBounds(1190,150,50,35);
        y.setBounds(1240,150,100,35);
        frame.add(bookedDate);
        frame.add(d);
        frame.add(m);
        frame.add(y);
        JLabel chargeAmount = new JLabel("Charge Amount:");
        chargeAmount.setBounds(1000, 210, 135, 35);
        frame.add(chargeAmount);

        fieldAmount = new JTextField();
        fieldAmount.setBounds(1140, 210, 200, 35);
        frame.add(fieldAmount);

        JLabel numberOfSeats = new JLabel("Number of Seats");
        numberOfSeats.setBounds(1000, 270, 135, 35);
        frame.add(numberOfSeats);

        fieldSeats = new JTextField();
        fieldSeats.setBounds(1140, 270, 200, 35);
        frame.add(fieldSeats);

        //GUI for Electric Scooter
        JLabel electricVehicleID = new JLabel("Vehicle ID : ");
        electricVehicleID.setBounds(50, 90, 105, 35);
        frameElectric.add(electricVehicleID);

        fieldElectricId = new JTextField();
        fieldElectricId.setBounds(180, 90, 200, 35);
        frameElectric.add(fieldElectricId);

        JLabel electricVehicleName = new JLabel("Vehicle Name:");
        electricVehicleName.setBounds(50, 150, 95, 35);
        frameElectric.add(electricVehicleName);

        fieldElectricName = new JTextField();
        fieldElectricName.setBounds(180, 150, 200, 35);
        frameElectric.add(fieldElectricName);

        JLabel electricVehicleWeight = new JLabel("Vehicle Weight : ");
        electricVehicleWeight.setBounds(50, 210, 105, 35);
        frameElectric.add(electricVehicleWeight);

        fieldElectricWeight = new JTextField();
        fieldElectricWeight.setBounds(180, 210, 200, 35);
        frameElectric.add(fieldElectricWeight);

        JLabel electricVehicleColor = new JLabel("Vehicle Color: ");
        electricVehicleColor.setBounds(50, 270, 105, 35);
        frameElectric.add(electricVehicleColor);

        fieldElectricColor = new JTextField();
        fieldElectricColor.setBounds(180, 270, 200, 35);
        frameElectric.add(fieldElectricColor);

        JLabel electricVehicleSpeed = new JLabel("Vehicle Speed:");
        electricVehicleSpeed.setBounds(50, 330, 105, 35);
        frameElectric.add(electricVehicleSpeed);

        fieldElectricSpeed = new JTextField();
        fieldElectricSpeed.setBounds(180, 330, 200, 35);
        frameElectric.add(fieldElectricSpeed);

        JLabel electricBatteryCapacity = new JLabel("Battery Capacity:");
        electricBatteryCapacity.setBounds(50, 390, 128, 35);
        frameElectric.add(electricBatteryCapacity);

        fieldElectricBattery = new JTextField();
        fieldElectricBattery.setBounds(180, 390, 200, 35);
        frameElectric.add(fieldElectricBattery);

        ///GUI for Purchasing Scooter

        JLabel purElectricScooterID = new JLabel("Vehicle ID : ");
        purElectricScooterID.setBounds(500, 90, 135, 35);
        frameElectric.add(purElectricScooterID);

        fieldPurElectricId = new JTextField();
        fieldPurElectricId.setBounds(640, 90, 200, 35);
        frameElectric.add(fieldPurElectricId);

        JLabel brand = new JLabel("Brand");
        brand.setBounds(500, 150, 105, 35);
        frameElectric.add(brand);

        fieldBrand = new JTextField();
        fieldBrand.setBounds(640, 150, 200, 35);
        frameElectric.add(fieldBrand);

        JLabel price = new JLabel("Price");
        price.setBounds(500, 210, 135, 35);
        frameElectric.add(price);

        fieldPrice = new JTextField();
        fieldPrice.setBounds(640,210, 200, 35);
        frameElectric.add(fieldPrice);

        JLabel chargingTime = new JLabel("Charging Time");
        chargingTime.setBounds(500, 270, 105, 35);
        frameElectric.add(chargingTime);

        fieldChargingTime = new JTextField();
        fieldChargingTime.setBounds(640, 270, 200, 35);
        frameElectric.add(fieldChargingTime);

        JLabel mileage = new JLabel("Mileage");
        mileage.setBounds(500, 330, 105, 35);
        frameElectric.add(mileage);

        fieldMileage = new JTextField();
        fieldMileage.setBounds(640, 330, 200, 35);
        frameElectric.add(fieldMileage);

        JLabel range = new JLabel("Range");
        range.setBounds(500, 390, 128, 35);
        frameElectric.add(range);

        fieldRange = new JTextField();
        fieldRange.setBounds(640, 390, 200, 35);
        frameElectric.add(fieldRange);
        ///GUI for Selling Scooter
        JLabel sellElectricID = new JLabel("Vehicle ID:");
        sellElectricID.setBounds(1000, 90, 135, 35);
        frameElectric.add(sellElectricID);

        fieldSellElectricID = new JTextField();
        fieldSellElectricID.setBounds(1140, 90, 200, 35);
        frameElectric.add(fieldSellElectricID);

        JLabel sellPrice = new JLabel("Price");
        sellPrice.setBounds(1000, 150, 135, 35);
        frameElectric.add(sellPrice);

        fieldSellPrice = new JTextField();
        fieldSellPrice.setBounds(1140, 150, 200, 35);
        frameElectric.add(fieldSellPrice);

        //GUI for AutoRickshaw button

        back = new JButton("Back ");
        back.setBounds(700,700,150,45);
        frame.add(back);
        back.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    homeFrame.setVisible(true);
                    frame.setVisible(false);
                }
            });

        BTNADD = new JButton("Add an AutoRickshaw");
        BTNADD.setBounds(600, 400, 205, 55);
        BTNADD.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    addAutoRickshaw();

                }
            });

        frame.add(BTNADD);
        BTNBK = new JButton("Book the AutoRickshaw ");
        BTNBK.setBounds(1050, 350, 205, 55);
        BTNBK.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    bookAutoRickshaw();

                }
            });

        frame.add(BTNBK);

        BTNCLR = new JButton("Clear");
        BTNCLR.setBounds(50, 580, 145, 50);

        frame.add(BTNCLR);
        BTNCLR.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    clearAutoRickshaw();

                }
            });

        BTNDS = new JButton("Display");
        BTNDS.setBounds(1000, 580, 165, 50);
        BTNDS.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    displayAutoRickshaw();

                }
            }); 
        frame.add(BTNDS);
        ///Buttons for Electric Scooter

        back = new JButton("Back ");
        back.setBounds(700,700,150,45);
        frameElectric.add(back);
        back.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    homeFrame.setVisible(true);
                    frameElectric.setVisible(false);
                }
            });

        BTNADDScooter = new JButton("Add an Electric Scooter");
        BTNADDScooter.setBounds(190, 500, 205, 55);
        BTNADDScooter.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    addElectricScooter();
                }
            });

        frameElectric.add(BTNADDScooter);

        BTNPurchase = new JButton("Purchase the ElectricScooter ");
        BTNPurchase.setBounds(600, 500, 205, 55);
        BTNPurchase.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    purElectricScooter();
                }
            });
            frameElectric.add(BTNPurchase);

        BTNSell = new JButton("Sell the ElectricScooter");
        BTNSell.setBounds(1090, 300, 205, 55);
        BTNSell.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    sellElectricScooter();
                }
            });

        frameElectric.add(BTNSell);

        BTNelectricDisplay = new JButton("Display");
        BTNelectricDisplay.setBounds(1200, 580, 165, 50);
        BTNelectricDisplay.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    displayElectricScooter();

                }
            }); 
        frameElectric.add(BTNelectricDisplay);

        BTNelectricCLR = new JButton("Clear");
        BTNelectricCLR.setBounds(50, 580, 145, 50);

        frameElectric.add(BTNelectricCLR);
        BTNelectricCLR.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    clearElectricScooter();

                }
            });
    }

    ///Get for adding AutoRickshaw

    public String getVehicleName(){
        return fieldName.getText().trim();
    }

    public String getVehicleWeight()
    {
        return fieldWeight.getText().trim();
    }

    public int getVehicleId(){
        String vehicleIdText = fieldID.getText().trim();
        int vehicleID = INVALID;
        try{
            vehicleID = Integer.parseInt(vehicleIdText);
            if(vehicleID <=0){
                vehicleID = INVALID;
            }
        }
        catch(NumberFormatException e){
        }
        return vehicleID;
    }

    public String getVehicleColor(){
        return fieldColor.getText().trim();
    }

    public String getVehicleSpeed(){
        return fieldSpeed.getText().trim();
    }

    public int getVehicleDisplacement(){
        String vehicleDisplacementText = fieldEngineDisplacement.getText().trim();
        int vehicleDisplacement = INVALID;
        try{
            vehicleDisplacement = Integer.parseInt(vehicleDisplacementText);
            if(vehicleDisplacement <=0){
                vehicleDisplacement = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return vehicleDisplacement;
    }

    public int getFuelTankCapacity()
    {
        String fuelTankText = fieldTankCapacity.getText().trim();
        int fuelTank = INVALID;
        try {
            fuelTank = Integer.parseInt(fuelTankText);
            if(fuelTank <=0) {
                fuelTank = INVALID;
            }
        }
        catch(NumberFormatException e) {
        }
        return fuelTank;
    }

    public String getTorque()
    {
        return fieldTorque.getText().trim();
    }

    public String getClearance()
    {
        return fieldGroundClearance.getText().trim();
    }

    ///Get for Booking AutoRickshaw
    public int getBookVehicleId(){
        String vehicleIdText = fieldiD.getText().trim();
        int vehicleID = INVALID;
        try{
            vehicleID = Integer.parseInt(vehicleIdText);
            if(vehicleID <=0){
                vehicleID = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return vehicleID;
    }

    public String getBooked(){
        String day = d.getSelectedItem().toString();
        String month = m.getSelectedItem().toString();
        String year = y.getSelectedItem().toString();
        return day+month+year;
    }

    public int getChargeAmount(){
        String chargeAmountText = fieldAmount.getText().trim();
        int chargeAmount = INVALID;
        try{
            chargeAmount = Integer.parseInt(chargeAmountText);
            if(chargeAmount <= 0) {
                chargeAmount = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return chargeAmount;
    }

    public int getNumberOfSeats(){
        String numberOfSeatsText = fieldSeats.getText().trim();
        int numberOfSeats = INVALID;
        try{
            numberOfSeats = Integer.parseInt(numberOfSeatsText);
            if(numberOfSeats <=0){
                numberOfSeats = INVALID;
            }
        }
        catch(NumberFormatException e){
        }
        return numberOfSeats;
    }

    ///Get for adding Electric Scooter
    public int getAddElectricVehicleId(){
        String addElectricVehicleIdText = fieldElectricId.getText().trim();
        int addElectricVehicleID = INVALID;
        try{
            addElectricVehicleID = Integer.parseInt(addElectricVehicleIdText);
            if(addElectricVehicleID <=0){
                addElectricVehicleID = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return addElectricVehicleID;
    }

    public String getElectricVehicleName(){
        return fieldElectricName.getText().trim();
    }

    public String getElectricVehicleWeight()
    {
        return fieldElectricWeight.getText().trim();
    }

    public String getElectricVehicleColor(){
        return fieldElectricColor.getText().trim();
    }

    public String getElectricVehicleSpeed(){
        return fieldElectricSpeed.getText().trim();
    }

    public int getElectricBatteryCapacity(){
        String addBatteryCapacityText = fieldElectricBattery.getText().trim();
        int addBatteryCapacity = INVALID;
        try{
            addBatteryCapacity = Integer.parseInt(addBatteryCapacityText);
            if(addBatteryCapacity <=0){
                addBatteryCapacity = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return addBatteryCapacity;
    }

    public String getBrand(){
        return fieldBrand.getText().trim();
    }

    ///Get for Purchase
    public int getPurElectricVehicleId(){
        String purElectricVehicleIdText = fieldPurElectricId.getText().trim();
        int purElectricVehicleID = INVALID;
        try{
            purElectricVehicleID = Integer.parseInt(purElectricVehicleIdText);
            if(purElectricVehicleID <=0){
                purElectricVehicleID = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return purElectricVehicleID;
    }

    public int getPrice(){
        String priceText = fieldPrice.getText().trim();
        int price = INVALID;
        try{
            price = Integer.parseInt(priceText);
            if(price <=0){
                price = INVALID;
            }
        }
        catch(NumberFormatException e){
        }
        return price;
    }

    public String getChargingTime(){
        return fieldChargingTime.getText().trim();
    }

    public String getMileage(){
        return fieldMileage.getText().trim();
    }

    public int getRange(){
        String rangeText = fieldRange.getText().trim();
        int range = INVALID;
        try{
            range = Integer.parseInt(rangeText);
            if(range <=0){
                range = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return range;
    }
    ///Get for Selling
    public int getSellElectricVehicleId(){
        String sellElectricVehicleIdText = fieldSellElectricID.getText().trim();
        int sellElectricVehicleID = INVALID;
        try{
            sellElectricVehicleID = Integer.parseInt(sellElectricVehicleIdText);
            if(sellElectricVehicleID <=0){
                sellElectricVehicleID = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return sellElectricVehicleID;
    }

    public int getSellPrice(){
        String priceText = fieldSellPrice.getText().trim();
        int price = INVALID;
        try{
            price = Integer.parseInt(priceText);
            if(price <=0){
                price = INVALID;
            }
        }
        catch(NumberFormatException e){

        }
        return price;
    }

    public boolean checkIfUnique(int vehicleId)
    {
        boolean isUnique = true;
        for(Vehicle vl: vehicleList)
        {
            if(vl.getVehicleId() == vehicleId)
            {
                JOptionPane.showMessageDialog(frame,"Vehicle Id must be unique","ERROR",
                    JOptionPane.ERROR_MESSAGE);
                isUnique = false;
                break;
            }
        }
        return isUnique; 
    }
    //Method of Add AutoRickshaw
    public void addAutoRickshaw()
    {
        if (getVehicleName().isEmpty()||getVehicleWeight().isEmpty()||getVehicleColor().isEmpty()||getVehicleSpeed().isEmpty()||getTorque().isEmpty()||getClearance().isEmpty()){
            JOptionPane.showMessageDialog(frame,"Please fill all the fields","WARNING",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(getVehicleId()==INVALID||getVehicleDisplacement()==INVALID||getFuelTankCapacity()==INVALID){
            JOptionPane.showMessageDialog(frame, "Please enter integer value in VehicleId\nor EngineDisplacement or Fuel Tank Capacity","Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (checkIfUnique(getVehicleId()))
        {
            vehicleList.add(new AutoRickshaw(getVehicleId(), getVehicleName(), getVehicleWeight(), getVehicleColor(), getVehicleSpeed(), getVehicleDisplacement(), getTorque(), getFuelTankCapacity(), getClearance()));
            JOptionPane.showMessageDialog(frame,"AutoRickshaw is successfully added.","Message",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //method for add Electric scooter
    public void addElectricScooter()
    {
        if (getElectricVehicleName().isEmpty()||getElectricVehicleSpeed().isEmpty()||getElectricVehicleColor().isEmpty()||getElectricVehicleWeight().isEmpty()){
            JOptionPane.showMessageDialog(frame,"Please fill all the fields","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(getAddElectricVehicleId()==INVALID||getElectricBatteryCapacity()==INVALID){
            JOptionPane.showMessageDialog(frame, "Please enter integer value in VehicleId\nor Electric battery Capacity","Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (checkIfUnique(getAddElectricVehicleId()))
        {
            vehicleList.add(new ElectricScooter(getAddElectricVehicleId(), getElectricVehicleName(), getElectricVehicleWeight(), getElectricVehicleColor(), getElectricVehicleSpeed(), getElectricBatteryCapacity()));
            JOptionPane.showMessageDialog(frame,"Electric Scooter is successfully added. ","message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    ///method for booking autoRickshaw
    
    public void bookAutoRickshaw()
    {
        if (getBookVehicleId()==INVALID || getChargeAmount()==INVALID || getNumberOfSeats()==INVALID){
            JOptionPane.showMessageDialog(frame, "Please enter integer value in VehicleID or ChargeAmount or Number of seats","Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        for(Vehicle autoVehicle:vehicleList){
            if(getBookVehicleId()==autoVehicle.getVehicleId()){
                if(autoVehicle instanceof AutoRickshaw){
                    AutoRickshaw obj = (AutoRickshaw)autoVehicle;
                    if (obj.getIsBooked()) {
                        JOptionPane.showMessageDialog(frame, "AutoRickshaw is already booked","Warning",
                            JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    obj.book(getBooked(),getChargeAmount(), getNumberOfSeats());
                    JOptionPane.showMessageDialog(frame, "AutoRickshaw is succesfully Booked","Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }

        } 

        if (!vehicleList.contains(getBookVehicleId())){
            JOptionPane.showMessageDialog(frame, "Vehicle is not in list","Warning",
                JOptionPane.WARNING_MESSAGE);
        }

    }
    //method for purchasing Electric Scooter
    public void purElectricScooter()
    {
        if (getPurElectricVehicleId()==INVALID || getPrice()==INVALID || getRange()==INVALID){
            JOptionPane.showMessageDialog(frame, "Please enter integer value in VehicleID or Price or Range","Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        for(Vehicle E_Vehicle:vehicleList){
            if(getPurElectricVehicleId()==E_Vehicle.getVehicleId()){
                if(E_Vehicle instanceof ElectricScooter){
                    ElectricScooter obj = (ElectricScooter)E_Vehicle;
                    if (obj.getHasPurchased()) {
                        JOptionPane.showMessageDialog(frame, "ElectricScooter is already Purchased","Message",
                            JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    obj.purchase(getBrand(), getPrice(), getChargingTime(), getMileage(), getRange());
                    JOptionPane.showMessageDialog(frame, "ElectricScooter is succesfully Purchased","Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }

        }    
        if (!vehicleList.contains(getPurElectricVehicleId())) {
            JOptionPane.showMessageDialog(frameElectric, "Vehicle is not in list","Warning",
                JOptionPane.WARNING_MESSAGE);

        }
    }
    ///Method for selling Electric Scooter
    
    public void sellElectricScooter()
    {
        if (getSellElectricVehicleId()==INVALID || getSellPrice()==INVALID){
            JOptionPane.showMessageDialog(frame, "Please enter integer value in VehicleID or Price","Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(Vehicle E_Vehicle:vehicleList){
            if(getSellElectricVehicleId()==E_Vehicle.getVehicleId()){
                if(E_Vehicle instanceof ElectricScooter){
                    ElectricScooter obj = (ElectricScooter)E_Vehicle;
                    if (obj.getHasSold()) {
                        JOptionPane.showMessageDialog(frame, "ElectricScooter is already Sold","Message",
                            JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }                    
                    obj.sell(getSellPrice());
                    JOptionPane.showMessageDialog(frame, "ElectricScooter is succesfully Sold","Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }

        }   
        if (!vehicleList.contains(getSellElectricVehicleId())) {
            JOptionPane.showMessageDialog(frameElectric, "Vehicle is not in list","Warning",
                JOptionPane.WARNING_MESSAGE);

        } 
    }
    ///method for displaying autorickshaw
    public void displayAutoRickshaw(){
        if(vehicleList.isEmpty()){
            JOptionPane.showMessageDialog(frame, "There is no vehicle available Right now","Message",
                JOptionPane.INFORMATION_MESSAGE);
        }
        for(Vehicle autoVehicle:vehicleList){
            if(autoVehicle instanceof AutoRickshaw){
                AutoRickshaw obj = (AutoRickshaw)autoVehicle;
                obj.display();
                JOptionPane.showMessageDialog(frame, "It is printed in Terminal","Message",
                    JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
        }

    }
    ///method for displaying electric scooter
    public void displayElectricScooter(){
        if(vehicleList.isEmpty()){
            JOptionPane.showMessageDialog(frame, "There is no Scooter available Right now","Message",
                JOptionPane.INFORMATION_MESSAGE);
        }
        for(Vehicle E_Vehicle:vehicleList){
            if(E_Vehicle instanceof ElectricScooter){
                ElectricScooter obj = (ElectricScooter)E_Vehicle;
                obj.display();
                JOptionPane.showMessageDialog(frame, "It is printed in Terminal","Message",
                    JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
        }

    }

    //Function for clear AutoRickshaw 
    public void clearAutoRickshaw(){
        fieldID.setText(null);
        fieldName.setText(null);
        fieldWeight.setText(null);
        fieldColor.setText(null);
        fieldSpeed.setText(null);
        fieldEngineDisplacement.setText(null);
        fieldTorque.setText(null);
        fieldTankCapacity.setText(null);
        fieldGroundClearance.setText(null);
        fieldiD.setText("");
        y.setSelectedIndex(0);
        m.setSelectedIndex(0);
        d.setSelectedIndex(0);
        fieldSeats.setText("");
        fieldAmount.setText("");
    }
    ///Function for Clear Electric Scooter
    public void clearElectricScooter()
    {
        fieldElectricName.setText("");
        fieldElectricId.setText("");
        fieldElectricWeight.setText("");
        fieldElectricColor.setText("");
        fieldElectricSpeed.setText("");
        fieldElectricBattery.setText("");
        fieldPurElectricId.setText("");
        fieldBrand.setText("");
        fieldPrice.setText("");
        fieldChargingTime.setText("");
        fieldMileage.setText("");
        fieldRange.setText("");
        fieldSellElectricID.setText("");
        fieldSellPrice.setText("");
    }

    // Main method  
    public static void main (String[] args){
        new TransportGUI();
    }
}




