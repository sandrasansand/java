package profesores01;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Profesor implements Comparable<Profesor> {
	private static String curso;
	private static double pagoPorHoraExtra;
	private String dni;
	private String nombre;
	private double sueldoBase;
	private int[] horasExtra = new int[12];
	private double tipoIrpf;
	private ArrayList<Profesor> profesores;// lista dinámica

	public Profesor() {
		horasExtra = new int[12];
	}

	public Profesor(String nombre, String dni, double sueldoBase, double tipoIrpf) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sueldoBase = sueldoBase;
		horasExtra = new int[12];
		this.tipoIrpf = tipoIrpf;
		this.profesores = new ArrayList<Profesor>();// lista vacia
	}

	public boolean add(Profesor arg0) {
		return profesores.add(arg0);
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public static String getCurso() {
		return curso;
	}

	public static void setCurso(String curso) {
		Profesor.curso = curso;
	}

	public static double getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
		Profesor.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

//hay q modificar get/set horasExtra y pasarle el mes
	public int getHorasExtra(int mes) {
		return horasExtra[mes];
	}

	public void setHorasExtra(int mes, int horas) {
		this.horasExtra[mes] = horas;
	}

	public double getTipoIrpf() {
		return tipoIrpf;
	}

	public void setTipoIrpf(double tipoIrpf) {
		this.tipoIrpf = tipoIrpf;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", dni=" + dni + ", sueldoBase=" + sueldoBase + ", horasExtra="
				+ Arrays.toString(horasExtra) + ", tipoIrpf=" + tipoIrpf + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + Arrays.hashCode(horasExtra);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sueldoBase);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tipoIrpf);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (!Arrays.equals(horasExtra, other.horasExtra))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(sueldoBase) != Double.doubleToLongBits(other.sueldoBase))
			return false;
		if (Double.doubleToLongBits(tipoIrpf) != Double.doubleToLongBits(other.tipoIrpf))
			return false;
		return true;
	}

	// métodos
	public double calcularImporteHorasExtra(int mes) {
		return pagoPorHoraExtra * horasExtra[mes];
	}

	public double calcularSueldoBruto(int mes) {
		return sueldoBase + calcularImporteHorasExtra(mes);

	}

	public double calcularRetencionIrpf(int mes) {
		return calcularSueldoBruto(mes) * tipoIrpf / 100;
	}

	public double calcularSueldo(int mes) {
		return calcularSueldoBruto(mes) - calcularRetencionIrpf(mes);
	}

	public String imprimeProfesor2(Profesor p) {
		return "\nNombre : " + p.getNombre() + "\nDni : " + p.getDni() + "\nSueldoBase : " + p.getSueldoBase()
				+ "\nTipoIrpf" + p.getTipoIrpf();
	}

	public String ImprimeProfesor() {
		String resultado = "";
		resultado = "\nNombre: " + nombre + "\nDNI: " + dni + "\nSueldo Base: " + sueldoBase + "\ntipo IRPF: "
				+ tipoIrpf + "\n";
		return resultado;
	}

//metodo q permite introducir los datos por teclado
	public void leerProfesores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre Profesor: ");
		this.nombre = sc.nextLine();
		System.out.println("Dni :");
		this.dni = sc.nextLine();
		System.out.println("Sueldo Base: ");
		this.sueldoBase = sc.nextDouble();
		System.out.println("Tipo de Irpf: ");
		this.tipoIrpf = sc.nextDouble();
		horasExtra = new int[12]; // inicialmente vacio
	}

