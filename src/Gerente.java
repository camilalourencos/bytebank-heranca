
public class Gerente extends Funcionario implements Autenticavel{
	
	
	
	public double getBonus() { //� poss�vel criar getter/setter mesmo se o atributo n�o estiver declarado.
		return super.setBonus()+1000; //super indica que o atributo est� definido na classe base
	}
	
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
	
}	
