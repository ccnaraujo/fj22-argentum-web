package br.com.caelum.argentum.indicadores;

import br.com.caelum.argentum.modelo.SerieTemporal;

public class IndicadorAbertura implements Indicador {

	@Override
	public double calcula(int posicao, SerieTemporal serie) {
		// TODO Auto-generated method stub
		return serie.getCandle(posicao).getAbertura();
	}
	public String toString(){
		return "Abertura";
	}

}
