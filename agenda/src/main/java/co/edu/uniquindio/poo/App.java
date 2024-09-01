package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan Perez", "Juan", "Calle Falsa 123", "555-1234", "juan.perez@gmail.com");
        Contacto contacto2 = new Contacto("Maria Lopez", "Maria", "Avenida Siempre Viva 456", "555-5678", "maria.lopez@gmail.com");
        Contacto contacto3 = new Contacto("Carlos Ruiz", "Carlos", "Calle Real 789", "555-9012", "carlos.ruiz@gmail.com");

        // Crear grupos
        Grupo grupoOficina = new Grupo("Grupo Oficina", Categoria.OFICINA);
        grupoOficina.agregarContacto(contacto1);
        grupoOficina.agregarContacto(contacto2);

        Grupo grupoAmigos = new Grupo("Grupo Amigos", Categoria.AMIGOS);
        grupoAmigos.agregarContacto(contacto1);
        grupoAmigos.agregarContacto(contacto3);

        // Crear reuniones
        Reunion reunionTrabajo = new Reunion("Reunión de Trabajo", "2024-09-05", "10:00 AM");
        reunionTrabajo.agregarAsistente(contacto1);
        reunionTrabajo.agregarAsistente(contacto2);

        Reunion reunionAmigos = new Reunion("Reunión con Amigos", "2024-09-10", "7:00 PM");
        reunionAmigos.agregarAsistente(contacto1);
        reunionAmigos.agregarAsistente(contacto3);

        // Crear una colección de contactos, grupos y reuniones
        Collection<Contacto> listaContactos = new LinkedList<>();
        listaContactos.add(contacto1);
        listaContactos.add(contacto2);
        listaContactos.add(contacto3);

        Collection<Grupo> listaGrupos = new LinkedList<>();
        listaGrupos.add(grupoOficina);
        listaGrupos.add(grupoAmigos);

        Collection<Reunion> listaReuniones = new LinkedList<>();
        listaReuniones.add(reunionTrabajo);
        listaReuniones.add(reunionAmigos);

        // Crear la agenda
        Agenda miAgenda = new Agenda("Mi Agenda Personal", listaContactos, listaGrupos, listaReuniones);

        // Mostrar algunos ejemplos de uso
        System.out.println("Agenda: " + miAgenda.getNombre());
        System.out.println("Contactos:");
        for (Contacto contacto : miAgenda.getContactos()) {
            System.out.println("- " + contacto.getNombre() + " (" + contacto.getTelefono() + ")");
        }

        System.out.println("\nGrupos:");
        for (Grupo grupo : miAgenda.getGrupos()) {
            System.out.println("- " + grupo.getNombre() + " (" + grupo.getCategoria() + ")");
        }

        System.out.println("\nReuniones:");
        for (Reunion reunion : miAgenda.getReuniones()) {
            System.out.println("- " + reunion.getDescripcion() + " el " + reunion.getFecha() + " a las " + reunion.getHora());
        }

        // Buscar un contacto en la agenda
        System.out.println("\nBuscando contacto 'Carlos Ruiz' con teléfono '555-9012':");
        miAgenda.buscarContacto("Carlos Ruiz", "555-9012");

        // Eliminar un contacto
        System.out.println("\nEliminando contacto 'Maria Lopez' con teléfono '555-5678':");
        miAgenda.eliminarContacto("Maria Lopez", "555-5678");

        // Mostrar la lista de contactos después de la eliminación
        System.out.println("\nContactos después de la eliminación:");
        for (Contacto contacto : miAgenda.getContactos()) {
            System.out.println("- " + contacto.getNombre() + " (" + contacto.getTelefono() + ")");
        }
    }
}

