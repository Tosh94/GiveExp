package me.PimpDuck.GiveExp;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandExecutor100 implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		player.giveExpLevels(100);
		player.sendMessage(ChatColor.GOLD + "You have been given 100 EXP levels!");
		
		
		
		return false;
	}

}
