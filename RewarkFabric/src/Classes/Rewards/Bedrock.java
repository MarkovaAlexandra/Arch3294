/*
 * создаем класс определенной награды (от общего item), переопределяем метод открыть (просто sout)
 */

package Classes.Rewards;

import Classes.iGameItem;

public class Bedrock implements iGameItem {

    @Override
    public void open() {
        System.out.println("Bedrock");
    }
    
}
