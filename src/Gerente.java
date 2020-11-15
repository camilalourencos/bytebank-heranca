
public class Gerente extends Funcionario implements Autenticavel{
	
	
	
	public double getBonus() { //é possível criar getter/setter mesmo se o atributo não estiver declarado.
		return super.setBonus()+1000; //super indica que o atributo está definido na classe base
	}
	
    private AutenticacaoLogin login;

    public Gerente() {
        this.login = new AutenticacaoLogin();
    }

    @Override
    public void setSenha(int senha) {
        this.login.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
    	return this.login.autentica(senha);
    }
    
}	
