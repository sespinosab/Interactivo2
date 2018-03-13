/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Estudiante
 */
public class Carr {
    private int x;
    private int y;
    private Chasis chasis;
    private Rueda rueda1;
    private Rueda rueda2;
    
    public Carr(int x, int y, Chasis chasis, Rueda rueda, Rueda rueda2){
        this.x=x;
        this.y=y;
        this.chasis=chasis;
        this.rueda1=rueda;
        this.rueda2=rueda2;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    
}
