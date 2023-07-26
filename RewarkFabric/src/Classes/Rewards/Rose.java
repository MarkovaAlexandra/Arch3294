package Classes.Rewards;

import Classes.iGameItem;

public class Rose implements iGameItem{

    @Override
    public void open() {
        System.out.println("Миллион алых роз!");
    }
    
}
