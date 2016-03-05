package codingdojo.minecraftforge;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	public static final String MODID = "CodingDojoMod";
	public static final String VERSION = "1.0";
	
	@EventHandler
	public void init(FMLInitializationEvent whateverIWantHere) {
		MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
//		MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
		MinecraftForge.EVENT_BUS.register(new SuperJump());
		MinecraftForge.EVENT_BUS.register(new Parachute());
		MinecraftForge.EVENT_BUS.register(new BlockFillerPositionSelector());
	}
	
	  @EventHandler
	  public void serverLoad(FMLServerStartingEvent event) {
		  event.registerServerCommand(new FlamingPigs());
		  event.registerServerCommand(new BlockFillCommand());
	  }
}
