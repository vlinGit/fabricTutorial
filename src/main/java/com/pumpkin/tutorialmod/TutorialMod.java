package com.pumpkin.tutorialmod;

import com.pumpkin.tutorialmod.block.ModBlock;
import com.pumpkin.tutorialmod.item.ModItem;
import com.pumpkin.tutorialmod.item.ModItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID); // Literally just think of this as sout

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItemGroup.registerItemGroups();
		ModItem.registerModItems();
		ModBlock.registerModBlock();
	}
}