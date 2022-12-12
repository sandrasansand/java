package mapentidadesbancarias;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapEntidadesBancarias {

    public static void main(String[] args) {
        String key;
        TreeMap<String, String> tmEEEE = new TreeMap<String, String>();
        tmEEEE.put("2100", "Caixabank");
        tmEEEE.put("0081", "Banco Sabadell");
        tmEEEE.put("1465", "ING Bank");
        tmEEEE.put("2038", "Bankia");
        tmEEEE.put("0049", "Banco Santander");
        tmEEEE.put("2100", "Caixabank2"); //modifica el valor del anterior NO HAY REPETIDOS
//Códigos inventados        
        TreeMap<String, String> tmEEEESSSS = new TreeMap<String, String>();
        tmEEEESSSS.put("21004231", "Elche Urbana 1");
        tmEEEESSSS.put("21004232", "Elche Urbana 2");
        tmEEEESSSS.put("21004233", "Elche Urbana 3");
        tmEEEESSSS.put("21004234", "Elche Urbana 4");
        tmEEEESSSS.put("21004235", "Elche Urbana 5");
        tmEEEESSSS.put("00816781", "Elche Urbana 1");
        tmEEEESSSS.put("00816782", "Elche Urbana 3");
        tmEEEESSSS.put("00816783", "Elche Urbana 3");
        tmEEEESSSS.put("00816784", "Elche Urbana 4");
        tmEEEESSSS.put("14654561", "Elche Urbana 1");
        tmEEEESSSS.put("14654562", "Elche Urbana 2");
        tmEEEESSSS.put("00811152", "Elche Urbana 1");
        tmEEEESSSS.put("00811153", "Elche Urbana 2");
        tmEEEESSSS.put("00811152", "Elche Urbana 3");
        tmEEEESSSS.put("20384441", "Elche Urbana 1");
        tmEEEESSSS.put("00492221", "Elche Urbana 1");
        tmEEEESSSS.put("00492222", "Elche Urbana 2");
        tmEEEESSSS.put("00491111", "Elche Urbana 1");
// Listamos todas las entidades bancarias
/*        Iterator<String> it = tmEEEE.keySet().iterator();
        while(it.hasNext()){
          key = it.next();
          System.out.println("Clave: " + key + " Banco: " + tmEEEE.get(key));
        }*/
        for(String clave: tmEEEE.keySet()){
            System.out.println("Clave: " + clave + " Banco: " + tmEEEE.get(clave));
        }
//Introducimos un código de banco y nos dice su nombre        
        String EEEE;
        String banco="";
        EEEE = "2100";
        if (tmEEEE.containsKey(EEEE)){
            banco=tmEEEE.get(EEEE);
            System.out.println("banco: "+ banco);
        }else{
            System.out.println("Código inexistente");
        }
        System.out.println(tmEEEE.values());

//Listamos todas la sucursales bancarias
/*        it = tmEEEESSSS.keySet().iterator();
        while(it.hasNext()){
            key = it.next();
            EEEE = key.substring(0, 4);
            if (tmEEEE.containsKey(EEEE)){//comprobamos la existencia de banco
                banco=tmEEEE.get(EEEE);
            }else{
                System.out.println("Banco inexistente");
            }
            System.out.println("Banco: " + banco + "    Sucursal: " + tmEEEESSSS.get(key));
        }*/
        for(String clave: tmEEEESSSS.keySet()){
            EEEE = clave.substring(0, 4);//como tiene 4 digitos
            if (tmEEEE.containsKey(EEEE)){//comprobamos la existencia de banco
                banco=tmEEEE.get(EEEE);
            }else{
                System.out.println("Banco inexistente");
            }
            System.out.println("Banco: " + banco + "    Sucursal: " + tmEEEESSSS.get(clave));
        }
    }
}
