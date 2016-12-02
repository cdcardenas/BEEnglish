package modelo;

import android.media.Image;

/**
 * Created by Christian David Cárdenas on 20/11/2016.
 */
public class Usuario {

    private String username;
    private String password;
    private String informacionPerfiles;
    private Perfil[] perfiles;

    public Usuario(String username, String password, String informacionPerfiles, Perfil[] perfiles) {
        this.username = username;
        this.password=password;
        this.informacionPerfiles = informacionPerfiles;
        if(perfiles == null) {
            this.perfiles = new Perfil[4];
        } else {
            this.perfiles = perfiles;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInformacionPerfiles() {
        return informacionPerfiles;
    }

    public void setInformacionPerfiles(String informacionPerfiles) {
        this.informacionPerfiles = informacionPerfiles;
    }

    public Perfil[] getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(Perfil[] perfiles) {
        this.perfiles = perfiles;
    }

    public void crearPerfil(String name, Image avatar, int edad, String informacionPerfil){


    }

}

