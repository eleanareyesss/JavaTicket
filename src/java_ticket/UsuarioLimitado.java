
package java_ticket;

public final class UsuarioLimitado extends Usuario
{

    public UsuarioLimitado(String nombreCompleto, String username, String password, int edad) {
        super(nombreCompleto, username, password, edad);
    }

    @Override
    public String toString() {
        return "UsuarioLimitado{" +super.toString()+ '}';
    }

   
    
}
