package exercicio3;

import javax.swing.JOptionPane;

public class Normal extends Ingresso{
   private double valor = 50;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }        
    
    public void imprimeValor(){
        JOptionPane.showMessageDialog(null, "Valor do Ingresso: R$" + this.valor);
    }
}
