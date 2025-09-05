/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;

/**
 *
 * @author Duoc
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" ===Bienvenidos a la Pizzeria DUOC===\n");
        
        Pizza pizza1= new Pizza("Pepperoni","Mediana","Delgada" );
        
        String nombre=pizza1.getNombre();
        String tamaño=pizza1.getTamaño();
        String masa=pizza1.getMasa();
        
        System.out.println("Usted a comprado una pizza :" +nombre + " Tamanio : "+tamaño + " De masa: " +masa );
        
        //Ahora cambiamos el tamaño de la pizza
        
        pizza1.setTamaño("Grande");
        System.out.println("Usted a comprado una pizza :" +nombre + " Tamanio : "+pizza1.getTamaño() + " De masa: " +masa );
        
        
    }
    
}
