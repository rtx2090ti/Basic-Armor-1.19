package net.keewee.basicarmor.entity.client.armor;

import net.keewee.basicarmor.item.custom.StoneArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class StoneArmorRenderer extends GeoArmorRenderer<StoneArmorItem> {
    public StoneArmorRenderer() {
        super(new StoneArmorModel());

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
