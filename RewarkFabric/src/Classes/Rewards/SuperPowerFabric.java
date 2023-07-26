package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class SuperPowerFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new SuperPower();
    }
    
}
