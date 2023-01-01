package org.asaez.tarealambda;
//expesi�n lambda que elimina espacios y pasa el string a may�sculas
public class ExpresionesLambdaFormatear {

	public static void main(String[] args) {

		FormatearFrase format = frase -> {
			return frase.replace(".", "")
					.replace(",", "")
					.replace(" ", "")
					.toUpperCase();
		};

		String resultado = format.limpiarYformatear(
				"Juan S�nchez dimiti� de su cargo, pobre pintor portugu�s, pinta paisajes por poca plata, para pasear por Par�s.");
		System.out.println(resultado);

	}

}
