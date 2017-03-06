package me.tvoh19.prankpl;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Prank extends JavaPlugin {
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fakeop")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Please specify a player!");
				return true;
			}
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if (target == null) {
				sender.sendMessage(ChatColor.RED + "Could not find player " + args[0] + ".");
				return true;
			}
			target.sendMessage(ChatColor.YELLOW + "You are now op!");
			sender.sendMessage(ChatColor.GREEN + "Success!");
		}
		if (cmd.getName().equalsIgnoreCase("fakejoin")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Please specify a name!");
				return true;
			}
			Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game");
		}
		return true;
	}
}


