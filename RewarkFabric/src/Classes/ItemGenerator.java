
/*
 * Фабрика создает награды (items)
 */

package Classes;

public abstract class ItemGenerator {
    public void openReward(){
        iGameItem gameitem = createItem();
        gameitem.open();
    }
    public abstract iGameItem createItem();

    }

