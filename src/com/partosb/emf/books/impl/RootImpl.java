/**
 */
package com.partosb.emf.books.impl;

import com.partosb.emf.books.Book;
import com.partosb.emf.books.BooksPackage;
import com.partosb.emf.books.Person;
import com.partosb.emf.books.Publisher;
import com.partosb.emf.books.Root;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.partosb.emf.books.impl.RootImpl#getPeople <em>People</em>}</li>
 *   <li>{@link com.partosb.emf.books.impl.RootImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link com.partosb.emf.books.impl.RootImpl#getPublishers <em>Publishers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> people;

	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> books;

	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<Publisher> publishers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BooksPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPeople() {
		if (people == null) {
			people = new EObjectContainmentEList<Person>(Person.class, this, BooksPackage.ROOT__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooks() {
		if (books == null) {
			books = new EObjectContainmentEList<Book>(Book.class, this, BooksPackage.ROOT__BOOKS);
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<Publisher>(Publisher.class, this, BooksPackage.ROOT__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BooksPackage.ROOT__PEOPLE:
			return ((InternalEList<?>) getPeople()).basicRemove(otherEnd, msgs);
		case BooksPackage.ROOT__BOOKS:
			return ((InternalEList<?>) getBooks()).basicRemove(otherEnd, msgs);
		case BooksPackage.ROOT__PUBLISHERS:
			return ((InternalEList<?>) getPublishers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BooksPackage.ROOT__PEOPLE:
			return getPeople();
		case BooksPackage.ROOT__BOOKS:
			return getBooks();
		case BooksPackage.ROOT__PUBLISHERS:
			return getPublishers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BooksPackage.ROOT__PEOPLE:
			getPeople().clear();
			getPeople().addAll((Collection<? extends Person>) newValue);
			return;
		case BooksPackage.ROOT__BOOKS:
			getBooks().clear();
			getBooks().addAll((Collection<? extends Book>) newValue);
			return;
		case BooksPackage.ROOT__PUBLISHERS:
			getPublishers().clear();
			getPublishers().addAll((Collection<? extends Publisher>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BooksPackage.ROOT__PEOPLE:
			getPeople().clear();
			return;
		case BooksPackage.ROOT__BOOKS:
			getBooks().clear();
			return;
		case BooksPackage.ROOT__PUBLISHERS:
			getPublishers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BooksPackage.ROOT__PEOPLE:
			return people != null && !people.isEmpty();
		case BooksPackage.ROOT__BOOKS:
			return books != null && !books.isEmpty();
		case BooksPackage.ROOT__PUBLISHERS:
			return publishers != null && !publishers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
