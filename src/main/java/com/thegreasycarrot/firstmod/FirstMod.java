package com.thegreasycarrot.firstmod;

import com.mojang.logging.LogUtils;
import com.thegreasycarrot.firstmod.block.ModBlocks;
import com.thegreasycarrot.firstmod.item.ModCreativeModeTabs;
import com.thegreasycarrot.firstmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FirstMod.MODID)
public class FirstMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "firstmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public FirstMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register((modEventBus));
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        // Checks if the current creative tab is the combat tab
        if(event.getTab() == ModCreativeModeTabs.FIRST_TAB) {
            // Adds the big stick to the creative menu
            event.accept(ModItems.BIG_STICK);
            event.accept(ModBlocks.BIG_STICK_BLOCK);
            event.accept(ModBlocks.BIG_STICK_ORE);
            event.accept(ModBlocks.KALIXIUM_BLOCK);
            event.accept(ModItems.KALIXIUM_INGOT);
            event.accept(ModItems.KALIXIUM_SWORD);
            event.accept(ModItems.RAW_KALIXIUM_ORE);
            event.accept(ModBlocks.KALIXIUM_BLOCK_RAW);
            event.accept(ModBlocks.KALIXIUM_ORE);
            event.accept(ModBlocks.DEEPSLATE_KALIXIUM_ORE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
