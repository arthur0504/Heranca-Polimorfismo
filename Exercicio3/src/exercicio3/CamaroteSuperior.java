package exercicio3;

import javax.swing.JOptionPane;

public class CamaroteSuperior extends VIP{
    private double valor = 80;
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double localizacao) {
        this.valor = valor;
    }        
        
    public void imprimeValor(){
        JOptionPane.showMessageDialog(null, "Valor do Ingresso: R$" + this.valor);
    }
}
