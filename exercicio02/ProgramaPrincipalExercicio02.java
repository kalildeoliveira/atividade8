package heranca.exercicio02;

public class ProgramaPrincipalExercicio02 {

	public static void main(String[] args) {
		// TESTE LIVRO
		Livro l = new Livro();
		l.setAutor("Abcde");
		l.setCodigo(123);
		l.setDescricao("fghij");
		
		System.out.println(l);
		
		// TESTE CD
		CD c = new CD();
		c.setAlbum("hijk");
		c.setArtista("lmno");
		c.setCodigo(456);
		c.setDescricao("pqrs");
		c.setDuracao((float) 1.234);
		c.setFaixas(789);
		c.setGravadora("tuvw");		
		
		System.out.println(c);
		
		// TESTE VHS
		VHS v = new VHS();
		v.setCodigo(012);
		v.setDescricao("xyza");
		v.setDuracao((float) 5.67);
		v.setGravadora("bcde");
		v.setTitulo("fghi");
		
		System.out.println(v);
		
	}

}
