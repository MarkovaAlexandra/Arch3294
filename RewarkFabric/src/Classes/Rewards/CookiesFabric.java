package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class CookiesFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Cookies();
    }
    
}
