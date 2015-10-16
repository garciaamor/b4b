package boletin4b1;

import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;

public class Boletin4b1 {
    public static void main(String[] args) {
        float km,lit,vMed,pGas;
        
        Coche central = new Coche();
        
        central.setpGas((float) 1.57);
        central.setlit(50);
        
        String resposta=JOptionPane.showInputDialog("indica los km recorridos :");
        km= Float.parseFloat(resposta);
        String resposta2=JOptionPane.showInputDialog("indica los litros consumidos:");
        lit= Float.parseFloat(resposta2);
        String resposta3=JOptionPane.showInputDialog("indica la velocidad media :");
        vMed= Float.parseFloat(resposta3);
        String resposta4=JOptionPane.showInputDialog("indica el precio de la gasolina :");
        pGas= Float.parseFloat(resposta4);
        Coche central2 = new Coche(km, lit, vMed, pGas);
        
        JOptionPane.showMessageDialog (null, "el consumo medio del vehiculo es de  = "+ central2.ConsumoMedio()+" litros por 100 kilometos");
        JOptionPane.showMessageDialog (null, "la velocidad media es de  = "+ central2.getvMed()+ " kilometros/hora"); 
        
    }
    
        
        
      
    
}
