package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Reunion {

    private String descripcion;
    private String fecha;
    private String hora;
    private Collection<Contacto> asistentes;

    /**
     * constructor de la clase Reunion
     * @param descripcion
     * @param fecha
     * @param hora
     */
    public Reunion(String descripcion, String fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new LinkedList<>();

    }

    /**
     * metodo que verifica si un contacto ya esta registrado como asistente en la lista de asistentes
     * @param nuevoAsistente
     * @return
     */
    public boolean verificarAsistenteExistente(Contacto nuevoAsistente) {
        for (Contacto asistente : asistentes) {
            if (asistente.getAlias().equals(nuevoAsistente.getAlias()) &&
                    asistente.getTelefono().equals(nuevoAsistente.getTelefono())) {
                return true; // El contacto ya existe
            }
        }
        return false; // El contacto no existe
    }

    /**
     * metodo que agrega un nuevo asistente a la lista de asistentes de la reunion si no esta ya registrado
     * @param nuevoAsistente
     */
    public void agregarAsistente(Contacto nuevoAsistente) {
        if (!verificarAsistenteExistente(nuevoAsistente)) {
            asistentes.add(nuevoAsistente);
            System.out.println("Contacto agregado a la reunión.");
        } else {
            System.out.println("El contacto ya está agregado a la reunión.");
        }
    }

    /**
     * getters y setters
     */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Collection<Contacto> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Collection<Contacto> asistentes) {
        this.asistentes = asistentes;
    }

    
}   
