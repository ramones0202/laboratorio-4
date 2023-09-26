package mr_bet;

import java.util.HashMap;


public class MrBetSistema {
	private HashMap<String, Time> times;
	
	
	public MrBetSistema() {
		this.times = new HashMap <String, Time>();
	}


	public void incluiTime(String codigo, String nome, String mascote) {
		Time novoTime = new Time(codigo, nome, mascote);
		times.put(codigo, novoTime);
	}
	
	public String recuperaTime(String codigo) {
		if (!this.times.containsKey(codigo)) {
			throw new IllegalArgumentException();
		}
		return times.get(codigo).toString();
	}
}


