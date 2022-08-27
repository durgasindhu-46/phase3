package com.authentication;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestLogin{
   
	
	private UserLogin loginuser;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All Tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All Tests");
	}
	@BeforeEach
	public void setup() {
		loginuser= new UserLogin();
		System.out.println("Login Started");
	}
	
	@AfterEach
	public void tearDown() {
		loginuser=null;
		System.out.println("Login Closed");
	}
	@Test
	public void bothcorrect() {
		 assertEquals(true,loginuser.authentication("user","123"));
		 System.out.println("User Details are correct");
	}
	
	@Test
	public void WrongUsername() {
		 assertEquals(false,loginuser.authentication("use","123"));
		 System.out.println("User id is wrong");
		
	}
	
	@Test
	public void WrongPassword() {
		 assertEquals(false,loginuser.authentication("user","abc"));
		 System.out.println("User password is wrong");
	}
	
	@Test 
	public void bothIncorrect() {
		 assertEquals(false,loginuser.authentication("users","abc"));
		 System.out.println("User Details are not correct");
	}

	@Test
	 public void trueAssert() {
		 assertTrue(loginuser.authentication("user","123"));
		 System.out.println("User Details are correct");
	}
	@Test
	 public void falseAssert() {
		 assertFalse(loginuser.authentication("admin","123"));
		 System.out.println("User id is wrong");
	}
	
}
