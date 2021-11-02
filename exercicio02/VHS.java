package heranca.exercicio02;

public class VHS extends Midia {
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nTítulo = ");
		builder.append(titulo);		
		return builder.toString();
	}
	
}
