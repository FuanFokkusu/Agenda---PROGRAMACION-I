package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {

    private String nombre;
    private Categoria categoria;
    public Collection<Contacto> contactos;

    /**
     * constructor de la clase Grupo
     * @param nombre
     * @param categoria
     */
    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        contactos = new LinkedList<>();

    }

    /**
     * metodo que añade un contacto al grupo si el grupo tiene menos de 5 contactos
     * @param contacto
     * @return
     */
    public boolean agregarContacto(Contacto contacto) {
        if (contactos.size() >= 5) {
            System.out.println("No se puede agregar más contactos. El grupo ya tiene 5 contactos");
            return false;
        }
        contactos.add(contacto);
        return true;
    }

    /**
     * metodo que comprara los contactos en la lista de contactos
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
     * metodo que añade un contacto a la lista de contacto si no existe
     * @param contacto
     */
    public void añadirContacto(Contacto contacto) {
        if (compararContactos(contacto.getNombre(), contacto.getTelefono())) {

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
     * getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

}
