package mr_bet;

import java.util.HashMap;


public class MrBetSistema {
	private HashMap<String, Time> times;
	private HashMap<String, Campeonato> campeonatos;
	
	public MrBetSistema() {
		this.times = new HashMap <String, Time>();
		this.campeonatos = new HashMap <String, Campeonato>();
	}


	public String incluiTime(String codigo, String nome, String mascote) {
		if(this.times.containsKey(codigo)) {
			return "Time já existe!";
		}
		Time novoTime = new Time(codigo, nome, mascote);
		times.put(codigo, novoTime);
		return "Inscrição Realizada";
	}
	
	public String recuperaTime(String codigo) {
		if (this.times.containsKey(codigo)) {
			//throw new IllegalArgumentException("Time já existe!");
			return times.get(codigo).toString();
		}
		return "Time não existe!";	
		}
	
	public String cadastraCampeonato(String nome, int participantes) {
		if (this.campeonatos.containsKey(nome.toUpperCase()) && campeonatos != null) {
			return "Campeonato já existe!";
			
		}
		
		Campeonato novoCampeonato = new Campeonato(nome, participantes, this.times); 
		this.campeonatos.put(nome.toUpperCase(), novoCampeonato);
		return  "Campeonato adicionado";		
	}
	
	public void inclueTimeEmCampeonato(String codigoCampeonato, String codigoTime) {
		if(!this.times.containsKey(codigoTime)) {
			throw new IllegalArgumentException("Time não existe");
			
		}
	}
}