public String imprimirNominas(int mes) {
	  String resultado;
      String nombreMes[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
          "Julio", "Agosto","Septiembre", "Octubre", "Noviembre", "Diciembre"};
      resultado = "\nNombre: " + nombre +
                  "\nDNI: " + dni +
                  "\nCurso: " + curso + "  Nómina mes: " + nombreMes[mes]+
                  "\nSueldo Base: " + sueldoBase +
                  "\nHoras Extras: " + horasExtra[mes]+
                  "\ntipo IRPF: " +  tipoIrpf +
                  "\nSueldo Bruto: "+ calcularSueldoBruto(mes) +
                  "\nRetención por IRPF: "+ calcularRetencionIrpf(mes)+ 
                  "\nSueldo Neto: "+ calcularSueldo(mes)+"\n";
      return  resultado;
	
}
/*
 * @Override public int compareTo(Profesor o) { if (dni.compareTo(o.dni) < 0)
 * {// mayor alfabetico//menor alfabetico return -1;// devuelve -1 si el valor
 * comparado del objeto activo(this) es menor al del recibido
 * 
 * } if (dni.compareTo(o.dni) > 0) { return 1;//mayor } else { return 0;// son
 * iguales } }
 */
	
	@Override
	public int compareTo(Profesor o) {
		if (nombre.compareTo(o.nombre) < 0) {// mayor alfabetico//menor alfabetico
			return -1;// devuelve -1 si el valor comparado del objeto activo(this) es menor al del recibido

		}
		if (nombre.compareTo(o.nombre) > 0) {
			return 1;//mayor 
		} else {
			return 0;// son iguales
		}
	}

	public char charAt(int index) {
		return nombre.charAt(index);
	}

	public IntStream chars() {
		return nombre.chars();
	}

	public int codePointAt(int index) {
		return nombre.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return nombre.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return nombre.codePointCount(beginIndex, endIndex);
	}

	public IntStream codePoints() {
		return nombre.codePoints();
	}

	public int compareTo(String anotherString) {
		return nombre.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return nombre.compareToIgnoreCase(str);
	}

	public String concat(String str) {
		return nombre.concat(str);
	}

	public boolean contains(CharSequence s) {
		return nombre.contains(s);
	}

	public boolean contentEquals(CharSequence cs) {
		return nombre.contentEquals(cs);
	}

	public boolean contentEquals(StringBuffer sb) {
		return nombre.contentEquals(sb);
	}

	public boolean endsWith(String suffix) {
		return nombre.endsWith(suffix);
	}

	public boolean equalsIgnoreCase(String anotherString) {
		return nombre.equalsIgnoreCase(anotherString);
	}

	public byte[] getBytes() {
		return nombre.getBytes();
	}

	public byte[] getBytes(Charset charset) {
		return nombre.getBytes(charset);
	}

	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		nombre.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
		return nombre.getBytes(charsetName);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		nombre.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	public int indexOf(int ch, int fromIndex) {
		return nombre.indexOf(ch, fromIndex);
	}

	public int indexOf(int ch) {
		return nombre.indexOf(ch);
	}

	public int indexOf(String str, int fromIndex) {
		return nombre.indexOf(str, fromIndex);
	}

	public int indexOf(String str) {
		return nombre.indexOf(str);
	}

	public String intern() {
		return nombre.intern();
	}

	public boolean isEmpty() {
		return nombre.isEmpty();
	}

	public int lastIndexOf(int ch, int fromIndex) {
		return nombre.lastIndexOf(ch, fromIndex);
	}

	public int lastIndexOf(int ch) {
		return nombre.lastIndexOf(ch);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return nombre.lastIndexOf(str, fromIndex);
	}

	public int lastIndexOf(String str) {
		return nombre.lastIndexOf(str);
	}

	public int length() {
		return nombre.length();
	}

	public boolean matches(String regex) {
		return nombre.matches(regex);
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return nombre.offsetByCodePoints(index, codePointOffset);
	}

	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return nombre.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return nombre.regionMatches(toffset, other, ooffset, len);
	}

	public String replace(char oldChar, char newChar) {
		return nombre.replace(oldChar, newChar);
	}

	public String replace(CharSequence target, CharSequence replacement) {
		return nombre.replace(target, replacement);
	}

	public String replaceAll(String regex, String replacement) {
		return nombre.replaceAll(regex, replacement);
	}

	public String replaceFirst(String regex, String replacement) {
		return nombre.replaceFirst(regex, replacement);
	}

	public String[] split(String regex, int limit) {
		return nombre.split(regex, limit);
	}

	public String[] split(String regex) {
		return nombre.split(regex);
	}

	public boolean startsWith(String prefix, int toffset) {
		return nombre.startsWith(prefix, toffset);
	}

	public boolean startsWith(String prefix) {
		return nombre.startsWith(prefix);
	}

	public CharSequence subSequence(int beginIndex, int endIndex) {
		return nombre.subSequence(beginIndex, endIndex);
	}

	public String substring(int beginIndex, int endIndex) {
		return nombre.substring(beginIndex, endIndex);
	}

	public String substring(int beginIndex) {
		return nombre.substring(beginIndex);
	}

	public char[] toCharArray() {
		return nombre.toCharArray();
	}

	public String toLowerCase() {
		return nombre.toLowerCase();
	}

	public String toLowerCase(Locale locale) {
		return nombre.toLowerCase(locale);
	}

	public String toUpperCase() {
		return nombre.toUpperCase();
	}

	public String toUpperCase(Locale locale) {
		return nombre.toUpperCase(locale);
	}

	public String trim() {
		return nombre.trim();
	}

}
