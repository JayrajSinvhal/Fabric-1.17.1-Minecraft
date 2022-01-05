package net.jayrajcodes.mcmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jayrajcodes.mcmod.McMod;
import net.jayrajcodes.mcmod.item.custom.DowsingRodItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));

    public static final Item PEPPER = registerItem("pepper",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(9).saturationModifier(9.2f).snack().build())
                    .group(ItemGroup.FOOD)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.RUBY).maxDamage(400)));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(McMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod items for " + McMod.MOD_ID);
    }

}
