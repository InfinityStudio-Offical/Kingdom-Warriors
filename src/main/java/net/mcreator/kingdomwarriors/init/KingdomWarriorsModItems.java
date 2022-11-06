
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdomwarriors.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.kingdomwarriors.item.WaterGlassBreakerItem;
import net.mcreator.kingdomwarriors.item.StormLanderItem;
import net.mcreator.kingdomwarriors.item.SoildWithCurshedIronoreBottleItem;
import net.mcreator.kingdomwarriors.item.SoildWithCementBottleItem;
import net.mcreator.kingdomwarriors.item.SoildBottleItem;
import net.mcreator.kingdomwarriors.item.SliverIngotItem;
import net.mcreator.kingdomwarriors.item.SliverDustItem;
import net.mcreator.kingdomwarriors.item.NetherithesItem;
import net.mcreator.kingdomwarriors.item.NetheriteBattleAxeItem;
import net.mcreator.kingdomwarriors.item.IronsItem;
import net.mcreator.kingdomwarriors.item.IronBattleAxeItem;
import net.mcreator.kingdomwarriors.item.GlassBreakerWithSliverdustItem;
import net.mcreator.kingdomwarriors.item.GlassBreakerItem;
import net.mcreator.kingdomwarriors.item.DiamondsItem;
import net.mcreator.kingdomwarriors.item.DiamondBattleAxeItem;
import net.mcreator.kingdomwarriors.item.CoinsSliverItem;
import net.mcreator.kingdomwarriors.item.CoinsGoldItem;
import net.mcreator.kingdomwarriors.item.CoinsCopperItem;
import net.mcreator.kingdomwarriors.item.BedrockPickaxeItem;
import net.mcreator.kingdomwarriors.KingdomWarriorsMod;

public class KingdomWarriorsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KingdomWarriorsMod.MODID);
	public static final RegistryObject<Item> COINS_COPPER = REGISTRY.register("coins_copper", () -> new CoinsCopperItem());
	public static final RegistryObject<Item> COINS_SLIVER = REGISTRY.register("coins_sliver", () -> new CoinsSliverItem());
	public static final RegistryObject<Item> COINS_GOLD = REGISTRY.register("coins_gold", () -> new CoinsGoldItem());
	public static final RegistryObject<Item> SLIVER_DUST = REGISTRY.register("sliver_dust", () -> new SliverDustItem());
	public static final RegistryObject<Item> SLIVER_INGOT = REGISTRY.register("sliver_ingot", () -> new SliverIngotItem());
	public static final RegistryObject<Item> GLASS_BREAKER = REGISTRY.register("glass_breaker", () -> new GlassBreakerItem());
	public static final RegistryObject<Item> WATER_GLASS_BREAKER = REGISTRY.register("water_glass_breaker", () -> new WaterGlassBreakerItem());
	public static final RegistryObject<Item> SOILD_BOTTLE = REGISTRY.register("soild_bottle", () -> new SoildBottleItem());
	public static final RegistryObject<Item> SOILD_WITH_CURSHED_IRONORE_BOTTLE = REGISTRY.register("soild_with_curshed_ironore_bottle",
			() -> new SoildWithCurshedIronoreBottleItem());
	public static final RegistryObject<Item> SOILD_WITH_CEMENT_BOTTLE = REGISTRY.register("soild_with_cement_bottle",
			() -> new SoildWithCementBottleItem());
	public static final RegistryObject<Item> GLASS_BREAKER_WITH_SLIVERDUST = REGISTRY.register("glass_breaker_with_sliverdust",
			() -> new GlassBreakerWithSliverdustItem());
	public static final RegistryObject<Item> DIAMONDS_HELMET = REGISTRY.register("diamonds_helmet", () -> new DiamondsItem.Helmet());
	public static final RegistryObject<Item> DIAMONDS_CHESTPLATE = REGISTRY.register("diamonds_chestplate", () -> new DiamondsItem.Chestplate());
	public static final RegistryObject<Item> DIAMONDS_LEGGINGS = REGISTRY.register("diamonds_leggings", () -> new DiamondsItem.Leggings());
	public static final RegistryObject<Item> DIAMONDS_BOOTS = REGISTRY.register("diamonds_boots", () -> new DiamondsItem.Boots());
	public static final RegistryObject<Item> IRON_BATTLE_AXE = REGISTRY.register("iron_battle_axe", () -> new IronBattleAxeItem());
	public static final RegistryObject<Item> DIAMOND_BATTLE_AXE = REGISTRY.register("diamond_battle_axe", () -> new DiamondBattleAxeItem());
	public static final RegistryObject<Item> NETHERITE_BATTLE_AXE = REGISTRY.register("netherite_battle_axe", () -> new NetheriteBattleAxeItem());
	public static final RegistryObject<Item> BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", () -> new BedrockPickaxeItem());
	public static final RegistryObject<Item> NETHERITHES_HELMET = REGISTRY.register("netherithes_helmet", () -> new NetherithesItem.Helmet());
	public static final RegistryObject<Item> NETHERITHES_CHESTPLATE = REGISTRY.register("netherithes_chestplate",
			() -> new NetherithesItem.Chestplate());
	public static final RegistryObject<Item> NETHERITHES_LEGGINGS = REGISTRY.register("netherithes_leggings", () -> new NetherithesItem.Leggings());
	public static final RegistryObject<Item> NETHERITHES_BOOTS = REGISTRY.register("netherithes_boots", () -> new NetherithesItem.Boots());
	public static final RegistryObject<Item> IRONS_HELMET = REGISTRY.register("irons_helmet", () -> new IronsItem.Helmet());
	public static final RegistryObject<Item> IRONS_CHESTPLATE = REGISTRY.register("irons_chestplate", () -> new IronsItem.Chestplate());
	public static final RegistryObject<Item> IRONS_LEGGINGS = REGISTRY.register("irons_leggings", () -> new IronsItem.Leggings());
	public static final RegistryObject<Item> IRONS_BOOTS = REGISTRY.register("irons_boots", () -> new IronsItem.Boots());
	public static final RegistryObject<Item> STORM_LANDER = REGISTRY.register("storm_lander", () -> new StormLanderItem());
}
