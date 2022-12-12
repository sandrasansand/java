import java.util.Calendar;

public class EAsalariado extends Empleado {
	private double salarioBase;

	public EAsalariado() {
		super();
		salarioBase = 0.0;
	}

	public EAsalariado(String dni, String nombre, String apellidos, int anyoIngreso, double salarioBase) {
		super(dni, nombre, apellidos, anyoIngreso);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double obtenerSalario() {
		Calendar now = Calendar.getInstance();
		int anyoActual = now.get(Calendar.YEAR);
		int anyos = anyoActual - getAnyoIngreso();// años que lleva en la empresa
		if (anyos < 0) {
			System.out.println("Numero de años negativo");
		}
		if (anyos < 2) {
			return salarioBase;
		} else if (anyos >= 2 && anyos <= 3) {
			return salarioBase * 0.05 + salarioBase;
		} else if (anyos >= 4 && anyos <= 7) {
			return salarioBase * 0.10 + salarioBase;
		} else if (anyos >= 8 && anyos <= 15) {
			return salarioBase * 0.15 + salarioBase;
		} else {
			return salarioBase * 0.20;
		}

	}

	public void imprimir() {
		super.imprimir();
		System.out.printf("Salario: %.2f\n", obtenerSalario());
		System.out.println();
	}

}
