
public class Empleado extends Persona
{
	private double salario;
	private String cargo;
	public Empleado(String nombre, int edad, double salario, String cargo) {
		super(nombre, edad);
		this.salario = salario;
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return " "+ super.toString() + "\n Salario=" + salario + " \n Cargo=" + cargo;
	}

}
