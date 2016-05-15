package com.varun.preference.page_final;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class Initializer extends AbstractPreferenceInitializer {

	public Initializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {

		IPreferenceStore store = 
				new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.varun.preference.page.final");
		
		System.out.println("Default Preference Initializer");
		
		store.setDefault("BOOLEAN_VALUE", true);
	}
}
