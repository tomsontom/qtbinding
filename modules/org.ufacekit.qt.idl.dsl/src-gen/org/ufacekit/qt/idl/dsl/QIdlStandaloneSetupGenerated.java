
package org.ufacekit.qt.idl.dsl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class QIdlStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.xbase.XbaseStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.ufacekit.qt.idl.dsl.QIdlRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.ufacekit.org/qt/idl/dsl/QIdl")) {
		EPackage.Registry.INSTANCE.put("http://www.ufacekit.org/qt/idl/dsl/QIdl", org.ufacekit.qt.idl.dsl.qIdl.QIdlPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("qbuiltin", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("qbuiltin", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("qclass", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("qclass", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("qnamespace", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("qnamespace", serviceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("qtypedef", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("qtypedef", serviceProvider);
		




	}
}
