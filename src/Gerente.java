
public class Gerente extends Funcionario implements Autenticavel{
	
	
	
	public double getBonus() { //� poss�vel criar getter/setter mesmo se o atributo n�o estiver declarado.
		return super.setBonus()+1000; //super indica que o atributo est� definido na classe base
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
