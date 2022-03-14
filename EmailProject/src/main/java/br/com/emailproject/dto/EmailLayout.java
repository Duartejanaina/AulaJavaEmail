package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	//Vou criar uma constante para quebra de linha usando código hmtl
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	private static final String QUEBRA_DE_LINHA = "<br>";
	// vou criar um método para criar um método estático para o administrador, 
	// para o código copiar por hora
	
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		//String Builder representa o corpo do email
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C do Administrador")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicito a alteração de senha do sistema")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		gerarRodape(texto);
		
		
		return new Email(destinatario, assunto, texto.toString());
		
	}

	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("At.te.")
				.append(QUEBRA_DE_LINHA)
				.append("Operador de Caixa")
				.append(QUEBRA_DE_LINHA_DUPLA)
				.toString();
		
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("E-mail automático. Favor não responder a esse e-mail").toString();
		
	}

	private void append(String quebraDeLinhaDupla) {
		// TODO Auto-generated method stub
		
	}

}
