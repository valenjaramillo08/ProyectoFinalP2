package co.edu.uniquindio.proyecto.proyecto.model;

import co.edu.uniquindio.proyecto.proyecto.services.IUsuarioServices;

public class Administrador extends Persona implements IUsuarioServices {
    public String idAdministrador;

    public Administrador() {
    }

    public Administrador (String nombre,
                          String apellido,
                          String correo,
                          String idAdministrador){
        super(nombre,apellido,correo);
        this.idAdministrador = idAdministrador;

    }

    @Override
    public boolean agregarUsuario(String nombre, String apellido, String correo, String telefono, String idUsuario, String direccion) {
        return false;
    }

    @Override
    public Usuario obtenerUsuario(String idUsuario) {
        return null;
    }

    @Override
    public boolean eliminarUsuario(String idUsuario) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(String nombre, String apellido, String correo, String telefono, String idUsuarioActual, String idUsuario, String direccion) {
        return false;
    }
}
