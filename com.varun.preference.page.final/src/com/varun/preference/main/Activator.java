package com.varun.preference.main;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static Activator plugin;
	public static BundleContext context;
	
	public Activator() {
	}
	
	@Override
	public void start(BundleContext context){

		Activator.context = context;
		System.out.println("---InStart---");
		plugin = this;
	}
	
	@Override
	public void stop(BundleContext context){

		Activator.context = null;
	}
	
	public static Activator getDefault(){

		return plugin;
	}

}
