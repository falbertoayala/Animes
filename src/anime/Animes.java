/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.Date;

/**
 *
 * @author Alumnos
 */
public class Animes extends Estudio {
    
    private String nombreAnimes;
    private String horario;

    public Animes(String nombreAnimes, String  horario, String Nombre) {
        super(Nombre);
        this.nombreAnimes = nombreAnimes;
        this.horario = horario;
    }

    public String getNombreAnimes() {
        return nombreAnimes;
    }

    public void setNombreAnimes(String nombreAnimes) {
        this.nombreAnimes = nombreAnimes;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
