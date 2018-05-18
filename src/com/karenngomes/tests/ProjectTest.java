package com.karenngomes.tests;

import com.karenngomes.implementation.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Project class tests")
public class ProjectTest {
	
	User user1 = new User("Karen", "Gomes", "kngs@ic.ufal.br", "karen123");
	User user2 = new User("Pedro", "Soares", "pss@ic.ufal.br", "pedrinh0");
	
	Project project1 = new ProjectInProgress("project 1", user1, Categories.TECH);
	Project project2 = new ProjectInProgress("project 2", user2, Categories.COMICS);
	
	@Test
	@DisplayName("Project test 1")
    public void projectTest1() {
		String newProjectName = "Tech project";
		project1.setName(newProjectName);
        assertAll("Basic information",
            () -> assertEquals("Tech project", project1.getName()),
            () -> assertEquals("Pedro Soares", project2.getResponsible().getFullName())
        );
    }
	
	@Test
	@DisplayName("Project test 2")
    public void projectTest2() {
		assertEquals(false, project1.isClosed());
    }

}
