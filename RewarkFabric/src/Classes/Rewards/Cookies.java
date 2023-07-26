package Classes.Rewards;

import Classes.iGameItem;

public class Cookies implements iGameItem{

    @Override
    public void open() {
        System.out.println("Печеньки!");
    }
    
}
