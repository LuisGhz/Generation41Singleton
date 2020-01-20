package com.singleton.model;

public class MySingleton {
	//2. Se crea instancia privada estatica
	private static MySingleton mySingletonObject = null;
	private static String urlServer;
	private static String user;
	private static String pass;
	
	//1.Se crea constructor vacío para eviar la instancia
	private MySingleton() {}
	
	//3. Método getInstance público estático
	public static MySingleton getSingle(String url, String u, String p)
	{
		if(mySingletonObject == null)
		{
			urlServer = url;
			user = u;
			pass = p;
			mySingletonObject = new MySingleton();
		}
		else
		{
			System.out.println("No se puede crear el objeto por que ya ha sido instanciado");
			System.out.println(urlServer);
			System.out.println(user);
			System.out.println(pass);
		}
		
		return mySingletonObject;
	}
}
