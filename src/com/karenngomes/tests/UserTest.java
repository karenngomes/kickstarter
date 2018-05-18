package com.karenngomes.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.karenngomes.implementation.*;

@DisplayName("User class tests")
public class UserTest {
	
	User user1 = new User("Karen", "Gomes", "kngs@ic.ufal.br", "karen123");
	User user2 = new User("Nich", "Araujo", "paz@ic.ufal.br", "nich123");
	
	@Test
	@DisplayName("User test 1")
    void userTest1() {
		assertEquals(user1.getFullName(), "Karen Gomes");
	}
	
	@Test
	@DisplayName("User test 2")
    void userTest2() {
        assertAll("Person",
            () -> assertEquals("Karen", user1.getFirstName()),
            () -> assertEquals("Gomes", user1.getLastName())
        );
    }
	

	@Test
	@DisplayName("User test 3")
    void userTest3() {
		assertAll("Properties",
	            () -> {
	                String firstName = user2.getFirstName();
	                assertNotNull(firstName);
	                assertAll("first name",
	                    () -> assertTrue(firstName.startsWith("N")),
	                    () -> assertTrue(firstName.endsWith("h"))
	                );
	            },
	            () -> {
	                String lastName = user2.getLastName();
	                assertNotNull(lastName);
	                assertAll("last name",
	                    () -> assertTrue(lastName.startsWith("A")),
	                    () -> assertTrue(lastName.endsWith("o"))
	                );
	            }
	        );
    }
	
}
