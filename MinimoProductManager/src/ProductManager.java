import java.util.HashMap;
import java.util.List;

public interface ProductManager {
    HashMap<String,Usuarios> listadoProductosUsuarios();

    boolean añadirUsuario(Usuarios user);

    boolean modificarUsuario(String nombre,HashMap<String,Integer> parametros);

    Usuarios informacionUsuario(String nombre);

    List<Objeto> objetosUsuario(String nombre);

    boolean añadirObjecto(String nombre,Objeto objeto);
}
