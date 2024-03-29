package br.com.centralit.citcorpore.integracao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import br.com.centralit.citcorpore.bean.RegiaoDTO;
import br.com.citframework.dto.IDto;

import br.com.citframework.integracao.CrudDaoDefaultImpl;
import br.com.citframework.integracao.Field;
import br.com.citframework.integracao.Order;
import br.com.citframework.util.Constantes;
@SuppressWarnings({ "unchecked", "rawtypes" })
public class RegiaoDao extends CrudDaoDefaultImpl  {

	public RegiaoDao() {
		super(Constantes.getValue("DATABASE_ALIAS"), null);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Collection find(IDto arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Collection getFields() {

		Collection listFields = new ArrayList();
		listFields.add(new Field("idregioes", "idRegioes", true, true, false, false));
		listFields.add(new Field("nome", "nome", false, false, false, false));
		
		return listFields;
	}

	@Override
	public String getTableName() {
		
		return "regioes";
	}

	@Override
	public Collection list() throws Exception {
		List list = new ArrayList();
		list.add(new Order("nome"));
		return super.list(list);
	}
	
    public  RegiaoDTO listByIdRegiao(RegiaoDTO obj) throws Exception {
	List list = new ArrayList();
	List fields = new ArrayList();
	String sql = "select idregioes from " + getTableName() +" where idregioes = ? ";
	fields.add("idregioes");
	list = this.execSQL(sql, new Object[] {obj.getIdRegioes() });
	return (RegiaoDTO)  this.listConvertion(getBean(), list, fields).get(0);
    }

	@Override
	public Class getBean() {
		// TODO Auto-generated method stub
		return RegiaoDTO.class;
	}

}
