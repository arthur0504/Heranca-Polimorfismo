package exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {
        Imovel casa = new Imovel();
        
        casa.setEndereco(JOptionPane.showInputDialog("Digite o endereço do Imovel"));
        casa.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Imovel")));
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("O imóvel é novo ou velho: \n"
                + "1 - Novo\n"
                + "2 - Velho"));
        
        switch (tipo){
            case 1: 
                Novo inovo = new Novo();
                
                inovo.mostraPreco(casa.getValor(), casa.getEndereco());
                break;
                
            case 2:
                Velho ivelho = new Velho();
                
                ivelho.mostraPreco(casa.getValor(), casa.getEndereco());
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
        }
    }
    
}
