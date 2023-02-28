
public class Gerente extends Funcionario{
    
    public double getBonificacao() {
    	System.out.println("Chamando o método bonificacao do GERENTE");
    	return super.getSalario();
    }
}
    

