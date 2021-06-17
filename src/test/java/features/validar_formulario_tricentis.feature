# language: pt
# encoding: utf-8

Funcionalidade: Testar preenchimento de formulário Seguro Tricentis

	Cenario: Validar envio de e-mail de confirmação
		Dado que o usuário está na página de cadastro de seguro Tricentis
		E Preenche o formulário na aba Vehicle Data e clica em next
		E Preenche o formulário na aba Insurant Data e clica em next
		E Preenche o formulário na aba Product Data e clica em next
		E Preenche o formulário na aba Price Option e clica em next
		E Preenche o formulário na aba Send Quote e clica em enviar
		Então o usuário deve receber uma <mensagem> de confirmação

		Exemplos:
		|mensagem                 |
		|"Sending e-mail success!"|