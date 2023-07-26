package Classes.Rewards;

import Classes.iGameItem;

public class Gun implements iGameItem{

    @Override
    public void open() {
        System.out.println("Оружие!");
    }
    
}
