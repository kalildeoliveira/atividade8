package heranca.exercicio02;

public class Item {
	private int codigo;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCódigo = ");
		builder.append(codigo);
		builder.append("\nDescrição = ");
		builder.append(descricao);		
		return builder.toString();
	}
}