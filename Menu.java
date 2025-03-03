package practica;


import java.util.InputMismatchException;
import java.util.ResourceBundle;
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

		Shelve items=new Shelve();

		if(users.isEmpty()==true) {
			System.out.println("Estoy vacia");
		}
		System.out.println("Please select language, 1 spanish, 2 english");
		Scanner lang=new Scanner(System.in);
		int language=lang.nextInt();
		boolean selected=false;
		String label="";
		while(!selected){
			if(language==1) {
				System.out.println("Ha seleccionado espa�ol, de espa�a");
				label="es_ES";
				selected=true;
			}else if(language==2) {
				System.out.println("You selected UK english");
				label="en_UK";
				selected=true;
			}else {
				System.out.println("Entry not recognized, please choose between the avaiable options");
				language=lang.nextInt();
			}

		}

		ResourceBundle languages= ResourceBundle.getBundle(label);//Initialize bundle with languages

		while(!salir) {
			if(registered==true) {
				System.out.println("Logged " );
			}
			System.out.println("1." +languages.getString("Sign_in"));
			System.out.println("2." +languages.getString("Log_in"));
			System.out.println("3." +languages.getString("Help"));
			System.out.println("4." +languages.getString("Books"));
			System.out.println("5." +languages.getString("Films"));
			System.out.println("6." +languages.getString("Log_out"));
			System.out.println("7." + "Segunda mano ");
			System.out.println("8." +languages.getString("Exit"));
			try {
				System.out.println("Write one of the options");
				option=sn.nextInt();



				Scanner sn2=new Scanner(System.in);

				switch(option) {
				case 1://Register 1st time

					System.out.println(languages.getString("Name(?)"));
					Scanner n=new Scanner(System.in);
					name=n.nextLine();
					System.out.println(languages.getString("Surname(?)"));
					Scanner s=new Scanner(System.in);
					surname=s.nextLine();
					System.out.println(languages.getString("ID(?)"));
					Scanner i=new Scanner(System.in);
					id=i.nextInt();
					User a=new User (id, name, surname);
					users.add(a);
					registered=true;
					break;

				case 2://Log with an actual account

					System.out.println(languages.getString("Log_in"));
					System.out.println(languages.getString("Name(?)"));
					n=new Scanner(System.in);
					name=n.nextLine();
					System.out.println(languages.getString("Surname(?)"));
					s=new Scanner(System.in);
					surname=s.nextLine();
					System.out.println(languages.getString("ID(?)"));
					i=new Scanner(System.in);
					id=i.nextInt();
					User log=new User(id,name,surname);
					exist=users.find(log);
					if(exist==true) {//Existe
						registered=true;
					}else {//Pues no existe
						registered=false;
						System.out.println(languages.getString("Error_register"));
					}
					break;

				case 3://Help

					System.out.println(languages.getString("Help_1"));
					System.out.println(languages.getString("Help_2"));
					System.out.println(languages.getString("Help_3"));
					System.out.println(languages.getString("Help_6"));
					System.out.println(languages.getString("Help_7"));
					break;

				case 4://Books

					System.out.println(languages.getString("B_avaiable"));
					System.out.println(languages.getString("B_options"));
					option2=sn2.nextInt();
					String na;
					String auth;
					String gen;
					int pag;
					String is;
					if(registered==true) {
						switch (option2) {
						case 1://take

							System.out.println(languages.getString("B_in"));
							na=sn2.nextLine();
							auth=sn2.nextLine();
							gen=sn2.nextLine();
							pag=sn2.nextInt();
							is=sn2.nextLine();
							Book take=new Book(na,auth,gen,pag,is);
							boolean exists=items.find(take);
							if(exists) {
								System.out.println(users.getLoggedUser().getName());							
							}else {
								System.out.println(languages.getString("Not_found"));
							}
							break;
						case 2://Find
							System.out.println(languages.getString("B_in"));
							na=sn2.nextLine();
							auth=sn2.nextLine();
							gen=sn2.nextLine();
							pag=sn2.nextInt();
							is=sn2.nextLine();

							Book find=new Book(na,auth,gen,pag,is);
							boolean existe=items.find(find);
							if(existe) {
								System.out.println(languages.getString("Exists"));
							}else {
								System.out.println(languages.getString("Not_found"));
							}
							break;
						case 3://Remove
							System.out.println(languages.getString("B_in"));
							na=sn2.nextLine();
							auth=sn2.nextLine();
							gen=sn2.nextLine();
							pag=sn2.nextInt();
							is=sn2.nextLine();

							Book no=new Book(na,auth,gen,pag,is);
							existe=items.find(no);
							if(existe) {
								items.remove(no);
							}else {
								System.out.println(languages.getString("Not_found"));
							}

							break;
						}
					}else {
						System.out.println(languages.getString("Need_to_log"));
					}
					break;

				case 5://Films
					System.out.println(languages.getString("F_avaible"));
					items.show();
					System.out.println(languages.getString("F_options"));
					option2=sn2.nextInt();
					boolean exists;
					String na1,act,dir,gen1;
					int d,m,y;//Variables in order to create the film we are looking for
					if(registered==true) {
						switch (option2) {
						case 1://Take

							na1=sn2.nextLine();
							act=sn2.nextLine();
							dir=sn2.nextLine();
							gen1=sn2.nextLine();
							d=sn.nextInt();
							m=sn.nextInt();
							y=sn.nextInt();
							Film take=new Film(na1,act,dir,gen1,y);
							exists=items.find(take);
							if(exists) {
								System.out.println(users.getLoggedUser().getName());
							}else {
								System.out.println(languages.getString("Need_to_log"));
							}
							break;
						case 2://Find 
							System.out.println(languages.getString("F_in"));
							na1=sn2.nextLine();
							act=sn2.nextLine();
							dir=sn2.nextLine();
							gen1=sn2.nextLine();
							d=sn.nextInt();
							m=sn.nextInt();
							y=sn.nextInt();
							Film search=new Film(na1,act,dir,gen1,y);
							boolean found=items.find(search);
							if(found==true) {
								System.out.println(languages.getString("Exists"));
							}else {
								System.out.println(languages.getString("Not_found"));
							}

							break;


						case 3://remove
							System.out.println(languages.getString("B_in"));
							na1=sn2.nextLine();
							act=sn2.nextLine();
							dir=sn2.nextLine();
							gen1=sn2.nextLine();
							d=sn.nextInt();
							m=sn.nextInt();
							y=sn.nextInt();

							Film no=new Film(na1,act,dir,gen1,y);
							exists=items.find(no);
							if(exists) {
								items.remove(no);
							}else {
								System.out.println(languages.getString("Not_found"));
							}
							break;
						}
					}else {
						System.out.println(languages.getString("Need_to_log"));
					}
					break;

				case 6:
					System.out.println(languages.getString("Ty"));
					registered=false;
					break;
				case 7:
					//Basicamente esto es el array bidimensional, el cual te permite coger cosas sin tener en cuenta un tiempo de devolucion
					Book a1= new Book("Hamlet","Shakespeare","Historico",200,"19483956");
					Book a2= new Book("Nuestro com�n amigo","Charles Dickens","Ficcion",180,"1894563");
					Book a3= new Book("El mundo de Sofia","Jostein Gaarder","Filos�fico",500,"8896513");
					Film b1= new Film("Pulp Fiction","Samuel L Jackson","Tarantino","Accion",1995);
					Film b2= new Film("Crep�sculo","Edward Van Cullen","Catherine Hardwicke","Drama",2008);
					Film b3= new Film("Blade Runner","Harruson Ford","Ridley Scott","Ciencia Ficci�n",1982);
					Item [][] segundamano= {{a1,a2,a3},{b1,b2,b3}};
					System.out.println("this are the avaiable books that don't require a renting method avaiable");
					for(int k=0;k<segundamano[0].length;k++) {
						segundamano[0][k].show();
					}
					System.out.println("this are the avaiable films that don't require a renting method avaiable");
					for(int k=0;k<segundamano[1].length;k++) {
						segundamano[1][k].show();
					}

					if(registered==true) {//Aunque no tenga que quitar libros de la biblioteca y "prestarlos" 
						while(option!=3) {
							System.out.println("1. Coger un libro");
							System.out.println("2. Coger una pelicula");
							System.out.println("3. Salir");
							option=sn.nextInt();
							int index;
							if(option<4 && option>0) {
								switch (option) {
								case 1:
									System.out.println("Dime el indice del libro que quieras sacar (siendo el primero 1)");
									index=sn.nextInt();
									for(int j=0;j<segundamano[0].length;j++) {

									}
									users.getLoggedUser().addItem(segundamano[0][index]);
									break;

								case 2:
									System.out.println("Dime el indice del libro que quieras sacar (siendo el primero 1)");
									index=sn.nextInt();
									users.getLoggedUser().addItem(segundamano[1][index]);
									break;

								case 3: 
									System.out.println();
									break;

								}

							}else {
								System.out.println(languages.getString("Error_number"));
							}
						}
					}


					break;

				case 8:
					System.out.println(languages.getString("Bye"));
					salir=true;
					break;
				case 9:
					System.out.println("Este el buzon de sugerencias, introduce las de 1 en 1 (primero la fecha de la sugerencia y luego la sugerencia en si); una vez metida la sugerencia ");
					int keepgoing=1;
					Scanner stringscan=new Scanner(System.in);
					GenericVector sugerencias = new GenericVector();
					while(keepgoing==1) {
					
					
					int date_input=stringscan.nextInt();
					sugerencias.add(date_input);
					String data_input=stringscan.nextLine();
					System.out.println("Quieres continuar?");
					keepgoing=sn.nextInt();
					}
					System.out.println("Estas son las sugerencias que tenemos de nuestros usuarios");
					sugerencias.show();				
					break;
				}

			}catch(InputMismatchException e) {
				System.out.println(languages.getString("Error_number"));
				sn.next();
			}
		}
	}
}

