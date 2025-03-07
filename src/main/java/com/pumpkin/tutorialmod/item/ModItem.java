package com.pumpkin.tutorialmod.item;

import com.pumpkin.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModItem {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item YAHIRG = registerItem("yahirg", new Item(new FabricItemSettings()));
    public static final Item[] items = {
        RUBY, RAW_RUBY, YAHIRG
    };

    // creative mode tab
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        for (Item item: items){
            entries.add(item);
        }
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info(":O Adding mod items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItem::addItemsToIngredientItemGroup);
    }
}
