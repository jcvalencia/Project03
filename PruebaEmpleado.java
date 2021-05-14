public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Juan", "Pérez", 12500);
		Empleado empleado2 = new Empleado("María", "Díaz", 15200);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		
		System.out.println();
		//Aumento del 10% a cada empleado
		empleado1.setSalarioMensual(empleado1.getSalarioMensual()*1.10);
		empleado2.setSalarioMensual(empleado2.getSalarioMensual()*1.10);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado1.printSalarioAnual());
		System.out.println();
		System.out.println(empleado2.toString());
		System.out.println(empleado2.printSalarioAnual());
		
		System.out.println("\n\n\nTotal de Empleados hasta la fecha " + Empleado.totalEmpleados);
		
	} //main

} //class PruebaEmpleado
