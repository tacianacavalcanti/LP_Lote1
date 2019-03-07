/*
********************************************
Objetivo: 6 Exercício Lote 1 
Programador: Taciana Cavalcanto
Data de Criação: 14/02/19
********************************************
*/
import javax.swing.JOptionPane;

public class Lt01_Exercicio6 {
    
    public static void main(String args[]){
    
        int x,y,troca;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de y"));
        
        troca = x;
        x = y;
        y = troca;
        
        JOptionPane.showMessageDialog(null, "O valor de x é " + x + " e o valor de y é " + y);
  
    }
}
