package us.greenzack.antigrief.alerts;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import us.greenzack.antigrief.AntiGrief;
import us.greenzack.antigrief.objects.AlertType;

public class AlertsQueue {
	
	public AntiGrief plugin;
	
	public AlertsQueue(AntiGrief instance){
		plugin = instance;
	}
	
	//HashMap of String playerName by a HashMap of String alertType followed by Integer quantity.
	
	public HashMap<String, HashMap<AlertType, Integer>> queuedAlerts = new HashMap<String, HashMap<AlertType, Integer>>();
	private Map<String, AlertType> alertTypes = null;
	
	public AlertType getType(Integer id, Integer datavalue){
		
		if(alertTypes.isEmpty()){
			
			for(AlertType type : AlertType.values()){
				
				alertTypes.put(type.getItemId() + ":" + type.getDataValue(), type);
			}
		}
		
		AlertType type = alertTypes.get(id + ":" + datavalue);
		
		return type;
	}
	
	public void addAlert(String playerName, AlertType type){
		
		HashMap<AlertType, Integer> alert = this.queuedAlerts.get(playerName);
		Integer amount = this.queuedAlerts.get(playerName).get(type);
		alert.put(type, amount);
		
		this.queuedAlerts.put(playerName, alert);
	}
	
	public void dispatchAlerts(){
		
		//FIXME: Change code for AlertType changes.
		
		for(Player player : Bukkit.getOnlinePlayers()){
		
			for(String playerName : queuedAlerts.keySet()){
				
				for(AlertType type : queuedAlerts.get(playerName).keySet()){
					
					Integer quantity = queuedAlerts.get(playerName).get(type);
					String permission = plugin.sanitiser.sanitisePerm(type);
					String message = plugin.sanitiser.populateMsg(type.getAdminMessage(), quantity, playerName);
						
					if(player.hasPermission(permission)){
						
						player.sendMessage(message);
					}
				}
			}
		}
		
		queuedAlerts.clear();
	}
}
