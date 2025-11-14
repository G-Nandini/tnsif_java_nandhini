package com.nandhini.assignment.employees;

public class Developer extends Employee {
            private String programmingLanguages;
            private String ProjectName;
			/**
			 * @return the programmingLanguages
			 */
			public String getProgrammingLanguages() {
				return programmingLanguages;
			}
			/**
			 * @param programmingLanguages the programmingLanguages to set
			 */
			public void setProgrammingLanguages(String programmingLanguages) {
				this.programmingLanguages = programmingLanguages;
			}
			/**
			 * @return the projectName
			 */
			public String getProjectName() {
				return ProjectName;
			}
			/**
			 * @param projectName the projectName to set
			 */
			public void setProjectName(String projectName) {
				ProjectName = projectName;
			}
}
