package br.com.centralit.citcorpore.rh.negocio;
import br.com.centralit.citcorpore.rh.integracao.ExperienciaInformaticaDao;
import br.com.citframework.excecao.ServiceException;
import br.com.citframework.integracao.CrudDAO;
import br.com.citframework.service.CrudServicePojoImpl;
public class ExperienciaInformaticaServiceBean extends CrudServicePojoImpl implements ExperienciaInformaticaService {
	protected CrudDAO getDao() throws ServiceException{ 
		return new ExperienciaInformaticaDao(); 
	}
	
	protected void validaCreate(Object arg0) throws Exception{}
	
	protected void validaDelete(Object arg0) throws Exception{}
	
	protected void validaFind(Object arg0) throws Exception{}
	
	protected void validaUpdate(Object arg0) throws Exception{}
	
}
