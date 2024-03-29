package br.com.caelum.argentum.indicadores;


import br.com.caelum.argentum.modelo.SerieTemporal;

public class MediaMovelSimples implements Indicador {

	
	private Indicador outroIndicador;

	/* (non-Javadoc)
	 * @see br.com.caelum.argentum.indicadores.Indicador#calcula(int, br.com.caelum.argentum.modelo.SerieTemporal)
	 */
	@Override
	public double calcula(int posicao, SerieTemporal serie){
		double soma=0.0;
	for (int i = posicao-2; i <= posicao; i++) {
		soma += outroIndicador.calcula(i, serie);
	}
		return soma/3;
	}

	public String toString(){
		return "MMS de Fechamento";
	}
	
	public MediaMovelSimples(Indicador outroIndicador) {
		this.outroIndicador = outroIndicador;
		// TODO Auto-generated constructor stub
	}
}
