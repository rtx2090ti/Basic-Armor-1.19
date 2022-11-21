package net.keewee.basicarmor;

import net.fabricmc.api.ClientModInitializer;
import net.keewee.basicarmor.entity.client.armor.WoodenArmorRenderer;
import net.keewee.basicarmor.item.ModItems;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BasicArmorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        GeoArmorRenderer.registerArmorRenderer(new WoodenArmorRenderer(), ModItems.WOODEN_BOOTS, ModItems.WOODEN_BREASTPLATE, ModItems.WOODEN_HELMET, ModItems.WOODEN_LEGGINGS);

    }
}
