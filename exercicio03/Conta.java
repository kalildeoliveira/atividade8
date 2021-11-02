package heranca.exercicio03;

public class Conta {
	private String banco;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nBanco = ");
		builder.append(banco);
		builder.append("\nAgência= ");
		builder.append(agencia);
		builder.append("\nNúmero da Conta= ");
		builder.append(numeroConta);
		builder.append("\nSaldo = ");
		builder.append(saldo);
		
		return  builder.toString();
	}
}
