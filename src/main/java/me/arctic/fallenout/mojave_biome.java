package me.arctic.fallenout;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

//TODO: Make water give poison affect in this biome.

public class mojave_biome {

    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> MOJAVE_SURFACE_BUILDER_0 = SurfaceBuilder.DEFAULT.withConfig(
            new TernarySurfaceConfig(
                    Blocks.SAND.getDefaultState(),
                    Blocks.SANDSTONE.getDefaultState(),
                    Blocks.CUT_SANDSTONE.getDefaultState()
            ));

    public static final Biome MOJAVE = createCustomLand();


    private static Biome createCustomLand(){
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addMonsters(spawnSettings, 69, 4, 69);
        DefaultBiomeFeatures.addCaveMobs(spawnSettings);

        GenerationSettings.Builder generatorSettings = new GenerationSettings.Builder();
        generatorSettings.surfaceBuilder(MOJAVE_SURFACE_BUILDER_0);
        DefaultBiomeFeatures.addDesertDeadBushes(generatorSettings);
        DefaultBiomeFeatures.addDesertFeatures(generatorSettings);

        return (new Biome.Builder()).precipitation(Biome.Precipitation.NONE).category(Biome.Category.DESERT).depth(0.1F).scale(0.2F).temperature(36F).downfall(0.4F).effects(new BiomeEffects.Builder().waterColor(195722).waterFogColor(227137).fogColor(0xD5AE19).skyColor(0x917D30).build()).spawnSettings(spawnSettings.build()).generationSettings(generatorSettings.build()).build();
    }
    public static final RegistryKey<Biome> MOJAVE_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("fallenout", "mojave"));
}
