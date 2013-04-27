package me.guenniman.race;

import me.guenniman.hug.HugCommand;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	@Override
	public void onDisable(){
		System.out.println("[Race] v" + this.getDescription().getVersion() + " is Disabled!");
	}
	
	@Override
	public void onEnable(){
		
		
		
		getCommand("race").setExecutor(new CommandRace(cfg, races, this));
		
	}
	
	
	
}
