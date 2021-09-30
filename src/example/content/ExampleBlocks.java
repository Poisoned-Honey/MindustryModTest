package example.content;

import mindustry.ctype.ContentList;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.Turret;

public class ExampleBlocks implements ContentList {
    public static Block turretPoop;

    @Override
    public void load() {
        turretPoop = new Turret("poop-turret"){{
            health = 1000;
            shots = 3;
        }};
    }
}
