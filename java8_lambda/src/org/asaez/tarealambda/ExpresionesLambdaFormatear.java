package org.asaez.tarealambda;
//expesión lambda que elimina espacios y pasa el string a mayúsculas
public class ExpresionesLambdaFormatear {

	public static void main(String[] args) {

		FormatearFrase format = frase -> {
			return frase.replace(".", "")
					.replace(",", "")
					.replace(" ", "")
					.toUpperCase();
		};

		String resultado = format.limpiarYformatear(
				"Juan Sánchez dimitió de su cargo, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París.");
		System.out.println(resultado);

	}

}
