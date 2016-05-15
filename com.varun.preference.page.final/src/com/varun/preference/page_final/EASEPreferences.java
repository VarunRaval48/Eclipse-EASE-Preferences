package com.varun.preference.page_final;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.varun.preference.main.Activator;

public class EASEPreferences extends FieldEditorPreferencePage 
				implements IWorkbenchPreferencePage {

	public EASEPreferences(){
		super(GRID);
	}
	
	@Override
	public void init(IWorkbench workbench) {

//		setPreferenceStore(getPreferenceStore());
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Final Implementation");
	}

	@Override
	protected void createFieldEditors() {

		addField(new DirectoryFieldEditor("PATH", "Get &Default Keystore:",
		        getFieldEditorParent()));
		
	    addField(new BooleanFieldEditor("BOOLEAN_VALUE",
	        "&Automatically run scripts that are not signed(Not Recommended)", 
	        getFieldEditorParent()));

//	    addField(new RadioGroupFieldEditor("CHOICE",
//	        "An example of a multiple-choice preference", 1,
//	        new String[][] { { "&Choice 1", "choice1" },
//	            { "C&hoice 2", "choice2" } }, getFieldEditorParent()));
//	    
//	    addField(new StringFieldEditor("MySTRING1", "A &text preference:",
//	        getFieldEditorParent()));
//	    
//	    addField(new StringFieldEditor("MySTRING2", "A &text preference:",
//	        getFieldEditorParent()));
	}

}
