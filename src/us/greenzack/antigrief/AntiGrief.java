package us.greenzack.antigrief;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import us.greenzack.antigrief.alerts.AlertsQueue;
import us.greenzack.antigrief.utils.Sanitiser;

public class AntiGrief extends JavaPlugin{
	
	public final Logger log = Logger.getLogger("Minecraft");
	
	public AlertsQueue alerts;
	public Sanitiser sanitiser;
	
	public void onEnable() {

		log.info("AntiGrief v4.0 is Enabled");
	}
	
	public void onDisable() {
		
		log.info("AntiGrief v4.0 is Disabled");
	}
}