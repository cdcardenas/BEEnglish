package modelo;

/**
 * Created by Christian David Cárdenas on 20/11/2016.
 */
public class Nivel {

    private final String COMPLETO  = "COMPLETO";
    private final String ENPROCESO = "EN PROGRESO";
    private final String INICIADO = "INICIADO";

    private int id;
    private String estado;
    private String keyword;
    private String descripcion;
    private  int logros;
    private int totalLogros;
    private long tiempo;

    public Nivel(String estado, int id, String keyword, String descripcion, int logros, int totalLogros, long tiempo) {
        this.estado = estado;
        this.id = id;
        this.keyword = keyword;
        this.descripcion = descripcion;
        this.logros = logros;
        this.totalLogros = totalLogros;
        this.tiempo = tiempo;
    }

    public String getCOMPLETO() {
        return COMPLETO;
    }

    public String getENPROCESO() {
        return ENPROCESO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getINICIADO() {
        return INICIADO;
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

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }


    public int CalcularResultado(){



        return 0;
    }
}
