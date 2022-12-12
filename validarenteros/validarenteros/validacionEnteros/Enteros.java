package validacionEnteros;

public class Enteros {
    public static int pedirEntero(String cadena) throws Exception{
        int numero;
        try {
            numero = Integer.parseInt(cadena);
        }catch (NumberFormatException e){
            throw new Exception ("Caracteres incorrectos");
        }
        catch(Exception e){
            throw  new Exception("error desconocido");
        }
        return numero;
    }
    
    public static int pedirEntero2(String s) throws Exception {
        boolean correcto=true;
        int acumulador=0;
        int peso=1;
        //Integer. MIN_VALUE = -2147483648
        if (s.charAt(0)=='-' && s.length()==11 && (s.substring(1, 11)).compareTo("2147483648")>0){
                correcto = false;
        }
        if (s.charAt(0)=='-' && s.length()>11){
                correcto = false;
        }
        
        //Integer.MAX_VALUE = 2147483647
        if (s.length()==10 && s.compareTo("2147483647")>0){
            correcto = false;
        }
        if (s.length()>10 && s.charAt(0)!='-' ){
                correcto = false;
        }
        
        for(int i=s.length()-1;i>=0 && correcto;i--){
            char digito = s.charAt(i);
            if(digito>='0' && digito<='9'){
               // acumulador= acumulador +((int)(digito-48))*peso;
                acumulador= acumulador + Character.getNumericValue(digito) *peso;
                peso=peso*10;
            }
            else {//solo admitiremos un - en primera posicion
                if(i==0 && digito== '-') {acumulador=-acumulador; }//n�mero negativo
                else {
                    correcto = false;
                    break;
                }
            }
        }
        if (!correcto) throw  new Exception("Número incorrecto");
        return acumulador;
    }
    
}