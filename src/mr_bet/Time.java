package mr_bet;

import java.util.Objects;

public class Time {
	private String codigo;
	private String nome;
	private String mascote;
	
	public Time(String codigo, String nome, String mascote) {
		this.codigo = codigo;
		this.nome = nome;
		this.mascote = mascote;
	}

	public String getNome() {
		return nome;
	}

	public String getMascote() {
		return mascote;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "["+ this.codigo + "] " +  this.nome + " / " + this.mascote;
	}
	
}
