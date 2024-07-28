package himedia.testing.repository.dao;

import java.util.List;

import himedia.testing.repository.vo.PhonebookVo;

public interface PhonebookDao {
	public List<PhonebookVo> getList();
	public PhonebookVo selectByName(String search);
	
}
