package exercicio4;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Novo extends Imovel{   
    
    public void mostraPreco(double valor, String endereco){
        DecimalFormat df = new DecimalFormat("#0.00");
        
        double adicional = valor * 0.1;
        double valornovo = valor + adicional;
        JOptionPane.showMessageDialog(null, "Valor do imovel novo: R$" + df.format(valornovo) + "\n"
                                          + "Endereço do Imóvel: " + endereco); 
        
    }
}