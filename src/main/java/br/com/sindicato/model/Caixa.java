package br.com.sindicato.model;

import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Caixa {
	
	public List<Entrada> entradas;
	public List<Saida> saidas;
	
	public double calculaSaldo (List entradas, List saidas) throws ParseException {
		
		double somaEntradas = 0;
		double somaSaidas = 0;
		
		Iterator<Entrada> it = entradas.iterator();
		while (it.hasNext()) {
			somaEntradas = somaEntradas + it.next().valorEntrada;
		}
		
		Iterator<Saida> itSaida = saidas.iterator();
		while (itSaida.hasNext()) {
			somaSaidas = somaSaidas + itSaida.next().valorSaida;
		}
		
		return somaEntradas - somaSaidas;
	}
	
	public double calculaSaldoPorData (List entradas, List saidas, String data) {
		
		
		return 1.2;
	}
}
