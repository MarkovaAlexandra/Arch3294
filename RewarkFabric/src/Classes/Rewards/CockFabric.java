package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class CockFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Coke();
    }
    
}
