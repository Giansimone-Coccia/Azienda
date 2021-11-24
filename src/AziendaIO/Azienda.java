package AziendaIO;

//Class' Azienda definition
public class Azienda {
	private String name;
	private String type;
	private String address;
	private String employees;
	
	//Constructor
	public Azienda(String name, String type, String address, String employees) {
		this.name = name;
		this.type = type;
		this.address = address;
		this.employees = employees;
	}
	
	//Get and set methods
	public void setName(String nome) {
		this.name = nome;
	}
	
	public void setType(String tipo) {
		this.type = tipo;
	}
	
	public void setAddress(String v) {
		this.address = v;
	}
	
	public void setEmployees(String num) {
		this.employees = num;
	}
	
	public String toString() {
		return this.name +" "+ this.type +" "+ this.address +" "+ this.employees+ "\n";
	}
}
