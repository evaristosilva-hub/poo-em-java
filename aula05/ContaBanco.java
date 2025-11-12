package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Personalizados
    public void abrirConta(String t){
        this.settipo(t);
        this.setstatus(true);
        if (t == "CC"){
            this.setsaldo(50);
        } else if (t == "CP"){
            this.setsaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
        
        }
        public void fecharConta(){
            if (this.getsaldo() > 0){
                System.out.println("Conta com dinheiro, não posso fechar");
            } else if (this.getsaldo() < 0){
                System.out.println("Conta em débito, não posso fechar");
            } else {
                this.setstatus(false);
                System.out.println("Conta fechada com sucesso");
            }
        }
        public void depositar(float v){
            if(status == true){
                this.setsaldo(this.getsaldo() + v);
                System.out.println("Depósito realizado na conta de " + this.getdono());
            } else {
                System.out.println("Impossível depositar");
            }
        }
        public void sacar(float v){
            if (this.getstatus() == true){
                if (this.getsaldo() >= v){
                    this.setsaldo(this.getsaldo() - v);
                    System.out.println("Saque realizado na conta de " + this.getdono());
                } else {
                    System.out.println("Saldo insuficiente para saque");
                }
            } else {
                System.out.println("Impossível sacar de uma conta fechada");
            }
        }
        public void pagarMensal(){
            int v = 0;
            if (this.gettipo() == "CC"){
                v = 0;
            } else if (this.gettipo() == "CP"){
                v = 20;
            }
            if (this.getstatus() == true){
                if (this.getsaldo() > v){
                    this.setsaldo(this.getsaldo() - v);
                    System.out.println("Mensalidade paga com sucesso por " + this.getdono());
                } else {
                    System.out.println("Saldo insuficiente");

                }
            } else {
                System.out.println("Impossível pagar uma conta fechada");
            }
        }
        //Métodos Especiais
        public ContaBanco(String t, String d, int n, float s, boolean st) {
            this.saldo = 0;
            this.status = false;
        }
        
         public void setnumConta(int n){
            this.numConta = n;
        }
        public int getnumConta(){
            return this.numConta;
        }
        public void settipo(String t){
            this.tipo = t;
        }
        public String gettipo(){
            return this.tipo;
        }
        public void setdono(String d){
            this.dono = d;
        }
        public String getdono(){
            return this.dono;   
        }
        public void setsaldo(float s){
            this.saldo = s;
        }
        public float getsaldo(){
            return this.saldo;  
        }
        public void setstatus(boolean st){
            this.status = st;
        }
        public boolean getstatus(){
            return this.status;
        }
        public void estadoAtual(){
            System.out.println();
            System.out.println("Conta: " + this.getnumConta());
            System.out.println("Tipo: " + this.gettipo());
            System.out.println("Dono: " + this.getdono());
            System.out.println("Saldo: " + this.getsaldo());
            System.out.println("Status: " + this.getstatus());
        }

}