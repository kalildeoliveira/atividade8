package heranca.exercicio02;

public class CD extends Midia {
	private int faixas;
	private String artista;
	private String album;
	
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nFaixas = ");
		builder.append(faixas);
		builder.append("\nArtista = ");
		builder.append(artista);
		builder.append("\n�lbum = ");
		builder.append(album);
		return builder.toString();
	}
	
}
