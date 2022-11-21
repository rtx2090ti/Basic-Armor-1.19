package net.keewee.basicarmor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.keewee.basicarmor.BasicArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WOODEN_HELMET = registerItem("wooden_helmet", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item WOODEN_BREASTPLATE = registerItem("wooden_breastplate", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.CHEST,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item WOODEN_LEGGINGS = registerItem("wooden_leggings", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.LEGS,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item WOODEN_BOOTS = registerItem("wooden_boots", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.FEET,
            new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item STONE_HELMET = registerItem("stone_helmet", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item STONE_BREASTPLATE = registerItem("stone_breastplate", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.CHEST,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item STONE_LEGGINGS = registerItem("stone_leggings", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.LEGS,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item STONE_BOOTS = registerItem("stone_boots", new ArmorItem(ModArmorMaterials.WOOD, EquipmentSlot.FEET,
            new FabricItemSettings().group(ItemGroup.COMBAT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BasicArmor.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BasicArmor.LOGGER.debug("Registering " + BasicArmor.MOD_ID + " items...");
    }
}
