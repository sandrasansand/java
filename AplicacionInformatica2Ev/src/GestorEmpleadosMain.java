import java.util.ArrayList;

public class GestorEmpleadosMain {

	public static void main(String[] args) {
		//creamos una lista de empleados
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		EAsalariado asalariado1 = new EAsalariado("12345678Z","Javier", "Gómez", 2015,1225);
		empleados.add(asalariado1);
		
		Ecomision ecom1 = new Ecomision("654456E","Juan","Nieto",2010, 179, 8.10);
		empleados.add(ecom1);
		
		EAsalariado asalariado2 = new EAsalariado();
		asalariado2.setDni("123654P");
		asalariado2.setNombre("Jesús");
		asalariado2.setApellidos("Sánchez");
		asalariado2.setAnyoIngreso(2012);
		asalariado2.setSalarioBase(1250);
		empleados.add(asalariado2);
		Ecomision ecom2 = new Ecomision();
		ecom2.setDni("7400455C");
		ecom2.setNombre("Anastasia");
		ecom2.setApellidos("Rodriguez");
		ecom2.setAnyoIngreso(2012);
		ecom2.setClientesCaptados(85);
		ecom2.setMontoPorCliente(7.90);
		empleados.add(ecom2);
		//probando
		mostrarTodos(empleados);
		sueldoMayor(empleados);
		System.out.println("******************************");
		mostrarTodos2(empleados);
	}
	
	public static void sueldoMayor(ArrayList<Empleado> empleados) {
		int emplMayor =0;
		double salarioMayor =0;
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).obtenerSalario() > salarioMayor) {
				emplMayor=i;
				salarioMayor = empleados.get(i).obtenerSalario();
			}
		}
		System.out.printf("\nEl empleado con mayor sueldo es: " + 
		empleados.get(emplMayor).getNombre()+" " 
		+ empleados.get(emplMayor).getApellidos()
				+ " Con un salario de %.2f\n", salarioMayor);
		System.out.println();
	}
	public static void mostrarTodos(ArrayList<Empleado> empleados) {
		for (int i = 0; i <empleados.size(); i++) {
			empleados.get(i).imprimir();
		}
	}
	public static void mostrarTodos2(ArrayList<Empleado> empleados) {
		for (Empleado empleado : empleados) {
			 empleado.imprimir();
		}
	}

}
