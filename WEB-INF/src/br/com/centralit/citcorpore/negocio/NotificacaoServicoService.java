package br.com.centralit.citcorpore.negocio;

import java.util.Collection;

import br.com.centralit.citcorpore.bean.NotificacaoServicoDTO;
import br.com.citframework.service.CrudServiceEjb2;

public interface NotificacaoServicoService  extends CrudServiceEjb2 {
	
	public Collection<NotificacaoServicoDTO> listaIdServico(Integer idservico) throws Exception;
	
	public Collection<NotificacaoServicoDTO> listaIdNotificacao(Integer idNotificacao) throws Exception;
	
	public boolean existeServico(Integer idNotificacao, Integer idservico) throws Exception;

}
