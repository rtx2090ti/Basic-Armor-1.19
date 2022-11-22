package net.keewee.basicarmor.entity.client.armor;

import net.keewee.basicarmor.BasicArmor;
import net.keewee.basicarmor.item.custom.StoneArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StoneArmorModel extends AnimatedGeoModel<StoneArmorItem> {
    @Override
    public Identifier getModelResource(StoneArmorItem object) {
        return new Identifier(BasicArmor.MOD_ID, "geo/stone_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(StoneArmorItem object) {
        return new Identifier(BasicArmor.MOD_ID, "textures/models/armor/stone_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(StoneArmorItem animatable) {
        return new Identifier(BasicArmor.MOD_ID, "animations/armor_animation.json");
    }
}
