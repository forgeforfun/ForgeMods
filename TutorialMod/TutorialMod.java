package ForgeMods.TutorialMod;

import ForgeMods.TutorialMod.block.TutorialOre;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Elizabeth on 1/5/15.
 */
@Mod(modid = TutorialMod.modid, version = TutorialMod.version, name = "Tutorial Mod")
public class TutorialMod {
    public static final String modid = "tutmod";
    public static final String version = "0.1";
    public static Block tutOre;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent e)
    {
        tutOre = new TutorialOre().setBlockName("TutorialOre");
        GameRegistry.registerBlock(tutOre, "TutorialOre");
    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent e)
    {

    }





}
