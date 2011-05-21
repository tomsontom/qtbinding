
package org.ufacekit.qt.idl.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QIdlStandaloneSetup extends QIdlStandaloneSetupGenerated{

	public static void doSetup() {
		new QIdlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

