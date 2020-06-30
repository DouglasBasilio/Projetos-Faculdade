
package sintese_geral;


public class Pessoa{
	protected String nome, sobrenome;
	Data dataNascimento;

	//construtor
	public Pessoa(String nome, String sobrenome,String dataString){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = new Data(dataString);
	}

	//gets
	public String getNome(){
	 return this.nome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	public String getData(){
		return this.dataNascimento.toString();
	}

	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
}