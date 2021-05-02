package com.atividadedapm.strategy;

import com.atividadedapm.strategy.strategies.Pac;
import com.atividadedapm.strategy.strategies.Sedex10;
import com.atividadedapm.strategy.strategies.SedexHoje;
import com.atividadedapm.strategy.strategies.SedexNormal;

public enum TipoFrete {

	PAC {
		@Override
		public Frete obterFrete() {
			return new Pac();
		}
	},
	
	SEDEXNORMAL {
		@Override
		public Frete obterFrete() {
			return new SedexNormal();
		}
	},
	
	SEDEX10 {
		@Override
		public Frete obterFrete() {
			return new Sedex10();
		}
	},
	
	SEDEXHOJE {
		@Override
		public Frete obterFrete() {
			return new SedexHoje();
		}
	};
	
	public abstract Frete obterFrete();
	
}
