package us.greenzack.antigrief.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import us.greenzack.antigrief.objects.AlertType;

public class Sanitiser {
	
	public String sanitisePerm(AlertType type){
		
		return "antigrief.bypass." + type.getPermission();
	}
	
	public String populateMsg(String msg, Integer quantity, String player){
		
		msg = msg.replace("$player$", player);
		msg = msg.replace("$amount$", quantity.toString());
		msg = this.sanitiseMsg(msg);
		
		return msg;
	}
	
	public String sanitiseMsg(String msg){
		
		msg = this.addColour("[AntiGrief] - ") + msg;
		
		//TODO: Add config option for message prefix and colour
		
		return msg;
	}
	
	public void sendMsg(String msg, Player player){
		
		player.sendMessage(this.sanitiseMsg(msg));
	}
	
	public String addColour(String msg){
		
		return ChatColor.translateAlternateColorCodes('&', msg);
	}
	
	public String sanitiseConfig(AlertType type){
		
		return "AntiGrief.Settings." + type.name().toLowerCase().replace("_", ".");
	}
}
