package com.example.examplemod;
import com.example.examplemod.*;
import net.minecraftforge.fml.common.*;

@Mod(modid = arcdemo.MODID, name = arcdemo.NAME, version = arcdemo.VERSION, acceptedMinecraftVersions = "1.8.9")
public class arcdemo {
    public static final String MODID = "aircraftdemo";
    public static final String NAME = "Aircraft Demo";
    public static final String VERSION = "1.0.0";

    @Instance(arcdemo.MODID)
    public static arcdemo instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // TODO
    }
}
