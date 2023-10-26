package io.github.mooy1.infinityexpansion.items.machines;

import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.ElectricSmeltery;
import org.bukkit.inventory.ItemStack;

public class InfinitySmeltery extends ElectricSmeltery {

    private final ItemSetting<Integer> ENERGY = new ItemSetting<>(this, "energy", 480);
    private final ItemSetting<Integer> SPEED = new ItemSetting<>(this, "speed", 48);

    public InfinitySmeltery(SlimefunItemStack item) {
        super(Groups.ADVANCED_MACHINES, item, InfinityWorkbench.TYPE, new ItemStack[]{
                SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2,
                SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2,
                Materials.MACHINE_CIRCUIT, Materials.MACHINE_CORE, Materials.MACHINE_CIRCUIT
        });
        this.addItemSetting(ENERGY);
        this.addItemSetting(this.SPEED);
        this.ENERGY.reload();
        this.SPEED.reload();
    }

    public int getSpeed() {
        return this.SPEED.getValue();
    }

    public int getCapacity() {
        return this.ENERGY.getValue();
    }

    public int getEnergyConsumption() {
        return this.ENERGY.getValue();
    }

}