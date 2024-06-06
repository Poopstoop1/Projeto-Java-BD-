package br.com.Escola.domain;


public class Usuario {
	
	String nome;
	
	int Idade;
	
	String login;
	
	String senha;

	String nomePai;
	
	String nomeMae;
	
	String DatadeNascimento;
	
	String cpf;
	
	String email;
	
	String telefone;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	public String getDatadeNascimento() {
		return DatadeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) throws Exception  {
		if( dataDeNascimento.length() != 10 ) {
			throw new Exception("Data Valida");
		}	else {
			this.DatadeNascimento = dataDeNascimento;
		}
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws Exception {
		if( cpf.length() != 14 ) {
			throw new Exception("CPF Inválido");
		}		
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", Idade=" + Idade + ", login=" + login + ", senha=" + senha + ", nomePai="
				+ nomePai + ", nomeMae=" + nomeMae + ", DatadeNascimento=" + DatadeNascimento + ", cpf=" + cpf
				+ ", email=" + email + ", telefone=" + telefone + "]";
	}
	

}
