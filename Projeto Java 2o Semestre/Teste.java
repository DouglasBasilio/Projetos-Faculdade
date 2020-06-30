
package sintese_geral;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Teste{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		List<Aluno> alunos = new ArrayList<Aluno>();  //lista ordenada de aluno
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();  //lista ordenada de funcionarios

		do{
			System.out.print("Digite 1 para cadastrar um aluno e 2 para cadastrar um funcionário (3 para sair): ");
			opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao){
				case 1:
					System.out.print("Digite o nome do Aluno: ");
					String nomeAluno = entrada.nextLine();
					System.out.print("Digite o sobrenome do Aluno: ");
					String sobrenomeAluno = entrada.nextLine();
					System.out.print("Digite a data de nascimento do Aluno (string dia/mes/ano): ");
					String dataNascimentoAluno =  entrada.nextLine();
					System.out.print("Digite a matrícula do Aluno: ");
					String matricula = entrada.nextLine();
					System.out.print("Digite a data da matricula do Aluno: ");
					String dataMatricula = entrada.nextLine();
                                        System.out.print("\n");
					alunos.add(new Aluno(nomeAluno,sobrenomeAluno,dataNascimentoAluno,matricula,dataMatricula));
                                        
					break;

				case 2:
					System.out.print("Digite o nome do funcionário: ");
					String nomeFuncionario = entrada.nextLine();
					System.out.print("Digite o sobrenome do funcionario: ");
					String sobrenomeFuncionario = entrada.nextLine();
					System.out.print("Digite a data de nascimento do Funcionario (string dia/mes/ano): ");
					String dataNascimentoFuncionario = entrada.nextLine();
					System.out.print("Digite o código do funcionário: ");
					String codigoFunc = entrada.nextLine();
					System.out.print("Digite a data de admissao do funcionário: ");
					String dataAdmissao = entrada.nextLine();
                                        System.out.print("\n");

					funcionarios.add(new Funcionario(nomeFuncionario,sobrenomeFuncionario,dataNascimentoFuncionario,codigoFunc,dataAdmissao));

					break;
				case 3:
                                        System.out.print("Saindo...");
                                        
					break;
				default: System.out.println("Opção inválida.");
			}
		}while(opcao!=3);
	}
}