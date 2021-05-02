package com.atividadedapm.strategy.strategies;

import com.atividadedapm.strategy.Frete;

public class SedexHoje implements Frete {

	public double calcularPreco(int km) {
		return km * 1.80 + 12;
	}
	
}
