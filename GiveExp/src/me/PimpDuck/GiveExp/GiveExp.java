package me.PimpDuck.GiveExp;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GiveExp extends JavaPlugin{
	
	public final Logger log = Logger.getLogger("Minecraft");

	private CommandExecutor10 commandexecutor10;
	private CommandExecutor20 commandexecutor20;
	private CommandExecutor30 commandexecutor30;
	private CommandExecutor40 commandexecutor40;
	private CommandExecutor50 commandexecutor50;
	private CommandExecutor60 commandexecutor60;
	private CommandExecutor70 commandexecutor70;
	private CommandExecutor80 commandexecutor80;
	private CommandExecutor90 commandexecutor90;
	private CommandExecutor100 commandexecutor100;
	
	
	@Override
	public void onEnable(){
		log.info("[TestPlugin] Verison 1.0 has been enabled!");
		//: This is adding the other commands.
		commandexecutor10 = new CommandExecutor10();
		getCommand("giveexp10").setExecutor(commandexecutor10);
		commandexecutor20 = new CommandExecutor20();
		getCommand("giveexp20").setExecutor(commandexecutor20);
		commandexecutor30 = new CommandExecutor30();
		getCommand("giveexp30").setExecutor(commandexecutor30);
		commandexecutor40 = new CommandExecutor40();
		getCommand("giveexp40").setExecutor(commandexecutor40);
		commandexecutor50 = new CommandExecutor50();
		getCommand("giveexp50").setExecutor(commandexecutor50);
		commandexecutor60 = new CommandExecutor60();
		getCommand("giveexp60").setExecutor(commandexecutor60);
		commandexecutor70 = new CommandExecutor70();
		getCommand("giveexp70").setExecutor(commandexecutor70);
		commandexecutor80 = new CommandExecutor80();
		getCommand("giveexp80").setExecutor(commandexecutor80);
		commandexecutor90 = new CommandExecutor90();
		getCommand("giveexp90").setExecutor(commandexecutor90);
		commandexecutor100 = new CommandExecutor100();
		getCommand("giveexp100").setExecutor(commandexecutor100);
		//: This adds color to the permission-message:.
		this.getCommand("giveexp").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to see this!");
		this.getCommand("giveexp10").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
        this.getCommand("giveexp20").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp30").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp40").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp50").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp60").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp70").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp80").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp90").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
		this.getCommand("giveexp100").setPermissionMessage(ChatColor.DARK_RED + "You don't have permission to do this!");
        //: This sets the permissions.
		this.getCommand("giveexp").setPermission("giveexp.giveexp.info");
        this.getCommand("giveexp10").setPermission("giveexp.giveexp.10");
        this.getCommand("giveexp20").setPermission("giveexp.giveexp.20");
        this.getCommand("giveexp30").setPermission("giveexp.giveexp.30");
        this.getCommand("giveexp40").setPermission("giveexp.giveexp.40");
        this.getCommand("giveexp50").setPermission("giveexp.giveexp.50");
        this.getCommand("giveexp60").setPermission("giveexp.giveexp.60");
        this.getCommand("giveexp70").setPermission("giveexp.giveexp.70");
        this.getCommand("giveexp80").setPermission("giveexp.giveexp.80");
        this.getCommand("giveexp90").setPermission("giveexp.giveexp.90");
        this.getCommand("giveexp100").setPermission("giveexp.giveexp.100");
        
        
	}
	@Override
	public void onDisable(){
		log.info("[TestPlugin] Verison 1.0 has been disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
	    if(commandLabel.equalsIgnoreCase("giveexp")){
	    	player.sendMessage(ChatColor.GOLD + "Do /giveexp 10,20,30,40,50,60,70,80,90,100" + ChatColor.DARK_RED + " This plugin was originaly created for donators so they could do /giveexp{number} every 24 hours. I am not that experienced with java yet. I will be soon adding stuff like that.");
	    	
	 }
		return false;
  }
	
	

}

