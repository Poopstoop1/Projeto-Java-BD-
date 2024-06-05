package br.com.Escola.domain;

public class Usuario {
	
	String nome;
	
	int Idade;
	
	String login;
	
	String senha;
	
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

	public void setDatadeNascimento(String datadeNascimento) throws Exception{
		if (validarData(datadeNascimento)) {
            this.DatadeNascimento = datadeNascimento;
        } else {
            this.DatadeNascimento = "data inválida";
        }
	}
	
	private boolean validarData(String data) {
        String pattern = "\\d{2}/\\d{2}/\\d{4}";
        return data.matches(pattern);
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

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", Idade=" + Idade + ", login=" + login + ", senha=" + senha
				+ ", DatadeNascimento=" + DatadeNascimento + ", cpf=" + cpf + ", email=" + email + ", telefone="
				+ telefone + "]";
	}
	
	

}
