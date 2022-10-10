package comunicacion;

public class Fabula extends Escrito {
    private String interpretacion;
    private String ensenanza;
    
    public Fabula(String origen, String titulo, String autor, int paginas, String interpretacion, String ensenanza) {
        super(origen, titulo, autor, paginas);
        this.interpretacion = interpretacion;
        this.ensenanza = ensenanza;
    }
    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return super.getPaginas()*palabrasPagina*1;
    }
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }
    @Override
    public String toString() {
        return this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.ensenanza;
    }
}
