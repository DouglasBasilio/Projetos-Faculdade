
package sintese_geral;


public class Funcionario extends Pessoa{
	private String codigoFunc;
	private Data dataAdmissao;

	//construtor
	public Funcionario(String nome, String sobrenome,String dataNascimento, String codigoFunc, String dataAdmissaoString){
		super(nome, sobrenome, dataNascimento);
		this.dataAdmissao = new Data(dataAdmissaoString);
	}

	//gets

        public String getCodigoFunc() {
                return codigoFunc;
        }
        
	public String getDataAdmissao(){
		return this.dataAdmissao.toString();
	}

	//sets
        
        public void setCodigoFunc(String codigoFunc) {
                this.codigoFunc = codigoFunc;
    }
	public void setDataAdimissao(String dataString){
		this.dataAdmissao.setData(dataString);
	}
}