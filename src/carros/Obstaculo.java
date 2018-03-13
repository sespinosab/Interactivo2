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
public class Obstaculo {
    private int x;
    private int y;
    public Obstaculo(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
