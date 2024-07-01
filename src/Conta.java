public abstract class Conta implements IConta{
    
    protected int agencia;
    protected int numero;
    protected double saldo;

    private static int AGENCIA_PADRÃO = 0001;
    private static int SEQUENCIAL = 1;

    public Conta(){
        this.agencia = AGENCIA_PADRÃO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
        
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosDaConta(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

   
    
}