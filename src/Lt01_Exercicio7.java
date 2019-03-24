/*
********************************************
Objetivo: 7 Exercício Lote 1 
Programador: Taciana Cavalcanto
Data de Criação: 14/02/19
********************************************
*/
import javax.swing.JOptionPane;

public class Lt01_Exercicio7 {
    public static void main(String args[]){
      /*Declaração de variaveis*/
        int comp, larg, alt, vol;
      /**Receber dados **/   

        comp = Integer.parseInt(JOptionPane.showInputDialog("Informe comprimento do paralelepipedo"));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura do paralelepipedo"));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do paralelepipedo"));

        vol = comp * alt * larg;
        JOptionPane.showMessageDialog(null,"O volume do paralelepipedo é " + vol);
    }
}
