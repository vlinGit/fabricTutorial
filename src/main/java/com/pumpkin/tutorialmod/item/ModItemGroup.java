package com.pumpkin.tutorialmod.item;

import com.pumpkin.tutorialmod.TutorialMod;
import com.pumpkin.tutorialmod.item.ModItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "gems"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gem"))
                    .icon(() -> new ItemStack(ModItem.RUBY)).entries((displayContext, entries) -> {
                        for (Item item: ModItem.items){
                            entries.add(item);
                        }
                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
