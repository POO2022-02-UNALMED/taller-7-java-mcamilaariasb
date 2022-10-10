package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
    private static ArrayList<String> letras=new ArrayList<String>();
    private String interpretacion;

    
    public Alfabeto(String origen, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
    }
    public static ArrayList<String> getLetras() {
        return letras;
    }
    public static void setLetras(ArrayList<String> letras) {
        Alfabeto.letras = letras;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int cantidadLetras(){
        return 0;
        
    }
    @Override
    public String interpretacion() {
        return interpretacion;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
