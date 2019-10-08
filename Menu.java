package practica;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static void main(String []args) {
		Scanner sn = new Scanner(System.in);
		boolean salir=false;
		int option;//Save de user option
		int option2;
		String name;
		String surname;
		int id;
		boolean exist=true;
		boolean registered=false;
		
		UserList users=new UserList();
		
		BookShelf books= new BookShelf();
		
		CinemaSection films= new CinemaSection();
		
		
		if(users.isEmpty()==true) {
			System.out.println("Estoy vacia");
		}
		while(!salir) {
			if(registered==true) {
				System.out.println("Logged " );
			}
			System.out.println("1. Sign in ");
			System.out.println("2. Log in ");
			System.out.println("3. Help ");
			System.out.println("4. Books");
			System.out.println("5. Films ");
			System.out.println("6. Log out ");
			System.out.println("7. Salir ");
			try {
			System.out.println("Write one of the options");
			option=sn.nextInt();
			
			
			
			Scanner sn2=new Scanner(System.in);
			
			switch(option) {
			case 1:
				
				System.out.println("What's your name?");
				Scanner n=new Scanner(System.in);
				name=n.nextLine();
				System.out.println("What's your surname?");
				Scanner s=new Scanner(System.in);
				surname=s.nextLine();
				System.out.println("What's your ID?");
				Scanner i=new Scanner(System.in);
				id=i.nextInt();
				User a=new User (id, name, surname);
				users.add(a);
				registered=true;
				break;
				
			case 2:
				
				System.out.println("Log in");
				System.out.println("What's your name?");
				n=new Scanner(System.in);
				name=n.nextLine();
				System.out.println("What's your surname?");
				s=new Scanner(System.in);
				surname=s.nextLine();
				System.out.println("What's your ID?");
				i=new Scanner(System.in);
				id=i.nextInt();
				User log=new User(id,name,surname);
				exist=users.find(log);
				if(exist==true) {//Existe
					registered=true;
				}else {//Pues no existe
					registered=false;
					System.out.println("Failed to log in; maybe you misspell your password or your user");
				}
				break;
		
			case 3:
				System.out.println("Options 1 allows you to register so you can follow "
						+"Option 2 allows for the already registed user, to do stuff with the library books" 
						+ "steps to take a book;4-6 let you know if you can look'em,take'em or put new ones ");
				break;
			case 4:
				System.out.println("These are the books avaible right now");
				books.showAll();
				System.out.println("1. Take a film \n 2. Find a film \n 3. Remove a film ");
				option2=sn2.nextInt();
				if(registered==true) {
					switch (option2) {
					case 1:
						
						break;
					case 2:
						String na;
						String auth;
						String gen;
						int pag;
						String is;
						System.out.println("Introduce name,author,genre, pages, and the ISBN each one separately");
						na=sn2.nextLine();
						auth=sn2.nextLine();
						gen=sn2.nextLine();
						pag=sn2.nextInt();
						is=sn2.nextLine();
						
						break;
					case 3:
						
						break;
					}
				}else {
					System.out.println("You need to log in/Sign up in order to access the books");
				}
				break;
				
			case 5:
				System.out.println("These are the avaible films right now");
				films.showAll();
				System.out.println("1. Take a book 2. Find a book 3. Remove a book \n");
				option2=sn2.nextInt();
				if(registered==true) {
					switch (option2) {
					case 1:
						
						break;
					case 2:
						String na;
						String act;
						String dir;
						String gen;
						int d;
						int m;
						int y;//Variables in order to create the film we are looking for
						System.out.println("Introduce name,actor,director,genre,release day,release month and release year each one separately ");
						na=sn2.nextLine();
						act=sn2.nextLine();
						dir=sn2.nextLine();
						gen=sn2.nextLine();
						d=sn.nextInt();
						m=sn.nextInt();
						y=sn.nextInt();
						Film search=new Film(na,act,dir,gen,d,m,y);
						boolean found=films.find(search);
						if(found==true) {
							System.out.println("There are aviable copies");
						}else {
							System.out.println("Film not found maybe you misspelled the actor/actress or director's name wrong");
						}
						
						break;
					case 3: 
						
						break;
					}
				}else {
					System.out.println("You need to log in/Sign up in order to access the films");
				}
				break;
				
			case 6:
				System.out.println("Thanks for using our services");
				registered=false;
				break;
				
			case 7:
				System.out.println("Goodbye!");
				salir=true;
				break;
			}
			
			}catch(InputMismatchException e) {
				System.out.println("You must insert a number");
				sn.next();
			}
		}
	}
}
