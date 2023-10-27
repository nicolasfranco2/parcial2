
package logicaNegocios;

import AccesoDatos.Persona;
import AccesoDatos.PersonaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class PersonaService {
    private PersonaDAO personaDAO;

    public PersonaService(Connection conexion) {
        personaDAO = new PersonaDAO(conexion);
    }

    public PersonaService() {
Connection conexion = null;    }

    public boolean agregarPersona(Persona persona) throws SQLException {
        // Asegúrate de que personaDAO no sea nulo
        if (personaDAO != null) {
            return personaDAO.agregarPersona(persona);
        } else {
            // Manejo de error o lanzamiento de excepción si personaDAO es nulo
            throw new RuntimeException("PersonaDAO no se ha inicializado correctamente.");
        }
    }

    // Resto de tus métodos
}
 