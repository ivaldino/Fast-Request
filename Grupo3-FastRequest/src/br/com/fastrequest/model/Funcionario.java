package br.com.fastrequest.model;

public class Funcionario extends Pessoa{

	
	private int id_funcionario;
	private String Cpf;
	private String rg;
	private String telefone;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(int id_funcionario, String cpf, String rg,
			String telefone) {
		this.id_funcionario = id_funcionario;
		this.rg = rg;
		this.telefone=telefone;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [id_funcionario=");
		builder.append(id_funcionario);
		builder.append(", Cpf=");
		builder.append(Cpf);
		builder.append(", rg=");
		builder.append(rg);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append("]");
		return builder.toString();
	}
	
}
