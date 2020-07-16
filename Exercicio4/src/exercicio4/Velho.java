package exercicio4;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Velho extends Imovel{
    DecimalFormat df = new DecimalFormat("#0.00");
    
    public void mostraPreco(double valor, String endereco){
        double desconto = valor * 0.1;
        double valornovo = valor - desconto;
        JOptionPane.showMessageDialog(null, "Valor do imovel novo: " + df.format(valornovo) + "\n"
                                          + "Endereço do Imóvel: " + endereco);
    }
}
