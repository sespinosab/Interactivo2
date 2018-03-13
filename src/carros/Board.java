/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Board extends JPanel implements ActionListener{
    int xRef = 10;
    int yRef = 50;
    //private Timer timer;

    //public Board() {
    //    this.timer = new Timer(30, this);
     //   this.timer.start();
    //}
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //Carro
        Rectangle carro = new Rectangle(xRef, yRef, 30, 30);
        g.drawRect(xRef, yRef, 30, 10);
        
        g.setColor(Color.black);
        g.drawRect(200, 50, 20, 20);
        Rectangle obstaculo = new Rectangle(200, 50, 20, 20);
        
        
        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 20, 20);
        
        Polygon poligono=new Polygon();
        poligono.addPoint(xRef,15);
        poligono.addPoint(xRef+10,5);
        poligono.addPoint(xRef+20,15);
        g.drawPolygon(poligono);
        g.fillPolygon(poligono);
        Rectangle rectangulo=new Rectangle(xRef+10,5,10,5);
        g.setColor(Color.BLACK);
        //if(carro.intersects(obstaculo)){
        //  this.timer.stop();
        //}
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.xRef++;
        repaint();
    }
}
