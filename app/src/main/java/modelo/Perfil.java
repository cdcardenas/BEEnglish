package modelo;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by Christian David Cárdenas on 20/11/2016.
 */
public class Perfil {

    private String name;
    private String informacionPerfil;
    private int edad;
    private Image avatar;
    private Nivel[] progreso;

    public Perfil(String name, String edad, Image avatar, String info, Nivel[] progreso) {
        this.name = name;
        this.edad = Integer.parseInt(edad);
        this.avatar = avatar;
        informacionPerfil = info;
        if(progreso == null) {
            this.progreso = new Nivel[3];
        } else {
            this.progreso = progreso;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformacionPerfil() {
        return informacionPerfil;
    }

    public void setInformacionPerfil(String informacionPerfil) {
        this.informacionPerfil = informacionPerfil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public Nivel[] getProgreso() {
        return progreso;
    }

    public void setProgreso(Nivel[] progreso) {
        this.progreso = progreso;
    }

    public int calcularPuntaje(){

        int puntaje = 0;
        for(int i=0;i<3;i++)
        {
            if(progreso[i]!=null)
            {
                puntaje = puntaje + progreso[i].getLogros();
            }
        }
        return puntaje;
    }

    public void desbloquearNivel(Nivel nivel){

        for(int i=0;i<3;i++)
        {
            if(progreso[i]==null && nivel.getId()==(i+1))
            {
                nivel.setEstado(Nivel.INICIADO);
                progreso[i] = nivel;
            }
        }

    }

    public void jugarNivel(int nivel){

        progreso[nivel-1].setEstado(Nivel.ENPROGRESO);
    }
}
