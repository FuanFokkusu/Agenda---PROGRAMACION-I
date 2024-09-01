package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Agenda {

    public String nombre;
    public Collection<Contacto> contactos;
    public Collection<Grupo> grupos;



    public Agenda(String nombre, Collection<Contacto> contactos) {
        this.nombre = nombre;
        contactos = new LinkedList<>();
        grupos = new LinkedList<>();

    }

    /** la agregacion, eliminacion y comparacion
     *
     * @param nombre
     * @param telefono
     * @return
     */

    public boolean compararContactos(String nombre, String telefono) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void añadirContacto(Contacto contacto) {
        if (!compararContactos(contacto.getNombre(), contacto.getTelefono())) {
            return;
        }
        contactos.add(contacto);
    }

    public void eliminarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    /** compara grupos, añadir y eliminar
     *
     * @param nombre
     * @return
     */

    public boolean compararGrupos(String nombre) {
        boolean centinela = false;
        for (Grupo grupo : grupos) {
            if(grupo.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void añadirGrupo(Grupo grupo) {
        if (!compararGrupos(grupo.getNombre())) {
            return;
        }
        grupos.add(grupo);
    }

    public void eliminarGrupos(String nombre) {
        for (Grupo grupo : grupos) {
            if(grupo.getNombre().equals(nombre)) {
                contactos.remove(grupo);
                break;
            }
        }
    }
}
