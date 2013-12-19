package tbd.merge;

/*
 * uses MC forge 1.2.2, Modloader 1.0.0, Audiomod 
 */

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import net.minecraft.src.forge.*;
import java.util.Map;
import java.util.Random;
import java.io.IOException;
import java.io.File;

import org.lwjgl.input.Keyboard;

public class mod_CC extends BaseMod {
public static Random r = new Random();
public Minecraft minecraft = ModLoader.getMinecraftInstance();
//key bindings
private KeyBinding key1 = new KeyBinding("Cheat", Keyboard.KEY_C);
private KeyBinding key2 = new KeyBinding("Clear Inventory", Keyboard.KEY_P);
//blocks
public static final Block quarts = new BlockQuarts(125, Material.rock).setHardness(1.25F).setResistance(0.7F).setBlockName("quarts");
public static final Block emerald = new BlockCrystal(126, Material.iron).setHardness(2F).setResistance(0.8F).setBlockName("emerald");
public static final Block malchite = new BlockCrystal(127, Material.iron).setHardness(1.5F).setResistance(0.67F).setBlockName("malchite");
public static final Block aquamarine = new BlockCrystal(128, Material.rock).setHardness(1F).setResistance(0.3F).setBlockName("aquamarine");
public static final Block salt = new BlockSalt(129).setHardness(0.6F).setResistance(0.2F).setBlockName("salt");
public static final Block tiger = new BlockCrystal(130, Material.iron).setHardness(1.4F).setResistance(5.0F).setBlockName("tiger");
public static final Block ruby = new BlockCrystal(131, Material.iron).setHardness(2.5F).setResistance(2.5F).setBlockName("ruby");
public static final Block saphire = new BlockCrystal(132, Material.iron).setHardness(2F).setResistance(2F).setBlockName("saphire");
public static final Block amethyst = new BlockCrystal(133, Material.iron).setHardness(1.5F).setResistance(2.25F).setBlockName("amethyst");
public static final Block bloodStone = new BlockCrystal(134, Material.iron).setHardness(1F).setResistance(2F).setBlockName("bloodStone");
public static final Block boulder = new BlockCrystal(135, Material.rock).setHardness(1.1F).setResistance(1.7F).setBlockName("boulder");
public static final Block copper = new BlockCrystal(136, Material.iron).setHardness(1.6F).setResistance(2F).setBlockName("copper");
public static final Block dioptase = new BlockCrystal(137, Material.iron).setHardness(0.7F).setResistance(2F).setBlockName("diptaze");
public static final Block jet = new BlockCrystal(138, Material.iron).setHardness(2F).setResistance(2F).setBlockName("jet");
public static final Block petriWood = new BlockCrystal(139, Material.wood).setHardness(1F).setResistance(1F).setBlockName("petriwood");
public static final Block sulpher = new BlockCrystal(140, Material.sand).setHardness(0.5F).setResistance(1F).setBlockName("sulpher");
public static final Block thulite = new BlockCrystal(141, Material.iron).setHardness(1.2F).setResistance(2F).setBlockName("thulite");
public static final Block topas = new BlockCrystal(142, Material.rock).setHardness(0.8F).setResistance(2F).setBlockName("topaz");
public static final Block zincite = new BlockCrystal(143, Material.iron).setHardness(1.75F).setResistance(2F).setBlockName("zincite");
public static final Block sPeater = new BlockCrystal(144, Material.rock).setHardness(3F).setResistance(5F).setBlockName("speater");
public static final Block sbQuarts = new BlockCrystal(145, Material.iron).setHardness(4F).setResistance(5F).setBlockName("sbQuarts");
public static final Block tourmaline = new BlockCrystal(146, Material.iron).setHardness(3F).setResistance(5F).setBlockName("tourmaline");
public static final Block fossil = new BlockFossil(147, Material.rock).setHardness(3.5F).setResistance(5F).setBlockName("fosil");
public static final Block eQuarts = new BlockCrystal(148, Material.iron).setHardness(2.9F).setResistance(5F).setBlockName("eQuarts");
public static final Block talc = new BlockCrystal(149, Material.rock).setHardness(1).setResistance(1).setBlockName("talc");
public static final Block sypsum = new BlockCrystal(150, Material.rock).setHardness(3).setResistance(5).setBlockName("sypsum");
public static final Block calcite = new BlockCrystal(151, Material.rock).setHardness(4).setResistance(5).setBlockName("calcite");
public static final Block flourite = new BlockCrystal(152, Material.iron).setHardness(4).setResistance(5).setBlockName("flourite");
public static final Block apatite = new BlockCrystal(153, Material.iron).setHardness(3).setResistance(5).setBlockName("apatite");
public static final Block orthoclase = new BlockCrystal(154, Material.rock).setHardness(5).setResistance(5).setBlockName("orthoclase");
public static final Block corundum = new BlockCrystal(155, Material.iron).setHardness(3).setResistance(5).setBlockName("corundum");
public static final Block hematite = new BlockCrystal(156, Material.iron).setHardness(4).setResistance(5).setBlockName("hematite");
public static final Block silicon = new BlockCrystal(157, Material.circuits).setHardness(3).setResistance(5).setBlockName("silicon");
public static final Block silver = new BlockCrystal(158, Material.iron).setHardness(3).setResistance(5).setBlockName("silver");
public static final Block petriBud = new BlockCrystal(159, Material.plants).setHardness(3).setResistance(5).setBlockName("petriBud");
public static final Block tektite = new BlockCrystal(160, Material.iron).setHardness(3).setResistance(5).setBlockName("tektite");
public static final Block sunstone = new BlockCrystal(161, Material.rock).setHardness(3).setResistance(5).setBlockName("sunstone");
public static final Block garnet = new BlockCrystal(162, Material.rock).setHardness(3).setResistance(5).setBlockName("garnet");
public static final Block amber = new BlockCrystal(163, Material.rock).setHardness(3).setResistance(5).setBlockName("amber");
public static final Block mAgate = new BlockCrystal(164, Material.iron).setHardness(3).setResistance(5).setBlockName("mAgate");
public static final Block kyanite = new BlockCrystal(165, Material.rock).setHardness(3).setResistance(5).setBlockName("kyanite");
public static final Block jade = new BlockCrystal(166, Material.iron).setHardness(3).setResistance(5).setBlockName("jade");
public static final Block adventurene = new BlockCrystal(167, Material.iron).setHardness(3).setResistance(5).setBlockName("adventurene");
public static final Block geode = new BlockGeode(168, Material.iron).setHardness(3).setResistance(5).setBlockName("geode");

//Chests and such
public static final Block tumbler = new BlockTumbler(200, false).setBlockName("tumbler").setHardness(1F);
public static final Block tumblerActive = new BlockTumbler(201, true).setLightValue(0.875F).setBlockName("tumblera").setHardness(1F);

//items
public static final Item siliconP = new CCItems(4000).setItemName("siliconP");
public static final Item treacle = new CCItems(4001).setItemName("Treacle");
public static final Item sbquartsG= new CCItems(5015).setItemName("sbquartsG");
public static final Item enquartzG = new CCItems(5017).setItemName("equartsG");
//crops

//Materials
public static final Material HolyWater = new Material(MapColor.waterColor).setNoPushMobility();
public static final Material DarkWater = new Material(MapColor.waterColor).setNoPushMobility();

//Enchantment's
public static Enchantment flameTouch = new CCEnchFireTouch(60, 1);

//Tumbled Gems
	//<-- Tier 0 -->
public static final Item quartsG = new CCItems(5000).setItemName("quartsG");
public static final Item emeraldG = new CCItems(5001).setItemName("emeraldG");
public static final Item malG = new CCItems(5002).setItemName("malG");
public static final Item aquaG = new CCItems(5003).setItemName("aquaG");
public static final Item saltG = new CCItems(5004).setItemName("saltG");
public static final Item tigerG = new CCItems(5005).setItemName("tigerG");
public static final Item rubyG = new CCItems(5006).setItemName("rubyG");
public static final Item saphireG = new CCItems(5007).setItemName("saphireG");
public static final Item amethystG = new CCItems(5008).setItemName("amethystG");
public static final Item bloodstoneG = new CCItems(5009).setItemName("bloodstoneG");
public static final Item dioptaseG = new CCItems(5010).setItemName("dioptaseG");
public static final Item jetG = new CCItems(5011).setItemName("jetG");
public static final Item thuliteG = new CCItems(5012).setItemName("thuliteG");
public static final Item topasG = new CCItems(5013).setItemName("topasG");
public static final Item zinciteG = new CCItems(5014).setItemName("zinciteG");
public static final Item tourmalineG = new CCItems(5016).setItemName("tourmalineG");
public static final Item sypsumG = new CCItems(5018).setItemName("sypsumG");
public static final Item calciteG = new CCItems(5019).setItemName("calciteG");
public static final Item flouriteG = new CCItems(5020).setItemName("flouriteG");
public static final Item apatiteG = new CCItems(5021).setItemName("apatiteG");
public static final Item orthoclaseG = new CCItems(5022).setItemName("orthoclaseG");
public static final Item hematiteG = new CCItems(5023).setItemName("hematiteG");
public static final Item siliconG = new CCItems(5024).setItemName("siliconG");
public static final Item tektiteG = new CCItems(5025).setItemName("tektiteG");
public static final Item sunstoneG = new CCItems(5026).setItemName("sunstoneG");
public static final Item garnetG = new CCItems(5027).setItemName("garnetG");
public static final Item amberG = new CCItems(5028).setItemName("amberG");
public static final Item mossyagateG = new CCItems(5029).setItemName("mossagateG");
public static final Item kyaniteG = new CCItems(5030).setItemName("kyaniteG");
public static final Item jadeG = new CCItems(5031).setItemName("jadeG");
public static final Item adventG = new CCItems(5032).setItemName("adventureneG");

