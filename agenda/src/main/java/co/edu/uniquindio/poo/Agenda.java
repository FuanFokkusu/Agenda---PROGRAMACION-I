package co.edu.uniquindio.poo;

import java.util.Collection;


public class Agenda {

    public String nombre;
    public Collection<Contacto> contactos;
    public Collection<Grupo> grupos;
    public Collection<Reunion> reuniones;


    /**
     * Constructor de la clase Agenda
     * @param nombre
     * @param contactos
     * @param grupos
     * @param reuniones
     */
    public Agenda(String nombre, Collection<Contacto> contactos, Collection<Grupo> grupos, Collection<Reunion> reuniones) {
        this.nombre = nombre;
        this.contactos = contactos;
        this.grupos = grupos;
        this.reuniones = reuniones;
    }

    /**
     * getters y setter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Collection<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Collection<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Collection<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(Collection<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    /**
     * metodo que compara los contactos en la lista de contactos con el nombre y telefono proporcionados
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

    /**
     * metodo que añade un contacto a la lista de contactos
     * @param contacto
     */
    public void añadirContacto(Contacto contacto) {
        if (!compararContactos(contacto.getNombre(), contacto.getTelefono())) {
            return;
        }
        contactos.add(contacto);
    }

    /**
     * metodo que elimina un contacto de la lista de contactos
     * @param nombre
     * @param telefono
     */
    public void eliminarContacto(String nombre, String telefono) {
        for (Contacto contacto : contactos) {
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    /**
     * metodo que busca un contacto por nombre y telefono
     * @param nombre
     * @param telefono
     */
    public void buscarContacto (String nombre, String telefono){
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                System.out.println("Contacto encontrado : " + contacto);
                return ;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    /**
     * compara los grupos en la lista de grupos
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

    /**
     * metodo que añade un nuevo grupo a la lista de grupos
     * @param grupo
     */
    public void añadirGrupo(Grupo grupo) {
        if (!compararGrupos(grupo.getNombre())) {
            return;
        }
        grupos.add(grupo);
    }

    /**
     * metodo que elimina un grupo de la lista de grupos
     * @param nombre
     */
    public void eliminarGrupos(String nombre) {
        for (Grupo grupo : grupos) {
            if(grupo.getNombre().equals(nombre)) {
                contactos.remove(grupo);
                break;
            }
        }
    }

    /**
     * metodo que añade una reunion a la lista de reuniones
     * @param nuevaReunion
     */
    public void añadirReunion(Reunion nuevaReunion) {
        for (Reunion reunion : reuniones) {
            if (reunion.getDescripcion().equals(nuevaReunion.getDescripcion()) &&
                    reunion.getFecha().equals(nuevaReunion.getFecha()) &&
                    reunion.getHora().equals(nuevaReunion.getHora())) {
                System.out.println("Reunión ya existente.");
                return;
            }
        }
        reuniones.add(nuevaReunion);
    }

    /**
     * metodo que eliminar una reunion
     * @param descripcion
     */
    public void eliminarReunion(String descripcion){
        for (Reunion reunion : reuniones){
            if(reunion.getDescripcion().equals(descripcion)){
                reuniones.remove(reunion);
                break;
            }
        }
    }
}
