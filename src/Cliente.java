public class Cliente {
    
    private String nome;
    private int idade;
    private String cpf;


    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        
    }

    public Cliente(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return cpf;
    }
    
}
