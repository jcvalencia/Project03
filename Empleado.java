public class Empleado {

	private String nombre;
	private String apellido;
	private double salarioMensual;
	public static int totalEmpleados;
	
	public Empleado(String nombre, String apellido, double salarioMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
		Empleado.totalEmpleados++;
	} //constructor
	
	public double getSalarioAnual() {
		return salarioMensual * 12;
	}//getSalarioAnual
	
	public String getNombre() {
		return nombre;
	}//getNombre
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getApellido() {
		return apellido;
	}//getApellido

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}//setApellido

	public double getSalarioMensual() {
		return salarioMensual;
	}//getSalarioMensual

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}//setSalarioMensual

	@Override
	public String toString() {
		return "======================================================================================================\n"
		+ "Empleado [Nombre=" + nombre + ", Apellido=" + apellido + ", Salario Mensual= $" + String.format("%,.2f", salarioMensual)+ "]";
	}//toString
	
	public String printSalarioAnual () {
		return "Salario Anual= $" + String.format("%,.2f", getSalarioAnual());
	}// printSalarioAnual
	
} //class Empleado
