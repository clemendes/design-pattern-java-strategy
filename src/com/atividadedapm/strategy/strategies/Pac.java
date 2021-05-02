package com.atividadedapm.strategy.strategies;

import com.atividadedapm.strategy.Frete;

public class Pac implements Frete {

	public double calcularPreco(int km) {
		return km * 1.20 + 10;
	}
	
}
