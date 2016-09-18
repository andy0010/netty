package com.andy0010;

public class App {
	
    public static void main( String[] args ) throws Exception{
        int port = 8080;
        if(args != null && args.length > 0){
        	try{
        		port = Integer.valueOf(args[0]);
        	}catch (NumberFormatException e){
        		
        	}
        }
        
        new TimeServer().bind(port);
    }
}
