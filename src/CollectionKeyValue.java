import enums.TiposDeGuiaTiss;

import java.util.HashMap;
import java.util.Map;

public class CollectionKeyValue {
    public static void main(String[] args) {
        //Tendo o Hash não conseguimos garantira ordem dos elementos.
        Map<String, Object> objectMap = new HashMap<>();

        //TODO O Map não permite chave duplicada , o comportamento no teste abaixo será impreço o segundo elemento que contem a Key=="C" === Casa
        objectMap.put("C", "Churrasco");
        objectMap.put("T", "Teclado");
        objectMap.put("C", "Casa");

        for (String obj : objectMap.keySet()) {

            if (obj.contains("C")) {
                System.out.printf("Valor localizado : result == [ %s ] \n\n", objectMap.get(obj));
            }
        }

        for (Object obj : objectMap.entrySet()) {
            System.out.println(obj);
        }

        for (Map.Entry<String, Object> objTwo : objectMap.entrySet()) {
            var key = objTwo.getKey();
            var value = objTwo.getValue();

            System.out.printf("Chave : [ %s ] Valor: [ %s] \n", key, value);
        }

        System.out.print(TiposDeGuiaTiss.GC.getValue());
    }
}
