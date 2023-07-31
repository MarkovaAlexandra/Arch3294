package Classes;

import java.awt.Color;

public class Pickup extends Car implements iRefueling {

    private int loadcapacity;

    public Pickup(String make, 
                String model, 
                Color color, 
                TypeCar bodeType, 
                int numberWheels, 
                TypeFuel fuel,
                TypeGearBox gearbox, 
                float engineCap,
                int loadcapacity) {
        super(make, model, color, bodeType, numberWheels, fuel, gearbox, engineCap);
      
    }

    @Override
    public int gearShift(int gear) {

        return 0;
    }

    public int getLoadcapacity() {
        return loadcapacity;
    }

    public void setLoadcapacity(int loadcapacity) {
        this.loadcapacity = loadcapacity;
    }

    @Override
    public void fuel() {
        
    }
    
}
