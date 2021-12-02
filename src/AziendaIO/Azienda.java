package AziendaIO;

/**
 * Class Azeinda definitio
 * @author gians_ji5genm
 *
 */
public class Azienda {
	private String name;
	private String type;
	private String address;
	private String employees;
	
	/**
	 * Constructor
	 * @param name 
	 * @param type
	 * @param address
	 * @param employees
	 */
	public Azienda(String name, String type, String address, String employees) {
		this.name = name;
		this.type = type;
		this.address = address;
		this.employees = employees;
	}
	
	/**
	 * Method for setting the name
	 * @param nome person
	 */
	public void setName(String nome) {
		this.name = nome;
	}
	/**
	 * Method for setting the type
	 * @param tipo
	 */
	public void setType(String tipo) {
		this.type = tipo;
	}
	/**
	 * Method for setting the address
	 * @param v
	 */
	public void setAddress(String v) {
		this.address = v;
	}
	/**
	 * Method for setting the employees' number
	 * @param num
	 */
	public void setEmployees(String num) {
		this.employees = num;
	}
	/**
	 * @override toString
	 */
	public String toString() {
		return this.name +" "+ this.type +" "+ this.address +" "+ this.employees+ "\n";
	}
}
