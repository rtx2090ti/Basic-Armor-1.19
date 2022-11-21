package net.keewee.basicarmor.entity.client.armor;

import net.keewee.basicarmor.BasicArmor;
import net.keewee.basicarmor.item.custom.WoodenArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WoodenArmorModel extends AnimatedGeoModel<WoodenArmorItem> {
    @Override
    public Identifier getModelResource(WoodenArmorItem object) {
        return new Identifier(BasicArmor.MOD_ID, "geo/wood_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(WoodenArmorItem object) {
        return new Identifier(BasicArmor.MOD_ID, "textures/models/armor/wood_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(WoodenArmorItem animatable) {
        return new Identifier(BasicArmor.MOD_ID, "animations/armor_animation.json");
    }
}
