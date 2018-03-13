/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Escenario {
    private String nombre;
    private Carr carro;
    private ArrayList<Obstaculo> obstaculos;
    
    public Escenario(String nombre, Carr carro){
        this.nombre=nombre;
        this.carro=carro;
        this.obstaculos=new ArrayList();
    }
    public String get_nombre(){
        return this.nombre;
    }
    public Carr get_carro(){
        return this.carro;
    }
    public Obstaculo get_obstaculo(int a){
        return this.obstaculos.get(a);
    }
    public void addObstaculo(Obstaculo obs){
      this.obstaculos.add(obs);
    }

}
