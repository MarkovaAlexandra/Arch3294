/*
 * Фабрика по производству конкретных items(наград)
 */


package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class BedrockFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
       return new Bedrock();
    }
    
}
