
public class Ecomision extends Empleado {

	private int clientesCaptados;
	private double montoPorCliente;
	private static final double salarioMinimo = 780;

	public Ecomision() {
		super();
		clientesCaptados = 0;
		montoPorCliente = 0;
	}

	public Ecomision(String dni, String nombre, String apellidos, int anyoIngreso, int clientesCaptados,
			double montoPorCliente) {
		super(dni, nombre, apellidos, anyoIngreso);
		this.clientesCaptados = clientesCaptados;
		this.montoPorCliente = montoPorCliente;
	}

	public int getClientesCaptados() {
		return clientesCaptados;
	}

	public void setClientesCaptados(int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}

	public double getMontoPorCliente() {
		return montoPorCliente;
	}

	public void setMontoPorCliente(double montoPorCliente) {
		this.montoPorCliente = montoPorCliente;
	}

	public static double getSalariominimo() {
		return salarioMinimo;
	}

	public void imprimir() {
		super.imprimir();
		System.out.printf("Salario:%.2f\n", obtenerSalario());
	}

	@Override
	public double obtenerSalario() {
		if (montoPorCliente * clientesCaptados > salarioMinimo) {
			return montoPorCliente * clientesCaptados;
		} else {
			return salarioMinimo;
		}

	}

}
