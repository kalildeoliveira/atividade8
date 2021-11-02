package heranca.exercicio03;

public class ContaSimples extends Conta {
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca (double valor) {	
		return true;
	}
	
	public boolean saquePoupanca (double valor) {
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nSaldo Poupança = ");
		builder.append(saldoPoupanca);		
		
		return  builder.toString();		
	}
	
}
