package Entidades;

public class Conta {
    // Atributos
    private int cpf;
    private int conta;
    private float saldo;
    private boolean especial;

    // Getters
    public int getCpf(){
        return cpf;
    }
    public int getConta(){
        return conta;
    }
    public float getSaldo(){
        return saldo;
    }
    public boolean getEspecial(){
        return especial;
    }

    // Setters
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setConta(int conta){
        this.conta = conta;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void setEspecial(boolean especial){
        this.especial = especial;
    }

    // Construtores
    public Conta (int cpf, int conta, float saldo){
        this.cpf = cpf;
        this.conta = conta;
        this.saldo = saldo;
    }
    public Conta(int cpf, int conta){
        this.cpf = cpf;
        this.conta = conta;
    }
    public Conta (int cpf, int conta, float saldo, boolean especial){
        this.cpf = cpf;
        this.conta = conta;
        this.saldo = saldo;
        this.especial = especial;
    }
    public Conta() {
    }

    public static Conta[] contas = new Conta[0];

    // Métodos
    public float bonificacao() {
        return saldo * 0.10f;
    }
    public void saque(float valor){
        if (valor > 0 && valor <= saldo){
            System.out.println("O valor atual da conta agora é: R$ " + (saldo - valor));
        } else {
            System.out.println("Saque não realizado (valor inválido ou saldo insuficiente)");
        }
    }
    public float bonificacao2() {
        if (especial){
            return saldo * 0.10f;
        } else {
            return saldo * 0.05f;
        }
    }
}
