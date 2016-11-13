package com.tutorialspoint.springframework.injectingcollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class JavaCollection {

	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;

	// Um metodo setter para set List.
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	// Imprime e retorna todos os elementos da lista.
	public List getAddressList() {
		System.out.println("List Elements :" + addressList);
		return addressList;
	}

	// Um metodo setter para set Set.
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	// Imprime e retorna todos os elementos do Set.
	public Set getAddressSet() {
		System.out.println("Set Elements :" + addressSet);
		return addressSet;
	}

	// Um metodo setter para set Map
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	// Imprime e retorna todos os elementos do Map.
	public Map getAddressMap() {
		System.out.println("Map Elements :" + addressMap);
		return addressMap;
	}

	// Um metodo set para set Properties.
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	// Imprime e retorna todos os elementos do Properties.
	public Properties getAddressProp() {
		System.out.println("Properties Elements :" + addressProp);
		return addressProp;
	}
}