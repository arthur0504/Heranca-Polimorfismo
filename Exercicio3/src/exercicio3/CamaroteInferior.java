package exercicio3;

import javax.swing.JOptionPane;

public class CamaroteInferior extends VIP{
    private double valor = 65;
    
    
    public void imprimeValor(){
        JOptionPane.showMessageDialog(null, "Valor do Ingresso: R$" + this.valor);
    }
    
}
