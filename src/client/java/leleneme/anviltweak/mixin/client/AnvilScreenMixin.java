package leleneme.anviltweak.mixin.client;

import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

// This Mixin removes the 'Too expensive' message from the Anvil HUD
@Mixin(AnvilScreen.class)
public class AnvilScreenMixin {
    @ModifyConstant(method = "drawForeground", constant = @Constant(intValue = 40, ordinal = 0))
    private int modifyIntConstant(int input) {
        return Integer.MAX_VALUE;
    }
}