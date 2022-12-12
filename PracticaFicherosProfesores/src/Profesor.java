import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Profesor implements Serializable {
	private static String curso;
	private static double pagoPorHoraExtra; // atr clase
	private String dni;
	private String nombre;
	private double sueldoBase;
	private int[] horasExtras = new int[12];
	private double tipoIRPF;

	// constructor por defecto
	public Profesor() {

	}

	public Profesor(String dni, String nombre, double suledoBase, int[] horasExtras, double tipoIRPF) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = suledoBase;
		this.horasExtras = horasExtras;
		this.tipoIRPF = tipoIRPF;
	}

	// métods get/set
	public static String getCurso() {
		return curso;
	}

	public static void setCurso(String curso) {
		Profesor.curso = curso;
	}

	// atrib static de la clase
	public static double getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
		Profesor.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSuledoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double suledoBase) {
		this.sueldoBase = suledoBase;
	}

	public int getHorasExtras(int mes) {// le pasamos el mes
		return horasExtras[mes];
	}

	public void setHorasExtras(int mes, int horas) {// mes y horas por param
		this.horasExtras[mes] = horas;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

//metodos
	// calcular el importe de las horas extras de un mes
	public double calcularImporteHorasExtras(int i) {
		return horasExtras[i] * pagoPorHoraExtra;
	}

	// calcular el sueldo bruto
	public double calcularSueldoBruto(int i) {
		return sueldoBase + calcularImporteHorasExtras(i);
	}

	// retencion irpf
	public double calcularRetencionIrpf(int i) {
		return calcularSueldoBruto(i) * tipoIRPF / 100;
	}

	// sueldo
	public double calcularSueldo(int i) {
		return calcularSueldoBruto(i) - calcularRetencionIrpf(i);
	}

	// metodo que pide por teclado los datos de 1 nuevo prof
	public void nuevoProfesor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre Profesor: ");
		nombre = sc.nextLine();
		System.out.println("Dni: ");
		dni = sc.nextLine();
		System.out.println("Sueldo base: ");
		sueldoBase = sc.nextDouble();
		System.out.println("Tipo de Irpf: ");
		tipoIRPF = sc.nextDouble();
		this.horasExtras = new int[12];
		for (int i = 0; i < 12; i++) {
			this.horasExtras[i] = 0;
		}
	}

	// metodo para mostrar por pantalla los datos de un profesor
	public String imprimeProfesor() {
		String resultado = "";
		resultado = resultado + ("Nombre: " + nombre);
		resultado = resultado + ("\nDni: " + dni);
		resultado = resultado + ("\nSueldoBase: " + sueldoBase);
		resultado = resultado + ("\nTipo Irpf: " + tipoIRPF);

		return resultado;
	}

	// mostrar la nómina de un profesor en 1 mes
	public String imprimirNominas(int mes) {
		String resultado = "";
		String nombreMes[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: " + nombre);
		sb.append("Dni: " + dni);
		sb.append("Curso: " + curso);
		sb.append("Nómina mes: " + nombreMes[mes]);
		sb.append("SueldoBase: " + sueldoBase);
		sb.append("Horas Extras: " + getHorasExtras(mes));
		sb.append("Tipo Irpf: " + tipoIRPF);
		sb.append("Sueldo Bruto: " + calcularSueldoBruto(mes));
		sb.append("Reteción por IRPF: " + calcularRetencionIrpf(mes));
		sb.append("Sueldo Neto: " + calcularSueldo(mes));
		resultado = sb.toString();

		return resultado;
	}


}
