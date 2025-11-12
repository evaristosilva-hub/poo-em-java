package aula12;

public class Cachorro extends Mamifero{
    public void enterrandoOsso(){
        System.out.println("Enterrando Osso ");
    }
    public void abanarRabo(){
        System.out.println("Abanando o Rabo");
    }
    @Override
    public void alimentar() {
        
    }
    @Override
    public void emitirSom() {
        System.out.println("Latindo Au! Au! Au!");
    }
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    
}
