package burptech.item.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import burptech.BurpTechCore;
import burptech.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.ArrayList;

public class RecipesBurpTech 
{
    /**
     * Adds the crafting recipes to the CraftingManager.
     */
    public void addRecipes()
    {
    	if (BurpTechCore.configuration.recipeRucksack.getBoolean(true))
    	{
    		GameRegistry.addRecipe(new ItemStack(BurpTechCore.configuration.items.rucksack),
    						new Object[] { "#s#", "scs", "#s#", '#', Item.leather, 's', Item.silk, 'c', Block.chest });
    		
    		GameRegistry.addRecipe(new ItemStack(BurpTechCore.configuration.items.rucksack),
					new Object[] { "s#s", "#c#", "s#s", '#', Item.leather, 's', Item.silk, 'c', Block.chest });
    		
    		GameRegistry.addRecipe(new RecipesRucksackDyes());
    	}
    	
    	if (BurpTechCore.configuration.recipeEnderRucksack.getBoolean(true))
    	{
    		GameRegistry.addRecipe(new ItemStack(BurpTechCore.configuration.items.enderRucksack),
    				new Object[] { "#s#", "scs", "#s#", '#', Item.leather, 's', Item.silk, 'c', Block.enderChest });
    		
    		GameRegistry.addRecipe(new ItemStack(BurpTechCore.configuration.items.enderRucksack),
    				new Object[] { "s#s", "#c#", "s#s", '#', Item.leather, 's', Item.silk, 'c', Block.enderChest });
    	}
    	
    	if (BurpTechCore.configuration.recipePortableWorkbench.getBoolean(true))
    	{
    		GameRegistry.addShapelessRecipe(new ItemStack(BurpTechCore.configuration.items.portableWorkbench),
    				new Object[] { Block.workbench, Item.silk });
    	}
    	
    	if (BurpTechCore.configuration.recipeCookedEgg.getBoolean(true))
    	{
    		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(BurpTechCore.configuration.items.cookedEgg), 0.35F); // xp matches standard food cooking xp
    	}

        if (BurpTechCore.configuration.recipeCobbleGenerator.getBoolean(true))
        {
            GameRegistry.addRecipe(new ItemStack(BurpTechCore.configuration.blocks.blockCobbleGenerator),
                    new Object[] {"CCC", "CHC", "CPC", 'C', Block.cobblestone, 'H', Block.hopperBlock, 'P', Block.pistonBase});
        }
    }
}
