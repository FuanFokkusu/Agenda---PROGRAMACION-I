package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {

    private String nombre;
    private Categoria categoria;
    private int limiteContactos;
    public Collection<Contacto> contactos;
    ;

    public Grupo(String nombre, int limiteContactos, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.limiteContactos = limiteContactos;
        contactos = new LinkedList<>();

    }

    public boolean agregarContacto(Contacto contacto) {
        if (contactos.size() >= limiteContactos) {
            System.out.println("No se puede agregar más contactos. El límite es " + limiteContactos);
            return false;
        }
        contactos.add(contacto);
        return true;
    }

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
        if (compararContactos(contacto.getNombre(), contacto.getTelefono())) {
            
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


    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getLimiteContactos() {
        return limiteContactos;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

}
