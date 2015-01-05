package ForgeMods.TutorialMod;

import ForgeMods.TutorialMod.block.TutorialOre;
import ForgeMods.TutorialMod.worldgenerators.TutorialGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
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
    private TutorialGenerator generator = new TutorialGenerator();

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent e)
    {
        //Declare stuff
        tutOre = new TutorialOre().setBlockName("TutorialOre");


        //Register Stuff
        GameRegistry.registerBlock(tutOre, "TutorialOre");

        GameRegistry.registerWorldGenerator(generator, 1);
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
