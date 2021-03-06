package com.xml.parsing.xmlsaxparser;

/**
 * @author Kavya Kommineni
 * This class is used to construct the Contact objects
 */
public class Contact {
	
	private int id;
	private String name;
	private String lastName;
	//private List<Contact> contacts;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Contact(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	public Contact() {
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
}
