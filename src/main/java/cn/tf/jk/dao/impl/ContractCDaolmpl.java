package cn.tf.jk.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.tf.jk.dao.ContractCDao;
import cn.tf.jk.dao.FactoryCDao;
import cn.tf.jk.po.ContractC;
import cn.tf.jk.po.FactoryC;
import cn.tf.jk.vo.ContractVO;

@Repository
public class ContractCDaolmpl extends BaseDaoImpl<ContractC>  implements  ContractCDao{

	public ContractCDaolmpl(){
		super.setNs("cn.tf.jk.mapper.ContractCMapper");
	}

	@Override
	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState",map);
		
	}

	@Override
	public ContractVO view(String contractId) {
		return  super.getSqlSession().selectOne(super.getNs()+".view",contractId);
		
	}
	
	
	
}
