
public class Gerente extends Funcionario{
	
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica (int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonus() { //é possível criar getter/setter mesmo se o atributo não estiver declarado.
		return super.setBonus()+1000; //super indica que o atributo está definido na classe base
	}
	
}	
