package practica;

import java.util.*;

public class UserList implements Vectorinterfaces{
	private Vector<User> userlist=new Vector <User>();
		public UserList() {
			userlist.add(new User(47299189,"David","Martinez")); //This is to check that you can actually log with an existing account
			userlist.add(new User (65457823,"Pepe","Perez"));
			userlist.add(new User (89651424,"Jose","Joliedras"));
		}
		
		public void show() {
			
		}
		
		public User getLoggedUser() {
			for(int i=0;i<userlist.size();i++) {
				if(userlist.get(i).isLogged()) {
					return userlist.get(i);
				}
			}
			return null;
		}
		
		public boolean find(User you) {
			for(int i=0;i<userlist.size();i++){
				if(userlist.get(i).getName().equalsIgnoreCase(you.getName())) {
					return true;
				}
			}
			return false;
		}
		
		public void add(User you) {
			userlist.add(you);
		}
		
		public void remove(User you) {
			
			for(int i=0;i<userlist.size();i++){
				
				if(userlist.get(i).getName().equalsIgnoreCase(you.getName()) && userlist.get(i).getSurname().equalsIgnoreCase(you.getSurname())) {
					userlist.remove(i);
				}
			}
		}
		
		public boolean isEmpty() {
			boolean empty;
			empty=userlist.isEmpty();
			if(empty==true) {
				return true;
			}else{
				return false;
			}
		}
		
		public void showAt(int indexe) {
			System.out.println(userlist.get(indexe).getName() +userlist.get(indexe).getSurname() +userlist.get(indexe).getDni()  );
		}
		
		
}