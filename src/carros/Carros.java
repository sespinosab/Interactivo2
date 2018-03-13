/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;
import javax.swing.JFrame;

public class Carros extends JFrame{
    
    public Carros() {
       initUI();
    }
    private void initUI() {

        add(new Board());
        setSize(250, 200);
        setTitle("Ejercicio 0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    public static void main(String[] args) {
        Carros ex = new Carros();
        ex.setVisible(true);
    }
    
}
