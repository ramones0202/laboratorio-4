package mr_bet;

import java.util.Objects;

public class Campeonato {
	private String nome;
	private int participantes;
	
	
	public Campeonato(String nome, int participantes) {
		this.nome = nome;
		this.participantes = participantes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campeonato other = (Campeonato) obj;
		return Objects.equals(nome, other.nome);
	}


}
