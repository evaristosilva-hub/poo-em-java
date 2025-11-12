package aula12;

//Atributos de Animal
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    //Métodos de Animal.
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
