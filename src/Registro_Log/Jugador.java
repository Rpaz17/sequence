package Registro_Log;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Jugador  implements Comparable<Jugador> { 
    
    /* En esta sección se inicializan los atributos de cada jugador*/
   public String username;
    public String password;
    public String playerCName;
    public Date fecha;
    public ArrayList<String> gamesLogged;
    public int points;

    
    /* Se crea el constructor de la clase Jugador*/
    public Jugador(String playersName, String password) {
        this.username = playersName;
        this.password = password;
        this.gamesLogged = new ArrayList();
        points = 0 ;
    }
    
    // Set y get de cada atributo
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getGamesLogged(){
        return gamesLogged;
    }

//    public String[] getPartidas() {
//    String[] reversedPartidas = new String[partidas.length];
//    for (int i = 0; i < partidas.length; i++) {
//        reversedPartidas[i] = partidas[partidas.length - i - 1];
//    }
//    return reversedPartidas;
//}
    public void addPoints() {
        this.points +=3 ;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void listar(){
        
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return Integer.compare(getPoints(), otroJugador.getPoints());
    }
}
