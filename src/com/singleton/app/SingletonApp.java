package com.singleton.app;

import com.singleton.model.MySingleton;

public class SingletonApp {
	public static void main(String...args)
	{
		String urlServer = "jdbc:mysql://localhost:3306/tiendita";
		String user = "root";
		String pass = "root";
		MySingleton Singleton = MySingleton.getSingle(urlServer, user, pass);
		MySingleton Singleton2 = MySingleton.getSingle("ajsd", "eee", "aaa");
		MySingleton Singleton3 = MySingleton.getSingle("dkf", "sdc", "aaaa");
	}
}
