// n�o � poss�vel criar/instanciar objetos concretos a partir de classes abstratas
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; //protected torna o atributo p�blico para os filhos
	
	//m�todo sem corpo - n�o h� implementa��o desse m�todo aqui, apenas nos filhos
	public abstract double getBonus(); //� poss�vel criar getter/setter mesmo se o atributo n�o estiver declarado.

	public double setBonus() {
		return this.salario*0.5;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
