/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

import java.util.ArrayList;

public class UsuarioAdmin extends Usuario {
    private ArrayList<Evento> eventosCreados;

    public UsuarioAdmin(String nombreCompleto, String username, String password, int edad) {
        super(nombreCompleto, username, password, edad);
        this.eventosCreados = new ArrayList();
    }

    public ArrayList<Evento> getEventosCreados() {
        return eventosCreados;
    }

    public void setEventosCreados(ArrayList<Evento> eventosCreados) {
        this.eventosCreados = eventosCreados;
    }
    
    
    public final ArrayList<String> idsEvento(){
        ArrayList<String>ids = new ArrayList();
        for(Evento evento:eventosCreados){
            ids.add(String.valueOf(evento.getCodigo()));
        }
        return ids;
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
        return "UsuarioAdmin{" + "IdsDeEventos " + idsEvento()+ super.toString() +eventosCreados+ "}";//To change body of generated methods, choose Tools | Templates.
    }

}
