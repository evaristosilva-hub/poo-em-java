package aula12;

public class AnimaisAção {
    @SuppressWarnings("unused")
    public static void main (String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara b = new Arara(); 
        
        System.out.println();
        //m.setPeso(35.3f);
        //m.setIdade(2);
        //m.setCorPelo("Marrom");
        //m.setMembro(4);
        //m.locomover();
        //m.alimentar();
        //m.emitirSom();

        /*p.setPeso(0.35);
        p.setIdade(1);
        p.setMembro(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();*/

        /*a.setPeso(0.89);
        a.setIdade(2);
        a.setMembro(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();*/

        //c.setPeso(55.30);
        //c.setIdade(3);
        //c.setMembro(4);
        //c.locomover();
        //c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        //k.setPeso(3.94);
        //k.setIdade(5);
        //k.setMembro(4);
        k.locomover();
        //k.alimentar();
        k.emitirSom();
        k.abanarRabo();



    }
}
