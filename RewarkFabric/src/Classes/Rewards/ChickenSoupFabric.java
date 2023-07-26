package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ChickenSoupFabric  extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Chickensoup();
    }
    
}
