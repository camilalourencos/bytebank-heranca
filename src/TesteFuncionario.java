
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario osorio = new EditorDeVideo();
		osorio.setNome("Os�rio");
		osorio.setCpf("123.456.789-10");
		osorio.setSalario(15000);

		System.out.println(osorio.getNome() + " � muito lindo e merece ganhar " + osorio.getSalario() + " reais"
				+ " e ainda um b�nus de " + osorio.getBonus());

		Funcionario gerente = new Gerente(); // � poss�vel usar um tipo de refer�ncia mais gen�rica. Neste caso,
												// "Funcion�rio" em vez de "Gerente"
		gerente.setNome("Pedro");
		gerente.setSalario(500);

		System.out.println("Pedro vai ganhar um b�nus de " + gerente.getBonus());
	}

}
