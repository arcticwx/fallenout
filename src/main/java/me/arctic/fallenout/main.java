package me.arctic.fallenout;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

//TODO: Add pipboy

@Deprecated
public class main implements ModInitializer {
	private static final Item PLATINUM_CHIP = platinum_chip.PLATINUM_CHIP;
	private static final Item STIMPACK = stimpack.STIMPACK;
	private static final Item BEER = alchahol.BEER;
	private static final Item WINE = alchahol.WINE;
	private static final Item VODKA = alchahol.VODKA;
	private static final Item NUKA_COLA = nuka_cola.NUKA_COLA;

	public static final ArmorMaterial POWER_ARMOR = new powerArmorMaterial();

	public static final Item RAW_PLATINUM = platinum.RAW_PLATINUM;
	public static final Item PLATINUM = platinum.PLATINUM;

	public static final Biome MOJAVE = mojave_biome.MOJAVE;
	public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> MOJAVE_SURFACE_BUILDER_0 = mojave_biome.MOJAVE_SURFACE_BUILDER_0;
	public static final RegistryKey<Biome> MOJAVE_KEY = mojave_biome.MOJAVE_KEY;

	@Override
	public void onInitialize() {
		/*Start of items*/
		Registry.register(Registry.ITEM, new Identifier("fallenout", "platinum_chip"), PLATINUM_CHIP);
		Registry.register(Registry.ITEM, new Identifier("fallenout", "stimpack"), STIMPACK);
		Registry.register(Registry.ITEM, new Identifier("fallenout", "beer"), BEER);
		Registry.register(Registry.ITEM, new Identifier("fallenout", "wine"), WINE);
		Registry.register(Registry.ITEM, new Identifier("fallenout", "vodka"), VODKA);
		Registry.register(Registry.ITEM, new Identifier("fallenout", "nuka_cola"), NUKA_COLA);
		Registry.register(Registry.ITEM, new Identifier("fallenout", "tire_iron"), new tire_iron(new tire_iron_material()));
		/*End of items*/

		/*Start of armor*/
		Registry.register(Registry.ITEM, new Identifier("fallenout", "power_armor_helmet"), new powerArmor(POWER_ARMOR, EquipmentSlot.HEAD));
		Registry.register(Registry.ITEM, new Identifier("fallenout", "power_armor_chest"), new powerArmor(POWER_ARMOR, EquipmentSlot.CHEST));
		Registry.register(Registry.ITEM, new Identifier("fallenout", "power_armor_legs"), new powerArmor(POWER_ARMOR, EquipmentSlot.LEGS));
		Registry.register(Registry.ITEM, new Identifier("fallenout", "power_armor_boots"), new powerArmor(POWER_ARMOR, EquipmentSlot.FEET));
		/*End of armor*/

		/*Start of materials*/
		Registry.register(Registry.ITEM, new Identifier("fallenout", "raw_platinum"), RAW_PLATINUM);
		Registry.register(Registry.ITEM, new Identifier("fallenout", "platinum"), PLATINUM);
		/*End of materials*/

		/*Start of biomes*/
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("fallenout", "mojave"), MOJAVE_SURFACE_BUILDER_0);
		Registry.register(BuiltinRegistries.BIOME, MOJAVE_KEY.getValue(), MOJAVE);
		OverworldBiomes.addContinentalBiome(MOJAVE_KEY, OverworldClimate.DRY, 20);
		/*End of biomes*/

	}
}
