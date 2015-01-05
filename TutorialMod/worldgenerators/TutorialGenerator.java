package ForgeMods.TutorialMod.worldgenerators;

import ForgeMods.TutorialMod.TutorialMod;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by Elizabeth on 1/5/15.
 */
public class TutorialGenerator implements IWorldGenerator{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX, chunkZ);
                break;
            case 0:
                generateSurface(world, random, chunkX, chunkZ);
                break;
            case 1:
                generateEnd(world, random, chunkX, chunkZ);

        }
    }


    public void generateNether (World world, Random random, int chunkX, int chunkZ)
    {

    }
    public void generateSurface (World world, Random random, int chunkX, int chunkZ)
    {
        this.addOreSpawn(TutorialMod.tutOre, world, random, chunkX, chunkZ, 16, 16, 2+random.nextInt(3), 20, 0, 25);
    }
    public void generateEnd (World world, Random random, int chunkX, int chunkZ)
    {

    }

    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int diffBtwnY = maxY - minY;

        for(int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
