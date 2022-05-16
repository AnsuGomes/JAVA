package contabanco;

public class Pessoa {
    public static int contador = 1;
    
    private String nome, cpf, email;
    private int NumerodeConta;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        contador += 1;
    }
    public Pessoa (){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\n Nome: + this.getNome()" +
                "\nCPF: + this.getCpf()" + 
                "\nEmail: + this.getEmail()";
    }
    
}
