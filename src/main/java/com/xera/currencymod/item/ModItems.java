package com.xera.currencymod.item;

import com.xera.currencymod.CurrencyMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new Item.Settings()));
    public static final Item SILVER_COIN = registerItem("silver_coin", new Item(new Item.Settings()));
    public static final Item BRONZE_COIN = registerItem("bronze_coin", new Item(new Item.Settings()));
    public static final Item FIGHTERS_COIN = registerItem("fighters_coin", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CurrencyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CurrencyMod.LOGGER.info("Registering Mod Items for " + CurrencyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GOLD_COIN);
            fabricItemGroupEntries.add(SILVER_COIN);
            fabricItemGroupEntries.add(BRONZE_COIN);
            fabricItemGroupEntries.add(FIGHTERS_COIN);
        });
    }
}
