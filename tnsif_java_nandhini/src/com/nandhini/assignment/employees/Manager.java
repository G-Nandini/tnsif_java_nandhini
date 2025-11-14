package com.nandhini.assignment.employees;

public class Manager extends Employee {
          private String departmentName;
          private int teamsize;
		  /**
 		  * @return the departmentName
 		  */
		  public String getDepartmentName() {
			  return departmentName;
		  }
		  /**
 		  * @param departmentName the departmentName to set
 		  */
		  public void setDepartmentName(String departmentName) {
			  this.departmentName = departmentName;
		  }
		  /**
 		  * @return the teamsize
 		  */
		  public int getTeamsize() {
			  return teamsize;
		  }
		  /**
 		  * @param teamsize the teamsize to set
 		  */
		  public void setTeamsize(int teamsize) {
			  this.teamsize = teamsize;
		  }
          
}
