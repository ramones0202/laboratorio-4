package mr_bet;

import java.util.HashSet;
import java.util.Objects;

public class Time {
	private String codigo;
	private String nome;
	private String mascote;
	private HashSet<Campeonato> campeonatos;
	
	public Time(String codigo, String nome, String mascote) {
		this.codigo = codigo;
		this.nome = nome;
		this.mascote = mascote;
		this.campeonatos = new HashSet<Campeonato>();

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
	
	public void incluiCampeonato(Campeonato campeonato) {
			this.campeonatos.add(campeonato);
	}

	public HashSet<Campeonato> getCampeonatos() {
		return campeonatos;
	}
}

