
public class EditorDeVideo extends Funcionario{
	
	public double getBonus() { //é possível criar getter/setter mesmo se o atributo não estiver declarado.
		return super.setBonus()+354; //super indica que o atributo está definido na classe base
	}
	
}	
