package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class GunFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gun();
    }
    
}
