package com.newlecture.proj4.poly;

import java.util.List;

public interface MenuRepository {
	List<Menu> findAll(int page);
	List<Menu> findAll();
	void save(Menu menu);
}
