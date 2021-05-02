package com.atividadedapm.strategy.strategies;

import com.atividadedapm.strategy.Frete;

public class SedexNormal implements Frete {

	public double calcularPreco(int km) {
		return km * 1.45 + 12;
	}
	
}
