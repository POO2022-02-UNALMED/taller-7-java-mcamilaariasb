package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;
    
    
    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = enseñanza;
        this.interpretacion = interpretacion;
    }
    public String getEnseñanza() {
        return ensenanza;
    }
    public void setEnseñanza(String enseñanza) {
        this.ensenanza = enseñanza;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    @Override
    public int palabrasTotales(int palabrasPagina) {
        // TODO Auto-generated method stub
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
