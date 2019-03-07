/*
********************************************
Objetivo: 3 Exercício Lote 01 
Programador: Taciana Cavalcanto
Data de Criação: 14/02/19
********************************************
*/
import javax.swing.JOptionPane;

public class Lt01_Exercicio3 {
     public static void main(String args[]){
     
    double tempCel, tempFahr;
    
    tempCel = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura em graus celsius"));
    
    tempFahr = (9 * tempCel + 160)/5;
    JOptionPane.showMessageDialog(null, "A temperatura em graus fahrenheit é  " + tempFahr);
    
    }
}
