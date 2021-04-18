package com.partosb.emf.books.persistence;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import com.partosb.emf.books.BooksFactory;
import com.partosb.emf.books.BooksPackage;
import com.partosb.emf.books.Root;
import com.partosb.emf.books.provider.BooksItemProviderAdapterFactory;

public class FilePersistence {

	private static final String BOOKS_EXTENSION = "books";

	private EditingDomain editingDomain;
	private ResourceSet resourceSet;
	private Resource loadedResource;

	public FilePersistence() {
		initializeLoader();
	}

	public void initializeLoader() {

		BooksPackage.eINSTANCE.eClass();
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new BooksItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		BasicCommandStack basicCommandStack = new BasicCommandStack();
		XMIResourceFactoryImpl xmiResourceFactoryImpl = new XMIResourceFactoryImpl();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(BOOKS_EXTENSION, xmiResourceFactoryImpl);

		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, basicCommandStack, new HashMap<>());

		resourceSet = editingDomain.getResourceSet();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(BOOKS_EXTENSION,
				xmiResourceFactoryImpl);
		resourceSet.getPackageRegistry().put(BooksPackage.eNS_URI, BooksPackage.eINSTANCE);

	}

	public void saveModel() {
		try {
			loadedResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new IllegalStateException("Could not save the model file.", e);
		}
	}

	public void createModelFile(String filePath) {
		Root modelRoot = BooksFactory.eINSTANCE.createRoot();
		createModelFile(filePath, modelRoot);
	}

	public void createModelFile(String filePath, Root newModelRoot) {
		if (null != loadedResource) {
			loadedResource.unload();
		}

		URI fileURI = URI.createFileURI(filePath);
		loadedResource = resourceSet.createResource(fileURI);

		loadedResource.getContents().add(newModelRoot);

		saveModel();

	}

	public Root getRootFromModelFile(String filePath) {

		if (null != loadedResource) {
			loadedResource.unload();
		}

		URI fileURI = URI.createFileURI(filePath);
		loadedResource = resourceSet.getResource(fileURI, true);
		return (Root) loadedResource.getContents().get(0);
	}

}
