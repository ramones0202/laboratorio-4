package mr_bet;

import java.util.HashSet;
import java.util.Objects;

public class Campeonato {
	private String nome;
	private int participantes;
	private HashSet<Time> times;
	
	public Campeonato(String nome, int participantes) {
		this.nome = nome;
		this.participantes = participantes;
		this.times = new HashSet<Time>();
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
	
	public boolean incluiTime(Time time) {
		
		if (this.times.size() < this.participantes) {
			this.times.add(time);
			return true;
		}
		return false;
	}


}
