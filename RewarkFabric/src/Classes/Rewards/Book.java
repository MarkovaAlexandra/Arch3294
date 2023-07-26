package Classes.Rewards;

import Classes.iGameItem;

public class Book implements iGameItem{

    @Override
    public void open() {
       System.out.println("Интересная книжка!");
    }
    
}
