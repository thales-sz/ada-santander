package com.ada.banco;

import com.ada.banco.domain.gateway.ContaGateway;
import com.ada.banco.domain.model.Conta;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BancoApplicationTests {

	@Test
	void deveRetornarUmaConta() {
		ContaGateway contaGateway = new ContaGateway();
	}

}
