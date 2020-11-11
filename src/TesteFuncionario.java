
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario osorio = new Funcionario();
		osorio.setNome("Osório");
		osorio.setCpf("123.456.789-10");
		osorio.setSalario(15000);

		System.out.println(osorio.getNome() + " é muito lindo e merece ganhar " + osorio.getSalario() + " reais"
				+ " e ainda um bônus de " + osorio.getBonus());
	}

}
