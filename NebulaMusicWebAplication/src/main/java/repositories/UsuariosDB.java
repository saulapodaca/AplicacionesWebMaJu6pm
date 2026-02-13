package repositories;

//@author SAUL ISAAC APODACA BALDENEGRO 00000252020

import java.util.HashMap;
import java.util.Map;
import models.Usuario;


public class UsuariosDB {
    private static Map<String, Usuario> usuarios = new HashMap<>();
    
    public static void registrar(Usuario usuario){
        usuarios.put(usuario.getCorreo(), usuario);
    }
    
    public static boolean autenticar(String correo, String contrasena){
        if(!usuarios.containsKey(correo)){
            return false;
        }
        
        return usuarios.get(correo).getContrasena().equals(contrasena);
    }
    
    public static boolean existeCorreo(String correo){
        return usuarios.containsKey(correo);
    }
}
