
package sintese_geral;


public class Aluno extends Pessoa{
	private String matricula;
	private Data dataMatricula;

	//construtor
	public Aluno(String nome, String sobrenome,String dataNascimento, String matricula, String dataMatricula){
		super(nome,sobrenome,dataNascimento);
		this.matricula = matricula;
		this.dataMatricula = new Data(dataMatricula);
	}

	//gets
	public String getMatricula(){
		return this.matricula;
	}
	public String getDataMatricula(){
		return this.dataMatricula.toString();
	}

	//sets
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public void setDataMatricula(String dataMatricula){
		this.dataMatricula.setData(dataMatricula);
	}
}