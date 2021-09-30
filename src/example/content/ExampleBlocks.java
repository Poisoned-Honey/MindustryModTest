package example.content;

import mindustry.content.Bullets;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.Turret;

public class ExampleBlocks implements ContentList {
    public static Block turretPoop;

    @Override
    public void load() {
        turretPoop = new ItemTurret("poopturret"){{
            requirements(Category.turret, with(Items.copper, 900, Items.graphite, 300, Items.surgeAlloy, 250, Items.plastanium, 175, Items.thorium, 250));
            ammo(
                    Items.graphite, Bullets.standardDenseBig,
                    Items.pyratite, Bullets.standardIncendiaryBig,
                    Items.thorium, Bullets.standardThoriumBig
            );
            reloadTime = 7f;
            range = 260f;
            inaccuracy = 3f;
            recoilAmount = 3f;
            spread = 8f;
            shootShake = 2f;
            shots = 2;
            size = 4;
            shootCone = 24f;
            shootSound = Sounds.shootBig;

            health = 160 * size * size;

            limitRange();
        }};
    }
}
