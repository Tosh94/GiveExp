package me.PimpDuck.GiveExp;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandExecutor20 implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		player.giveExpLevels(20);
		player.sendMessage(ChatColor.GOLD + "You have been given 20 EXP levels!");
		
		
		
		return false;
	}

}
