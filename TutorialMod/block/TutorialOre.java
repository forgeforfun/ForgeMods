package ForgeMods.TutorialMod.block;

import ForgeMods.TutorialMod.TutorialMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Elizabeth on 1/5/15.
 */
public class TutorialOre extends BlockStone {


    public TutorialOre()
    {
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3F);
        this.setResistance(2F);
    }


    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcon = reg.registerIcon(TutorialMod.modid + ":" + "tutore");
    }

    @Override
    protected void dropBlockAsItem(World world, int x, int y, int z, ItemStack stack) {
        ItemStack output = new ItemStack(TutorialMod.tutOre, stack.stackSize);
        super.dropBlockAsItem(world, x, y, z, output);
    }
}
