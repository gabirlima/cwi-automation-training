#language: pt
#encoding: iso-8859-1
Funcionalidade: Treinamento automação
	Nesta feature estou realizando treinamento do curso.

	@treinamento
	Cenario: Enviar mensagem através do menu Contact Us
		Dado que acessei a homepage
		E cliquei no link "Contact us"
		Quando eu seleciono o assunto da mensagem
		E preencho com o e-mail "gabirlima@gmail.com"
		E preencho com o número do pedido "123456"
		E preencho o campo mensagem
		E clico no botão Send
		Entao deve exibir o alert de mensagem enviada

	@treinamento
	Cenario: Adicionar Produto ao Carrinho
	 Dado que acessei a homepage
	 Quando adiciono produto no carrinho
	 Entao deve exibir o alert de produto incluído no carrinho com sucesso

	 @treinamento
	 Esquema do Cenario: Efetuar Cadastro
	 	Dado que acessei a homepage
	 	E selecionei o link Sign in
	 	E preenchi o campo email com <email>
	 	E selecionei o botão Create an account
	 	Quando selecionar o tratamento <tratamento>
	 	E incluir o nome <nome>
	 	E incluir o sobrenome <sobrenome>
	 	E incluir minha senha <senha>
	 	E incluir o endereço <endereço>
	 	E incluir a cidade <cidade>
	 	#E incluir o estado <estado>
	 	E incluir o zipcode <zipcode>
	 	E o número do celular <numCelular>
	 	E clicar no botão Register
	 	Entao devo visualizar tela Minha Conta
	 	
	 	Exemplos:
 	|	tratamento	|	nome		|	sobrenome	|				email			|		senha		|					endereço						|			cidade			|	zipcode	|	numCelular	|
 	| "Mr"				|	"João"	|	"Silva"		|	"joao@silva.vc"	|	"123456"	|	"Rua das Andradas 123/205"	|	"Porto Alegre"	| "90000"	| "984391382"	|
	 	
	 	