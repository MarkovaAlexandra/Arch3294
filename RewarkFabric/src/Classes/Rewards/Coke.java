package Classes.Rewards;

import Classes.iGameItem;

public class Coke implements iGameItem {

    @Override
    public void open() {
       System.out.println("Coca-Cola!");
    }
    
}
