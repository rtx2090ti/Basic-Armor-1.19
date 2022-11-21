package net.keewee.basicarmor.entity.client.armor;

import net.keewee.basicarmor.item.custom.WoodenArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WoodenArmorRenderer extends GeoArmorRenderer<WoodenArmorItem> {
    public WoodenArmorRenderer() {
        super(new WoodenArmorModel());

        this.headBone = "helmet";
        this.bodyBone = "chestplate";
        this.rightArmBone = "rightArm";
        this.leftArmBone = "leftArm";
        this.rightLegBone = "rightLeg";
        this.leftLegBone = "leftLeg";
        this.rightBootBone = "rightBoot";
        this.leftBootBone = "leftBoot";

    }
}
