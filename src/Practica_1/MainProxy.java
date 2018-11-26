package Practica_1;

public class MainProxy implements ProxyInterface {
		User main = new User();

		
		@Override
		public String getMainName() {
			
			return main.userName();
		}
		
		@Override
		public String getMainId() {
			
			return  main.userId();
		}

		@Override
		public String getMainPassword() {
			
			return  main.password();
		}

		@Override
		public void setMainName(String name) {
			
			main.setUserName(name);
		}

		@Override
		public void setMainId(String id) {
			
			main.setUserId(id);
			
		}
		
		@Override
		public void setMainPassword(String password) {
			
			main.setPassword(password);
		}
	}

