package modelo;

import android.telecom.Connection;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by Christian David Cárdenas on 20/11/2016.
 */
public class Juego  {

    private String informacionUsuarios;
    private ArrayList<Usuario> usuarios;
    private Nivel[] niveles;

    public Juego() {

        usuarios = new ArrayList<Usuario>();
        niveles = new Nivel[3];
    }

    public void crearUsuario(String username, String password, String infoPefiles) {

        Usuario user = new Usuario(username,password,infoPefiles,null);
        usuarios.add(user);
    }

    public String getInformacionUsuarios() {
        return informacionUsuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Nivel[] getNiveles() {
        return niveles;
    }

    public void setInformacionUsuarios(String informacionUsuarios) {
        this.informacionUsuarios = informacionUsuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setNiveles(Nivel[] niveles) {
        this.niveles = niveles;
    }

}
