package profesores01;

public class ValidaDni {

	public static boolean ValidaDni(String cadena) throws Exception {
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		String letraDni = cadena.substring(cadena.length() - 1);
		String numeroDni = cadena.substring(0, cadena.length() - 1);
		try {
			int numero = Integer.parseInt(numeroDni);
			int resto = numero % 23;
			String letraObtenida = letrasDni.substring(resto, resto + 1);
			String letraMinuscula = letraObtenida.toLowerCase();
			if (letraDni.compareTo(letraObtenida) == 0 || letraDni.compareTo(letraMinuscula) == 0) {
				return true;
			} else {
				throw new Exception("Letra Incorrecta");
			}

		} catch (NumberFormatException e) {
			throw new Exception("Carácteres incorrectos");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
