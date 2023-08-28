package Registro_Log;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Login {

    public ArrayList<Jugador> jugadorArreglo;
    Jugador jugador;

    public Login() {
        jugadorArreglo = new ArrayList<>();

    }

    public ArrayList<Jugador> getJugadorArreglo() {
        return jugadorArreglo;
    }

    /*
    A continuacion tenemos el uso de recursividad 
    Se utiliza para poder recorrer el arreglo de los jugador,
    si se encuentra el nombre del jugador entonces lo deja ingresar,
    pero si no enviara un mensaje diciendo que ese jugador no existe.
     */
    public Jugador buscarJugador(String playerName) {
        return buscarJugador(playerName, 0);
    }

    public Jugador buscarJugador(String playerName, int pos) {
        if (pos >= jugadorArreglo.size()) {
            return null;
        }
        Jugador player = jugadorArreglo.get(pos);
        if (player != null && player.getUsername().equals(playerName)) {
            return player;
        } else {
            return buscarJugador(playerName, pos + 1);
        }
    }

    public boolean addPlayer(Jugador jugador) {
        Jugador searchPlayer = buscarJugador(jugador.getUsername());
        if (searchPlayer == null) {
            Jugador newPlayer = new Jugador(jugador.getUsername(), jugador.getPassword());
            jugadorArreglo.add(newPlayer);
            return true;
        }
        return false;
    }

    public boolean cambiarContraseña(String password, String name) {
        Jugador cambiar = buscarJugador(name);
        if (cambiar != null) {
            jugador.setPassword(jugador.getPassword());
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCuenta(String jugador) {
        Jugador eliminar = buscarJugador(jugador);
        if (eliminar != null) {
            jugadorArreglo.remove(buscarJugador(jugador));
            return true;
        } else {
            return false;
        }
    }

    public void actualizarJugador(Jugador player) {
        for (int i=0; i<jugadorArreglo.size(); i++) {
            if (jugadorArreglo.get(i).username.equals(player.username)) {
                jugadorArreglo.set(i, player);
            }
        }
    }
    
    public static void main(String[] args) {
        
    }
}
