package control;

import model.db;
import model.employee;

public class service {
	private employee emp = new employee();
	public boolean insert(employee obj){
		emp=obj;
		try {
			db.insert(emp);
			return true;
		}catch(Exception e) {
			
		}
		return false;
	}
	public boolean update(employee obj){
		emp=obj;
		try {
			db.update(emp);
			return true;
		}catch(Exception e) {
			
		}
		return false;
	}
}
