package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class BookFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
       return new Book();
    }
    
}
