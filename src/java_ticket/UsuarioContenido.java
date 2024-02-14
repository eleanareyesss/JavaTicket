
package java_ticket;

import java.util.ArrayList;

public class UsuarioContenido extends Usuario
{
    private ArrayList<Evento>eventosCreados;

    public UsuarioContenido(String nombreCompleto, String username, String password, int edad) {
        super(nombreCompleto, username, password, edad);
        this.eventosCreados = new ArrayList();
    }

    public ArrayList<Evento> getEventosCreados() {
        return eventosCreados;
    }

    public void setEventosCreados(ArrayList<Evento> eventosCreados) {
        this.eventosCreados = eventosCreados;
    }

    public Evento esCreador(int codigo) {
        return esCreador(codigo, 0);
    }
    
    private Evento esCreador(int codigo, int index) {
        if (index < eventosCreados.size()) {
            Evento evento = eventosCreados.get(index);
            
            if (evento != null && evento.getCodigo() == codigo) {
                return evento;
            }
            
            return esCreador(codigo, index + 1);
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "UsuarioContenido{" + "eventosCreados=" + eventosCreados + super.toString()+"}";
    }
    

}
