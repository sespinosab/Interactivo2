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
public class Chasis {
    private int x;
    private int y;
    private ArrayList<Punto> puntos;
    
    public Chasis(int x, int y){
        this.x=x;
        this.y=y;
        this.puntos=new ArrayList();
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
}
