package comunicacion;

import java.util.ArrayList;

public class Tesis extends Escrito{
    private String idea;
    private static ArrayList<String> argumentos=new ArrayList<String>();
    private String conclusion;
    private String referencias;
    private String interpretacion;
    
    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion,
            String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }
    public String getIdea() {
        return idea;
    }
    public void setIdea(String idea) {
        this.idea = idea;
    }
    public static int getArgumentos() {
        return ((CharSequence) argumentos).length();
    }
    public static void setArgumentos(ArrayList<String> argumentos) {
        Tesis.argumentos = argumentos;
    }
    public String getConclusion() {
        return conclusion;
    }
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    public String getReferencias() {
        return referencias;
    }
    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return super.getPaginas()*palabrasPagina*5;
    }
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }
    @Override
    public String toString() {
        return this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.idea+"\n"+this.conclusion+"\n"+this.referencias;
    }

    
    
}