	//<-- Tier 1 --> public static final Item T1 = new CCItems(6000).setItemName("");
public static final Item quartsT1 = new CCItems(6000).setItemName("quartsT1");
public static final Item emeraldT1 = new CCItems(6001).setItemName("emeraldT1");
public static final Item malT1 = new CCItems(6002).setItemName("malT1");
public static final Item aquaT1 = new CCItems(6003).setItemName("aquaT1");
public static final Item tigreT1 = new CCItems(6004).setItemName("tigreT1");
public static final Item rubyT1 = new CCItems(6005).setItemName("rubyT1");
public static final Item saphireT1 = new CCItems(6006).setItemName("saphireT1");
public static final Item amethystT1 = new CCItems(6007).setItemName("amethystT1");
public static final Item bloodstoneT1 = new CCItems(6008).setItemName("bloodStoneT1");
public static final Item dioptaseT1 = new CCItems(6009).setItemName("dioptaseT1");
	//<-- tier 2 --> public static final Item T2 = new CCItems(7000).setItemName("");
public static final Item quartsT2 = new CCItems(7000).setItemName("quartsT2");
public static final Item emeraldT2 = new CCItems(7001).setItemName("emeraldG");
public static final Item malT2 = new CCItems(7002).setItemName("malT2");
public static final Item aquaT2 = new CCItems(7003).setItemName("aquaT2");
public static final Item tigreT2 = new CCItems(7004).setItemName("tigreT2");
public static final Item rubyT2 = new CCItems(7005).setItemName("rubyT2");
public static final Item saphireT2 = new CCItems(7006).setItemName("saphireT2");
public static final Item amethystT2 = new CCItems(7007).setItemName("amethystT2");
public static final Item bloodstoneT2 = new CCItems(7008).setItemName("bloodstoneT2");
public static final Item dioptaseT2 = new CCItems(7009).setItemName("dioptaseT2");
	//<-- tier 3 --> public static final Item T3 = new CCItems(8000).setItemName("");
public static final Item quartsT3 = new CCItems(8000).setItemName("quartsT3");
public static final Item emeraldT3 = new CCItems(8001).setItemName("emeraldG");
public static final Item malT3 = new CCItems(8002).setItemName("malT3");
public static final Item aquaT3 = new CCItems(8003).setItemName("aquaT3");
public static final Item tigreT3 = new CCItems(8004).setItemName("tigreT3");
public static final Item rubyT3 = new CCItems(8005).setItemName("rubyT3");
public static final Item saphireT3 = new CCItems(8006).setItemName("saphireT3");
public static final Item amethystT3 = new CCItems(8007).setItemName("amethystT2");
public static final Item bloodstoneT3 = new CCItems(8008).setItemName("bloodstoneT3");
public static final Item dioptaseT3 = new CCItems(8009).setItemName("dioptaseT3");

//liquids
public static final Block HolyLiquidMoving = new BlockModFlowing(210, HolyWater).setHardness(100F).setLightOpacity(3).setBlockName("HFlowing").disableStats().setRequiresSelfNotify();
public static final Block HolyLiquidStill = new BlockModStill(211, HolyWater).setHardness(100F).setLightOpacity(3).setBlockName("HStill").disableStats().setRequiresSelfNotify();
public static final Block DarkLiquidStill = new BlockModStill(212, DarkWater).setHardness(100F).setLightOpacity(3).setLightValue(1.0F).setBlockName("DStill").disableStats().setRequiresSelfNotify();
public static final Block DarkLiquidMoving = new BlockModFlowing(213, DarkWater).setHardness(100F).setLightOpacity(3).setLightValue(1.0F).setBlockName("DFlowing").disableStats().setRequiresSelfNotify();

//herobrine blocks
public static final Block dark = new BlockDark(202, -123123, Material.air, false).setBlockName("dark");
public static final Block phase = new BlockDark(203, 8, Material.air, true).setHardness(1F).setResistance(5F).setBlockName("phase");

//fossils
public static final Item F1 = new CCItems(5100).setItemName("CrackedBone");
public static final Item F2 = new CCItems(5101).setItemName("LegBone");
public static final Item F3 = new CCItems(5102).setItemName("ArmBone");
public static final Item F4 = new CCItems(5103).setItemName("Skull");
public static final Item F5 = new CCItems(5104).setItemName("PetrifiedBud");
public static final Item F6 = new CCItems(5105).setItemName("Trilabite");
public static final Item F7 = new CCItems(5106).setItemName("Amonite");
public static final Item F8 = new CCItems(5107).setItemName("geode");
public static final Item F9 = new CCItems(5108).setItemName("stone");
public static final Item F10 = new CCItems(5109).setItemName("AncientPick");
public static final Item F11 = new CCItems(5110).setItemName("F6");
public static final Item F12 = new CCItems(5111).setItemName("F6");
public static final Item F13 = new CCItems(5112).setItemName("F6");
public static final Item F14 = new CCItems(5113).setItemName("F6");


//Geodes
public static final Item G1 = new CCItems(5201).setItemName("");
//Config

//Achieves
public static final Achievement thingy= new Achievement(3450, "Whats this do?", 10, 2, tumbler, null).registerAchievement();
public static final Achievement tumbled = new Achievement(3451, "Tumbled!", 10, 4, quartsT1, thingy).registerAchievement();



public mod_CC() {
	Register();
	Name();
	Texture();
	Recipes();
	Smelting();
	AddMobs();
	Achieves();
	TestingRecipes();
}

public void Register() {
	ModLoader.registerBlock(quarts);
	ModLoader.registerBlock(emerald);
	ModLoader.registerBlock(malchite);
	ModLoader.registerBlock(aquamarine);
	ModLoader.registerBlock(salt);
	ModLoader.registerBlock(tiger);
	ModLoader.registerBlock(ruby);
	ModLoader.registerBlock(emerald);
	ModLoader.registerBlock(tumbler);
	ModLoader.registerBlock(tumblerActive);
	ModLoader.registerBlock(saphire);
	ModLoader.registerBlock(amethyst);
	ModLoader.registerBlock(bloodStone);
	ModLoader.registerBlock(boulder);
	ModLoader.registerBlock(copper);
	ModLoader.registerBlock(dioptase);
	ModLoader.registerBlock(jet);
	ModLoader.registerBlock(petriWood);
	ModLoader.registerBlock(sulpher);
	ModLoader.registerBlock(thulite);
	ModLoader.registerBlock(topas);
	ModLoader.registerBlock(zincite);
	ModLoader.registerBlock(sPeater);
	ModLoader.registerBlock(sbQuarts);
	ModLoader.registerBlock(tourmaline);
	ModLoader.registerBlock(fossil);
	ModLoader.registerBlock(eQuarts);
	ModLoader.registerBlock(talc);
	ModLoader.registerBlock(sypsum);
	ModLoader.registerBlock(calcite);
	ModLoader.registerBlock(flourite);
	ModLoader.registerBlock(apatite);
	ModLoader.registerBlock(orthoclase);
	ModLoader.registerBlock(corundum);
	ModLoader.registerBlock(hematite);
	ModLoader.registerBlock(silicon);
	ModLoader.registerBlock(silver);
	ModLoader.registerBlock(petriBud);
	ModLoader.registerBlock(tektite);
	ModLoader.registerBlock(sunstone);
	ModLoader.registerBlock(garnet);
	ModLoader.registerBlock(amber);
	ModLoader.registerBlock(mAgate);
	ModLoader.registerBlock(kyanite);
	ModLoader.registerBlock(jade);
	ModLoader.registerBlock(adventurene);
	//
	ModLoader.registerBlock(geode);
	//entitys
	ModLoader.registerTileEntity(net.minecraft.src.TileEntityTumbler.class, "tumbler");
	//liquids
	ModLoader.registerBlock(HolyLiquidMoving);
	ModLoader.registerBlock(HolyLiquidStill);
	ModLoader.registerBlock(DarkLiquidMoving);
	ModLoader.registerBlock(DarkLiquidStill);
	//herobrine
	ModLoader.registerBlock(dark);
	ModLoader.registerBlock(phase);
}

public void Name() {
	//Blocks
	ModLoader.addName(quarts, "Quarts clump");
	ModLoader.addName(emerald, "Emerald cluster");
	ModLoader.addName(malchite, "A lump of Malchite");
	ModLoader.addName(aquamarine, "A vein of Aquamarine");
	ModLoader.addName(salt, "Rock Salt");
	ModLoader.addName(tiger, "Tiger's eye");
	ModLoader.addName(ruby, "Ruby");
	ModLoader.addName(saphire, "Saphire");
	ModLoader.addName(tumbler, "Gem Tumbler");
	ModLoader.addName(tumblerActive, "Gem Tumbler Active");
	ModLoader.addName(amethyst, "amethyst");
	ModLoader.addName(bloodStone, "Blood Stone");
	ModLoader.addName(boulder, "Boulder");
	ModLoader.addName(copper, "Copper");
	ModLoader.addName(dioptase, "Dioptase");
	ModLoader.addName(jet, "Jet");
	ModLoader.addName(petriWood, "Petrified wood");
	ModLoader.addName(sulpher, "Sulpher");
	ModLoader.addName(thulite, "Thulite");
	ModLoader.addName(topas, "Topas");
	ModLoader.addName(zincite, "Zincite");
	ModLoader.addName(sPeater,"Salt Peter");
	ModLoader.addName(sbQuarts,"Star-Burst Quarts");
	ModLoader.addName(tourmaline,"Tourmaline");
	ModLoader.addName(fossil,"Fossil");
	ModLoader.addName(eQuarts,"Enhanced Quarts");
	ModLoader.addName(talc,"Talc");
	ModLoader.addName(sypsum,"Sypsum");
	ModLoader.addName(calcite,"Calcite");
	ModLoader.addName(flourite,"Flourite");
	ModLoader.addName(apatite,"Apatite");
	ModLoader.addName(orthoclase,"Orthoclase");
	ModLoader.addName(corundum,"Corundum");
	ModLoader.addName(hematite,"Hematite");
	ModLoader.addName(silicon,"Silicon");
	ModLoader.addName(silver,"Silver");
	ModLoader.addName(petriBud,"Petrified Bud");
	ModLoader.addName(tektite,"Tektite");
	ModLoader.addName(sunstone,"Sunstone");
	ModLoader.addName(garnet,"Garnet");
	ModLoader.addName(amber,"Amber");
	ModLoader.addName(mAgate,"Mossy Agate");
	ModLoader.addName(kyanite,"Kyanite");
	ModLoader.addName(jade,"Jade");
	ModLoader.addName(adventurene,"Adventurene");
	ModLoader.addName(geode,"Geode");
	//Items
	//gems
	ModLoader.addName(quartsG, "A Quarts Crystal");
	ModLoader.addName(emeraldG, "Emerald");
	ModLoader.addName(malG, "Malchite");
	ModLoader.addName(aquaG, "Aquamarine");
	ModLoader.addName(saltG, "Salt");
	ModLoader.addName(tigerG, "tigers eye");
	ModLoader.addName(rubyG, "Ruby");
	ModLoader.addName(saphireG, "Saphire");
	ModLoader.addName(amethystG, "Amethyst Gem");
	ModLoader.addName(bloodstoneG, "Blood Stone");
	ModLoader.addName(dioptaseG, "Dioptase");
	ModLoader.addName(jetG, "Jet");
	ModLoader.addName(thuliteG, "Thulite");
	ModLoader.addName(topasG, "Topas");
	ModLoader.addName(zinciteG, "Zincite");
	ModLoader.addName(tourmalineG, "Tourmaline");
	ModLoader.addName(sypsumG, "Sypsum");
	ModLoader.addName(calciteG, "Calcite");
	ModLoader.addName(flouriteG, "Flourite");
	ModLoader.addName(apatiteG, "Apatite");
	ModLoader.addName(orthoclaseG, "Orthoclase");
	ModLoader.addName(hematiteG, "Hematite");
	ModLoader.addName(siliconG, "Natural Silicon");
	ModLoader.addName(tektiteG, "Tektite");
	ModLoader.addName(sunstoneG, "Sunstone");
	ModLoader.addName(garnetG, "Garnet");
	ModLoader.addName(amberG, "Amber");
	ModLoader.addName(mossyagateG, "Mossy-Agate");
	ModLoader.addName(kyaniteG, "Kyanite");
	ModLoader.addName(jadeG, "Jade");
	ModLoader.addName(adventG, "Adventurene");
	//Enchantment's
	ModLoader.setInGameHook(this, true, false);
	ModLoader.setInGUIHook(this, true, false);
	ModLoader.registerKey(this, this.key1, true);
	ModLoader.registerKey(this, this.key2, true);
	ModLoader.addLocalization("enchantment.flameTouch", "Flame Touch");
	ModLoader.addLocalization("Cheat", "Cheat");
	//tumbled gems tier 1
	ModLoader.addName(quartsT1, "Tumbled Quarts T1");
	ModLoader.addName(emeraldT1, "Tumbled Emerald T1");
	ModLoader.addName(malT1, "Tumbled Malachite T1");
	ModLoader.addName(aquaT1, "Tumbled Aquamarine T1");
	ModLoader.addName(tigreT1, "Tumbled Tigres-Eye T1");
	ModLoader.addName(rubyT1, "Tumbled Ruby T1");
	ModLoader.addName(saphireT1, "Tumbled Saphire T1");
	ModLoader.addName(amethystT1, "Tumbled Amethyst T1");
	ModLoader.addName(bloodstoneT1, "Tumbled BloodStone T1");
	ModLoader.addName(dioptaseT1, "Tumbled Dioptase T1");
	//tumbled gems tier 2
	ModLoader.addName(quartsT2, "Tumbled Quarts T2");
	ModLoader.addName(emeraldT2, "Tumbled Emerald T2");
	ModLoader.addName(malT2, "Tumbled Malachite T2");
	ModLoader.addName(aquaT2, "Tumbled Aquamarine T2");
	ModLoader.addName(tigreT2, "Tumbled Tigres-Eye T2");
	ModLoader.addName(rubyT2, "Tumbled Ruby T2");
	ModLoader.addName(saphireT2, "Tumbled Saphire T2");
	ModLoader.addName(amethystT2, "Tumbled Amethyst T2");
	ModLoader.addName(bloodstoneT2, "Tumbled BloodStone T2");
	ModLoader.addName(dioptaseT2, "Tumbled Dioptase T2");
	
	//tumbled gems tier 3
	ModLoader.addName(quartsT3, "Tumbled Quarts T3");
	ModLoader.addName(emeraldT3, "Tumbled Emerald T3");
	ModLoader.addName(malT3, "Tumbled Malchite T3");
	ModLoader.addName(aquaT3, "Tumbled Aquamarine T3");
	ModLoader.addName(tigreT3, "Tumbled Tigres-Eye T3");
	ModLoader.addName(rubyT3, "Tumbled Ruby T3");
	ModLoader.addName(saphireT3, "Tumbled Saphire T3");
	ModLoader.addName(amethystT3, "Tumbled Amethyst T3");
	ModLoader.addName(bloodstoneT3, "Tumbled BloodStone T3");
	ModLoader.addName(dioptaseT3, "Tumbled Dioptase T3");
	//liquids
	ModLoader.addName(HolyLiquidMoving, "Holy Water Moving");
	ModLoader.addName(HolyLiquidStill, "Holy Water Still");
	ModLoader.addName(DarkLiquidMoving, "Dark Water Moving");
	ModLoader.addName(DarkLiquidStill, "Dark Water Still");
	//herobrine
	ModLoader.addName(dark, "Darkness...");
	ModLoader.addName(phase, "Is it there...");
}

public void Texture() {
	//texture sheets
	MinecraftForgeClient.preloadTexture("/cristal/terrain.png");
	MinecraftForgeClient.preloadTexture("/cristal/items.png");
	
	//Blocks
	quarts.blockIndexInTexture = 0;
	malchite.blockIndexInTexture = 1;
	emerald.blockIndexInTexture = 2;
	aquamarine.blockIndexInTexture = 3;
	salt.blockIndexInTexture = 32;
	tiger.blockIndexInTexture = 4;
	ruby.blockIndexInTexture = 5;
	saphire.blockIndexInTexture = 6;
	amethyst.blockIndexInTexture = 20;
	bloodStone.blockIndexInTexture = 16;
	boulder.blockIndexInTexture = 36;
	copper.blockIndexInTexture = 7;
	dioptase.blockIndexInTexture = 52;
	jet.blockIndexInTexture = 17;
	sulpher.blockIndexInTexture = 33;
	thulite.blockIndexInTexture = 8;
	zincite.blockIndexInTexture = 18;
	silicon.blockIndexInTexture = 50;
	sunstone.blockIndexInTexture = 20;
	//Items
	
	//gems
	quartsG.iconIndex = 0;
	emeraldG.iconIndex = 1;
	malG.iconIndex = 2;
	aquaG.iconIndex = 3;
	saltG.iconIndex = 4;
	tigerG.iconIndex = 5;
	rubyG.iconIndex = 6;
	saphireG.iconIndex = 7;
	amethystG.iconIndex = 8;
	bloodstoneG.iconIndex = 9;
	dioptaseG.iconIndex = 10;
	jetG.iconIndex = 11;
	thuliteG.iconIndex = 12;
	topasG.iconIndex = 13;
	zinciteG.iconIndex = 14;
	tourmalineG.iconIndex = 15;
	sypsumG.iconIndex = 16;
	calciteG.iconIndex = 17;
	flouriteG.iconIndex = 18;
	apatiteG.iconIndex = 19;
	orthoclaseG.iconIndex = 20;
	hematiteG.iconIndex = 21;
	siliconG.iconIndex = 22;
	tektiteG.iconIndex = 23;
	sunstoneG.iconIndex = 24;
	garnetG.iconIndex = 25;
	amberG.iconIndex = 26;
	mossyagateG.iconIndex = 27;
	kyaniteG.iconIndex = 28;
	jadeG.iconIndex = 29;
	adventG.iconIndex = 30;
	
	//tumbled gems tier 1
	quartsT1.iconIndex = 8;
	
	//tumbled gems tier 2
	quartsT2.iconIndex = 9;
	
	//tumbled gems tier 3
	quartsT3.iconIndex = 10;
}

public void Recipes() {
	ModLoader.addRecipe(new ItemStack(silicon, 1), new Object[] {
	"PPP", "PPP", "PPP", ('P'), siliconP
	});
	ModLoader.addRecipe(new ItemStack(emerald, 1), new Object[] {
	"G", "S", ('G'), emerald, ('S'), Block.stone
	});
	ModLoader.addRecipe(new ItemStack(tumbler, 1), new Object[] {
	"CCC", "CDC", "CCC", ('C'), Block.cobblestone, ('D'), Item.diamond
	});

}

public void TestingRecipes(){
	//Resources
	ModLoader.addRecipe(new ItemStack(Block.blockDiamond, 640), new Object[]{
		"XXX","XXX","XXX", ('X'), Block.dirt
	});	
	ModLoader.addRecipe(new ItemStack(Block.wood, 640), new Object[]{
		"XX "," XX","X X", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(Block.cobblestone, 640), new Object[]{
		"XXX", "YYY", "ZZZ", ('X'), Block.dirt, ('Y'), Block.sand, ('Z'), Block.cobblestone
	});
	ModLoader.addRecipe(new ItemStack(Block.blockGold, 640), new Object[]{
		"X X","XXX","X X", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(Block.blockSteel, 640), new Object[]{
		"X X", "XYX", "X X", ('X'), Block.dirt, ('Y'), Block.sand
	});
	ModLoader.addRecipe(new ItemStack(Block.dirt, 640), new Object[]{
		"XXX", " X ", "XXX", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(Block.sand, 640), new Object[]{
		"XXX", "   ", "XXX", ('X'), Block.dirt
	});
	//liquid
	ModLoader.addRecipe(new ItemStack(HolyLiquidStill, 64), new Object[]{
		" X ","X X"," X ", ('X'), Block.dirt
	});
	//herobrine blocks
	ModLoader.addRecipe(new ItemStack(dark, 1), new Object[]{
		"   "," X ","   ", ('X'), Block.brick
	});
	ModLoader.addRecipe(new ItemStack(phase, 1), new Object[]{
		" X "," X ","   ", ('X'), Block.brick
	});
	//Crystals
	ModLoader.addRecipe(new ItemStack(quarts, 64), new Object[]{
		"X  ", "   ", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(emerald, 64), new Object[]{
		"XX ", "   ", "   ", ('X'),Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(malchite, 64), new Object[]{
		"XXX", "   ", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(aquamarine, 64), new Object[]{
		"XXX", "X  ", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(salt, 64), new Object[]{
		"XXX", "XX ", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(tiger, 64), new Object[]{
		"XXX", "XXX", "X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(ruby, 64), new Object[]{
		"XXX", "XXX", "XX ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(saphire, 64), new Object[]{
		"X X", " X ", "X X", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(amethyst, 64), new Object[]{
		"X X", "X  ", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(bloodStone, 64), new Object[]{
		"X X", "XX ", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(boulder, 64), new Object[]{
		"X X", "XXX", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(copper, 64), new Object[]{
		"X X", " X ", "   ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(dioptase, 64), new Object[]{
		"X X", "X  ", "X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(jet, 64), new Object[]{
		"X X", "X  ", "XX ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(petriWood, 64), new Object[]{
		"X X", "X  ", "X X", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(sulpher, 64), new Object[]{
		"X X", "X  ", " X ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(thulite, 64), new Object[]{
		"X X", "XX ", "X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(zincite, 64), new Object[]{
		"X X", "X  ", "XXX", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(sPeater, 64), new Object[]{
		"X  ","X  ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(sbQuarts, 64), new Object[]{
		"X  ","XX ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(tourmaline, 64), new Object[]{
		"X  ","X X","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(fossil, 64), new Object[]{
		"X X","XXX","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(eQuarts, 64), new Object[]{
		"XXX","X   ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(talc, 64), new Object[]{
		"X X","X  ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(sypsum, 64), new Object[]{
		"X X","XX ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(calcite, 64), new Object[]{
		"X X","XXX","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(flourite, 64), new Object[]{
		"X X","X X","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(apatite, 64), new Object[]{
		"X X"," X ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(orthoclase, 64), new Object[]{
		"X X","X  ","XX ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(corundum, 64), new Object[]{
		"X X","X  ","XXX", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(hematite, 64), new Object[]{
		"X X","X  ","X X", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(silicon, 64), new Object[]{
		"XXX","XX ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(silver, 64), new Object[]{
		"XXX","X X","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(petriBud, 64), new Object[]{
		"XXX","XX ","XX ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(tektite, 64), new Object[]{
		"XXX","XX ","X X", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(sunstone, 64), new Object[]{
		"XXX","XX "," X ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(garnet, 64), new Object[]{
		"XXX","X X","XX ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(amber, 64), new Object[]{
		"XXX","X X","XXX", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(mAgate, 64), new Object[]{
		"XXX","X X"," X ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(kyanite, 64), new Object[]{
		"XX ","X  ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(jade, 64), new Object[]{
		"XX ","XX ","X  ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(adventurene, 64), new Object[]{
		"XX ","XXX"," X ", ('X'), Block.dirt
	});
	ModLoader.addRecipe(new ItemStack(geode, 64), new Object[]{
		"  C", "   ", "X  ", ('X'), Block.dirt, ('C'), Block.sand
	});
}
public void Smelting() {

}

public void KeyboardEvent(KeyBinding kb){
	if (kb == this.key1){
		minecraft.thePlayer.inventory.addItemStackToInventory(new ItemStack(Item.appleGold, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(1, new ItemStack(tumbler, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(2, new ItemStack(Item.pickaxeDiamond, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(3, new ItemStack(Block.blockDiamond, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(4, new ItemStack(Block.blockGold, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(5, new ItemStack(Block.blockSteel, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(6, new ItemStack(Block.wood, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(7, new ItemStack(Block.stone, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(8, new ItemStack(Block.bookShelf, 64));
		minecraft.thePlayer.inventory.setInventorySlotContents(9, new ItemStack(Block.enchantmentTable, 64));
		minecraft.thePlayer.setXPStats(0, 0, 1000000);
	}
	if(kb == this.key2 ){
		minecraft.thePlayer.inventory.dropAllItems();
	}
}
public void AddMobs() {
	ModLoader.registerEntityID(EntityPenguin.class, "Penguin", ModLoader.getUniqueEntityId());
	ModLoader.addSpawn("Penguin", 30, 10, 10, EnumCreatureType.creature, new BiomeGenBase[]{//numbers not final will be 1,1,2
		BiomeGenBase.iceMountains,
		BiomeGenBase.icePlains,
		BiomeGenBase.taiga,
		BiomeGenBase.frozenOcean,
		BiomeGenBase.plains//testing only
		});
}

public void AddRenderer(Map m){
	m.put(EntityPenguin.class, new RenderPenguin(new ModelPenguin(), 0.7F));
}

public void Achieves() {
ModLoader.addAchievementDesc(thingy, "Whats this do?", "Make a gem tumbler...");
ModLoader.addAchievementDesc(tumbled, "Tumbled", "Tumble your first gem");
}

public void TakenFromCrafting(EntityPlayer var1, ItemStack var2) {
	if(var2.itemID == mod_CC.tumbler.blockID) {
		var1.addStat(thingy, 1);
	}
}

public String getVersion() {
	return "Pre releace V1";
}


public void load() {
	Register();
	Name();
	Texture();
	Recipes();
	Smelting();
	AddMobs();
	Achieves();
	TestingRecipes();
}
}