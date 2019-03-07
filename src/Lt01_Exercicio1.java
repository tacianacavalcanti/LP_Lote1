/*
********************************************
Objetivo: 1 Exercício Lote 01 
Programador: Taciana Cavalcanto
Data de Criação: 07/02/19
********************************************
*/
import javax.swing.JOptionPane;
public class Lt01_Exercicio1
{
public static void main(String args[])
        {
        int areaQuad,ladoQuad ;
                
        ladoQuad = Integer.parseInt(JOptionPane.showInputDialog("Digite O Valor do Lado do Quadrado"));
        areaQuad = (ladoQuad * ladoQuad);
        JOptionPane.showMessageDialog(null,"A Area do Quadrado é " + areaQuad);
        }
}
