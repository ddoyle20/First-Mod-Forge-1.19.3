package com.thegreasycarrot.firstmod.item;

import com.thegreasycarrot.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    public static final RegistryObject<Item> BIG_STICK = ITEMS.register("big_stick", () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> KALIXIUM_INGOT = ITEMS.register("kalixium_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KALIXIUM_SWORD = ITEMS.register("kalixium_sword", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_KALIXIUM_ORE = ITEMS.register("raw_kalixium_ore", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
