package com.class31_Encapsulation;

public class Registration {  // Encapsulation example

		private String email, userName;
		private int password;
		
		
		//getters
		public String getEmail() {
			return email;
		}
		
		public String getUserName() {
			return userName;
		}
		
		public int getPassword() {
			return password;
		}
		
		
		
		//setters
		public void setEmail(String email) {
			this.email=email;
		}
		
		public void setUserName(String userName) {
			this.userName=userName;
		}
		
		public void setPassword(int password) {
			this.password=password;
		}
}
