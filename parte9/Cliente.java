package entities;
public class Cliente {
  private int conta;
  private String titular;
  private double saldo;
  
  public Cliente(int conta, String titular) {
    this.conta = conta;
    this.titular = titular;
  }

  public Cliente(int conta, String titular, double depositoInicial) {
    this.conta = conta;
    this.titular = titular;
    deposito(depositoInicial);
  }

  public int getconta() {
    return conta;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void deposito(double quantidade){
    saldo += quantidade;
  }
  public void saque(double quantidade){
    saldo -= quantidade + 5.0;
  }
  public String toString(){
    return "Account"
    + conta
    + ", Holder: "
    + titular
    + ", Saldo: $"
    + String.format("%.2f", saldo);
  }
}
