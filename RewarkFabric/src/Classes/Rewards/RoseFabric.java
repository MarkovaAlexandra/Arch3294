package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class RoseFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Rose();
    }
    
}
