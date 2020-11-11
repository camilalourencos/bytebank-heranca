
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; //protected torna o atributo p�blico para os filhos
	
	
	public double getBonus() { //� poss�vel criar getter/setter mesmo se o atributo n�o estiver declarado.
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
