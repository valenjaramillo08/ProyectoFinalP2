package co.edu.uniquindio.proyecto.proyecto.services;

import co.edu.uniquindio.proyecto.proyecto.model.Usuario;

public interface IUsuarioServices {
    boolean agregarUsuario(String nombre,
                           String apellido,
                           String correo,
                           String telefono,
                           String idUsuario,
                           String direccion);

    Usuario obtenerUsuario(String idUsuario);

    boolean eliminarUsuario(String idUsuario);

    boolean actualizarUsuario(String nombre,
                              String apellido,
                              String correo,
                              String telefono,
                              String idUsuarioActual,
                              String idUsuario,
                              String direccion);
}
