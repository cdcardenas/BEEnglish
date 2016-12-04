package modelo;

/**
 * Created by Christian David Cárdenas on 20/11/2016.
 */
public class Nivel {

    public final static String COMPLETO  = "COMPLETO";
    public final static String ENPROGRESO = "EN PROGRESO";
    public final static String INICIADO = "INICIADO";

    private int id;
    private String estado;
    private String keyword;
    private String descripcion;
    private  int logros;
    private int totalLogros;
    private long time;

    public Nivel(String estado, int id, String keyword, String descripcion, int logros, int totalLogros, long tiempo) {
        this.estado = estado;
        this.id = id;
        this.keyword = keyword;
        this.descripcion = descripcion;
        this.logros = logros;
        this.totalLogros = totalLogros;
        this.time = tiempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLogros() {
        return logros;
    }

    public void setLogros(int logros) {
        this.logros = logros;
    }

    public int getTotalLogros() {
        return totalLogros;
    }

    public void setTotalLogros(int totalLogros) {
        this.totalLogros = totalLogros;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long tiempo) {
        this.time = tiempo;
    }

    public int calcularEstrellas(){

        int estrellas = (int)(logros*3/totalLogros);
        return estrellas;
    }
}
