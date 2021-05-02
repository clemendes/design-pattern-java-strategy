package com.atividadedapm.strategy.strategies;

import com.atividadedapm.strategy.Frete;

public class Sedex10 implements Frete {

	public double calcularPreco(int km) {
		return km * 2.10 + 12;
	}
	
}
