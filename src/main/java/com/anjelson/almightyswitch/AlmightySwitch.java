package com.anjelson.almightyswitch;

import com.anjelson.almightyswitch.proxy.IProxy;
import com.anjelson.almightyswitch.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class AlmightySwitch
{
    @Mod.Instance("AlmightySwitch")
    public static AlmightySwitch instance;

    @SidedProxy(clientSide = "com.anjelson.almightyswitch.proxy.ClientProxy", serverSide = "com.anjelson.almightyswitch.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
