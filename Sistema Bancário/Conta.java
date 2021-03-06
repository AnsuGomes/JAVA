package contabanco;

import javax.swing.JOptionPane;
import utilitarios.util;

public class Conta {
    private static int ContadorDeContas = 1;
    
    private int numconta;
    private Pessoa pessoa;
    private double saldo = 0;

      public Conta(Pessoa pessoa) {
        this.numconta = ContadorDeContas;
        this.pessoa = pessoa;
        ContadorDeContas += 1;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String toString (){
        return  "\nNumero da conta: " + this.getNumconta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF:: " + this.pessoa.getCpf() +
                "\nEMAIL: " + this.pessoa.getEmail() +
                "\nSALDO: " + util.doubleToString(this.getSaldo()) +
                "\n";
    }
    
    public void Depositar(Double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null,"Depósito realizado com sucesso.");
        } else{
            JOptionPane.showMessageDialog(null,"Imppossível fazer depósito.");
        }
    }
    
    public void Sacar(Double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null,"Imppossível fazer saque.");
        }
    }
    
    
}
