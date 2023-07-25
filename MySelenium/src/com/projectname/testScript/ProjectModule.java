package com.projectname.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.projectname.generic.BaseClass;

public class ProjectModule extends BaseClass {
	@Test
	public void createProject() {
		Reporter.log("createProject", true);
	}

	@Test
	public void modifyProject() {
		Reporter.log("modifyProject", true);
	}

	@Test
	public void deleteProject() {
		Reporter.log("deleteProject", true);
	}
}