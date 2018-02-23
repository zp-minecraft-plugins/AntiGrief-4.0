package us.greenzack.antigrief.listeners;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import us.greenzack.antigrief.AntiGrief;
import us.greenzack.antigrief.objects.AlertType;

public class PlaceListener implements Listener{
	
	public class MyDestroyListener implements Listener {
		public AntiGrief plugin;
		public Material[] destroyedBlacklist = {Material.TNT, Material.MOB_SPAWNER, Material.COMMAND};
		public final Logger logger = Logger.getLogger("Minecraft");
		
		public MyDestroyListener(AntiGrief instance){
			plugin = instance;
			Bukkit.getServer().getPluginManager().registerEvents(this,instance);
		}
		
		@EventHandler(ignoreCancelled = true)
		public void onBlockPlace(BlockPlaceEvent event){
			
			Integer blockid = event.getBlock().getTypeId();
			Integer datavalue = Integer.valueOf(event.getBlock().getData());
			AlertType type = plugin.alerts.getType(blockid, datavalue);
			
			Player player = event.getPlayer();
			String playerName = player.getName();
			
			if(plugin.getConfig().getBoolean(plugin.sanitiser.sanitiseConfig(type))){
				
				if(!player.hasPermission(plugin.sanitiser.sanitisePerm(type))){
					
					plugin.alerts.addAlert(playerName, type);
					event.setCancelled(true);
					
					plugin.sanitiser.sendMsg(type.getUserMessage(), player);
				}
			}
		}
	}
}
