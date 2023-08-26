/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario{
    private String nomeSecretaria;
    
    public Gerente(){
    
    }
        
       Gerente( String nome, double salario, int dependente, String Secretaria){
                super (nome, salario,dependente);
                this.nomeSecretaria = secretaria
        
    }

	public void Exibir() {
		super.Exibir();
		System.out.println("Nome da secretaria: "+nomeSecretaria);
}
public String getNomeSecretaria() {
		return nomeSecretaria;
	}
public void setNomeSecetaria(String nomeSecetaria) {
		this.nomeSecretaria = nomeSecetaria;
	}
	
}
