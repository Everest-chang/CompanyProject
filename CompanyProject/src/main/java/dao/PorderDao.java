package dao;

import java.util.List;

import entity.Porder;

public interface PorderDao {
	//create
	void addPorder(Porder porder);
	//read
	List<Porder> allPorder();
	List<Porder> selectByName(String name);

}
