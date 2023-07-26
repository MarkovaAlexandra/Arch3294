import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.BedrockFabric;
import Classes.Rewards.BookFabric;
import Classes.Rewards.ChickenSoupFabric;
import Classes.Rewards.CockFabric;
import Classes.Rewards.CookiesFabric;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.GunFabric;
import Classes.Rewards.RoseFabric;
import Classes.Rewards.SilverFabric;
import Classes.Rewards.SuperPowerFabric;

public class App {
    public static void main(String[] args) throws Exception {
        

        ItemGenerator fab = new GoldFabric();          
        ItemGenerator fab1 = new GemFabric();
        ItemGenerator fab2 = new BedrockFabric();
        ItemGenerator fab3 = new BookFabric();
        ItemGenerator fab4 = new ChickenSoupFabric();
        ItemGenerator fab5 = new CookiesFabric();
        ItemGenerator fab6 = new SilverFabric();
        ItemGenerator fab7 = new SuperPowerFabric();
        ItemGenerator fab8 = new CockFabric();
        ItemGenerator fab9 = new GunFabric();
        ItemGenerator fab10 = new RoseFabric();

        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab);
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);
        fabricList.add(fab7);
        fabricList.add(fab8);
        fabricList.add(fab9);
        fabricList.add(fab10);

        

        for (int i = 0; i < 30; i++)
        {
            int index = Math.abs(rnd.nextInt(0,10));
            fabricList.get(index).openReward();
        }
    }
}
