package br.com.emailproject.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emailproject.dto.EmailLayout;
import br.com.emailproject.model.Email;
import br.com.emailproject.service.EmailService;

@Named
// Usando o Named estou dizendo que a minha p�gina � uma p�gina de Bean
@RequestScoped
// Pacote para CDI , requisi��o

public class EmailBean implements Serializable {

	/** Aperto CTRL 1 para implementar Serial Version ID pq � implementei
	 * a classe Seriazable
	 * 
	 */
	private static final long serialVersionUID = 4538755582654584073L;
	
	// preciso instanciar o nosso servi�o
	// Esses arrobas vem tudo do servidor WIldFly, s�o imports autom�ticos
	
	
	private static final String DESTINATARIO = "sintaxeavontadedeveloper@gmail.com";
	private static final String ASSUNTO = "Mudan�a de senha.";
	
	
	
	
	
	
	@Inject
	private EmailService emailService;
	
	// Criando um m�todo para enviar e-mail
	
	public String enviarEmail() {
		// Vou l� no email Service criar o m�todo
		emailService.enviar(montarEmail());
		return null;	
	
	}
	
	private Email montarEmail() {
		
		// Vou usar esse m�todo apenas nessa classe, por isso est� private
		
	// Mas preciso chamar o Layout e crio um objeto dele	
		
			EmailLayout layout = new EmailLayout();
			return layout.montarEmailAdministrador(DESTINATARIO, ASSUNTO);
		
	}
	
	
	

}
