package heranca.exercicio02;

public class Midia extends Item {
	private String gravadora;
	private float duracao;
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nGravadora = ");
		builder.append(gravadora);
		builder.append("\nDuração= ");
		builder.append(duracao);		
		return builder.toString();		
	}
}
