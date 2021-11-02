package heranca.exercicio01;

public class ProgramaPrincipalExercicio01 {

	public static void main(String[] args) {
		
		// EXEMPLO PESSOA FÍSICA
		PessoaFisica p = new PessoaFisica();				
		p.setNome("Kalil");
		p.setEndereco("Rua abc, 123");
		p.setCpf ("888.888.888");
		p.setEstadoCivil("Solteiro");
		
		System.out.println(p);
		
		// EXEMPLO PESSOA JURÍDICA
		PessoaJuridica x = new PessoaJuridica();
		x.setNome("ABC Computer LTDA");
		x.setEndereco("Rua aeiou, 456");
		x.setCnpj("999.999.999");
		x.setTipoEmpresa("Mista");
		
		System.out.println(x);
		
		
	}

}
