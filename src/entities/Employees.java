package entities;


public class Employees {
	private int id;
	private String name;
	private double salary;

	// Construtor
	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters e setters
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// toString
	public String toString() {
		return id + ", " + name + ", $" + String.format("%.2f", salary);
	}

	// Funcao de aumento de salario
	public void increase(double percent) {
		this.salary = salary * ((percent/100) + 1);
	}
}
