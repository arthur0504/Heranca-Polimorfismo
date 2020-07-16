package exercicio2a;

public class Exercicio2a {

    public static void main(String[] args) {
                      
        Cachorro bela = new Cachorro();
        Gato miau = new Gato();
        
        bela.setNome("Bela");
        bela.setRaca("Labrador");
        System.out.println(bela.toString());
        bela.late();
        bela.caminha();
        
        miau.setNome("Miau");
        miau.setRaca("Persa");
        System.out.println(miau.toString());
        miau.mia();
        miau.caminha();
    }
    
}
