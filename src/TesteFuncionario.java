
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario osorio = new EditorDeVideo();
		osorio.setNome("Osório");
		osorio.setCpf("123.456.789-10");
		osorio.setSalario(15000);

		System.out.println(osorio.getNome() + " é muito lindo e merece ganhar " + osorio.getSalario() + " reais"
				+ " e ainda um bônus de " + osorio.getBonus());

		Funcionario gerente = new Gerente(); // é possível usar um tipo de referência mais genérica. Neste caso,
												// "Funcionário" em vez de "Gerente"
		gerente.setNome("Pedro");
		gerente.setSalario(500);

		System.out.println("Pedro vai ganhar um bônus de " + gerente.getBonus());
	}

}
