package br.com.caelum.ingresso.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

public class SessaoTest {
	
	@Test
	public void oPrecoDaSessaoDeveSerIgualASomaDoPrecoSalaEDoFilme(){
		Sala sala = new Sala("Eldorado - Imax", new BigDecimal("22.5"));
		Filme filme = new Filme("Rogue One", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("12.0"));
		
		BigDecimal somaDosPrecosSalaEFilme = sala.getPreco().add(filme.getPreco());
		
		Sessao sessao = new Sessao(LocalTime.now(), filme, sala);
		
		assertEquals( somaDosPrecosSalaEFilme, sessao.getPreco());
	}

}
