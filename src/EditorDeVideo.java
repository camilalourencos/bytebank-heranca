
public class EditorDeVideo extends Funcionario{
	
	public double getBonus() { //� poss�vel criar getter/setter mesmo se o atributo n�o estiver declarado.
		return super.setBonus()+354; //super indica que o atributo est� definido na classe base
	}
	
}	
