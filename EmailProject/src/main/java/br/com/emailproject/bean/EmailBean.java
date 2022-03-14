package br.com.emailproject.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emailproject.dto.EmailLayout;
import br.com.emailproject.model.Email;
import br.com.emailproject.service.EmailService;

@Named
// Usando o Named estou dizendo que a minha página é uma página de Bean
@RequestScoped
// Pacote para CDI , requisição

public class EmailBean implements Serializable {

	/** Aperto CTRL 1 para implementar Serial Version ID pq é implementei
	 * a classe Seriazable
	 * 
	 */
	private static final long serialVersionUID = 4538755582654584073L;
	
	// preciso instanciar o nosso serviço
	// Esses arrobas vem tudo do servidor WIldFly, são imports automáticos
	
	
	private static final String DESTINATARIO = "sintaxeavontadedeveloper@gmail.com";
	private static final String ASSUNTO = "Mudança de senha.";
	
	
	
	
	
	
	@Inject
	private EmailService emailService;
	
	// Criando um método para enviar e-mail
	
	public String enviarEmail() {
		// Vou lá no email Service criar o método
		emailService.enviar(montarEmail());
		return null;	
	
	}
	
	private Email montarEmail() {
		
		// Vou usar esse método apenas nessa classe, por isso está private
		
	// Mas preciso chamar o Layout e crio um objeto dele	
		
			EmailLayout layout = new EmailLayout();
			return layout.montarEmailAdministrador(DESTINATARIO, ASSUNTO);
		
	}
	
	
	

}
