package com.thegreasycarrot.firstmod.item;

import com.thegreasycarrot.firstmod.FirstMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FirstMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab FIRST_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        FIRST_TAB = event.registerCreativeModeTab(new ResourceLocation(FirstMod.MODID, "first_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BIG_STICK.get()))
                        .title(Component.translatable("creativemodetab.first_tab")));

    }


}
