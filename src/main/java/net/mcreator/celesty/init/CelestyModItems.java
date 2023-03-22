
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.celesty.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.celesty.item.YellowWoolBallItem;
import net.mcreator.celesty.item.WireSpoolItem;
import net.mcreator.celesty.item.WhiteWoolballItem;
import net.mcreator.celesty.item.RedWoolBallItem;
import net.mcreator.celesty.item.PurpleWoolBallItem;
import net.mcreator.celesty.item.PinkWoolBallItem;
import net.mcreator.celesty.item.OrangeWoolBallItem;
import net.mcreator.celesty.item.NeedleItem;
import net.mcreator.celesty.item.MagentaWoolBallItem;
import net.mcreator.celesty.item.LimeWoolBallItem;
import net.mcreator.celesty.item.LightBlueWoolBallItem;
import net.mcreator.celesty.item.GreyWoolBallItem;
import net.mcreator.celesty.item.GreenWoolBallItem;
import net.mcreator.celesty.item.DarkGreyWoolBallItem;
import net.mcreator.celesty.item.CyanWoolBallItem;
import net.mcreator.celesty.item.ButtonItem;
import net.mcreator.celesty.item.BrownWoolBallItem;
import net.mcreator.celesty.item.BlueWoolBallItem;
import net.mcreator.celesty.item.BlackWoolBallItem;
import net.mcreator.celesty.CelestyMod;

public class CelestyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CelestyMod.MODID);
	public static final RegistryObject<Item> NEEDLE = REGISTRY.register("needle", () -> new NeedleItem());
	public static final RegistryObject<Item> WIRE_SPOOL = REGISTRY.register("wire_spool", () -> new WireSpoolItem());
	public static final RegistryObject<Item> WHITE_WOOLBALL = REGISTRY.register("white_woolball", () -> new WhiteWoolballItem());
	public static final RegistryObject<Item> GREY_WOOL_BALL = REGISTRY.register("grey_wool_ball", () -> new GreyWoolBallItem());
	public static final RegistryObject<Item> DARK_GREY_WOOL_BALL = REGISTRY.register("dark_grey_wool_ball", () -> new DarkGreyWoolBallItem());
	public static final RegistryObject<Item> BLACK_WOOL_BALL = REGISTRY.register("black_wool_ball", () -> new BlackWoolBallItem());
	public static final RegistryObject<Item> BROWN_WOOL_BALL = REGISTRY.register("brown_wool_ball", () -> new BrownWoolBallItem());
	public static final RegistryObject<Item> PURPLE_WOOL_BALL = REGISTRY.register("purple_wool_ball", () -> new PurpleWoolBallItem());
	public static final RegistryObject<Item> MAGENTA_WOOL_BALL = REGISTRY.register("magenta_wool_ball", () -> new MagentaWoolBallItem());
	public static final RegistryObject<Item> PINK_WOOL_BALL = REGISTRY.register("pink_wool_ball", () -> new PinkWoolBallItem());
	public static final RegistryObject<Item> RED_WOOL_BALL = REGISTRY.register("red_wool_ball", () -> new RedWoolBallItem());
	public static final RegistryObject<Item> ORANGE_WOOL_BALL = REGISTRY.register("orange_wool_ball", () -> new OrangeWoolBallItem());
	public static final RegistryObject<Item> YELLOW_WOOL_BALL = REGISTRY.register("yellow_wool_ball", () -> new YellowWoolBallItem());
	public static final RegistryObject<Item> LIME_WOOL_BALL = REGISTRY.register("lime_wool_ball", () -> new LimeWoolBallItem());
	public static final RegistryObject<Item> GREEN_WOOL_BALL = REGISTRY.register("green_wool_ball", () -> new GreenWoolBallItem());
	public static final RegistryObject<Item> LIGHT_BLUE_WOOL_BALL = REGISTRY.register("light_blue_wool_ball", () -> new LightBlueWoolBallItem());
	public static final RegistryObject<Item> CYAN_WOOL_BALL = REGISTRY.register("cyan_wool_ball", () -> new CyanWoolBallItem());
	public static final RegistryObject<Item> BLUE_WOOL_BALL = REGISTRY.register("blue_wool_ball", () -> new BlueWoolBallItem());
	public static final RegistryObject<Item> BUTTON = REGISTRY.register("button", () -> new ButtonItem());
}
