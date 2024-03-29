package br.com.centralit.citcorpore.rh.integracao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.centralit.citcorpore.rh.bean.CargoExperienciaInformaticaDTO;
import br.com.citframework.dto.IDto;
import br.com.citframework.integracao.Condition;
import br.com.citframework.integracao.CrudDaoDefaultImpl;
import br.com.citframework.integracao.Field;
import br.com.citframework.integracao.Order;
import br.com.citframework.util.Constantes;

//Substituir NomeDaClasseDao
public class CargoExperienciaInformaticaDao extends CrudDaoDefaultImpl {
	
	public CargoExperienciaInformaticaDao() {
		super(Constantes.getValue("DATABASE_ALIAS"), null);
	}

	public Collection find(IDto arg0) throws Exception {
		return null;
	}

	public Collection getFields() {
		Collection listFields = new ArrayList();
		
		listFields.add(new Field("idDescricaoCargo", "idDescricaoCargo", true, false, false, false));
		listFields.add(new Field("idExperienciaInformatica", "idExperienciaInformatica", true, false, false, false));
		listFields.add(new Field("obrigatorio", "obrigatorio", false, false, false, false));
		
		return listFields;
	}
	
	// Substituir NomeDaTabela
	public String getTableName() {
		return "RH_CargoExperienciaInformatica";
	}

	
	// Substituir NomeDoDTO
	public Class getBean() {
		
		return CargoExperienciaInformaticaDTO.class;
	}


    public Collection list() throws Exception {
        List list = new ArrayList();
        list.add(new Order("idExperienciaInformatica"));
        return super.list(list);
    }

	public Collection findByIdDescricaoCargo(Integer idDescricaoCargo) throws Exception {
		List lstCondicao = new ArrayList();
		List lstOrder = new ArrayList();
		
		lstCondicao.add(new Condition("idDescricaoCargo", "=", idDescricaoCargo));
		lstOrder.add(new Order("idExperienciaInformatica"));
		
		return super.findByCondition(lstCondicao, lstOrder);
	}    
	
	public void deleteByIdDescricaoCargo(Integer idDescricaoCargo) throws Exception{
		Condition cond = new Condition("idDescricaoCargo", "=", idDescricaoCargo);
		List lstCond = new ArrayList();
		lstCond.add(cond);
		
		super.deleteByCondition(lstCond);
	}	
}
