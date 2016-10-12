package com.JES.service;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.JES.dao.Managerdao;
import com.JES.model.Manager;

public class ManagerService {
	private Managerdao managerdao;

	public Managerdao getManagerdao() {
		return managerdao;
	}

	public void setManagerdao(Managerdao managerdao) {
		this.managerdao = managerdao;
	}

	/**
	 * 是否登陆成功。
	 * 
	 * @param manager
	 *            管理员对象。
	 * @return 是否登陆成功。
	 */
	public boolean isLoginSuccess(Manager manager) {
		List resultList = managerdao.findByMname(manager);
		

		if (resultList.size() != 0) {
			Manager result = (Manager) resultList.get(0);
			
			if (manager.getMname().equals(result.getMname())
					&& manager.getPassword().equals(result.getPassword())) {
				return true;
			}
		}
		
		return false;
	}

}
