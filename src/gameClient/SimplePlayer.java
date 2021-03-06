package gameClient;

import javazoom.jl.player.*;
import java.io.FileInputStream;
import java.lang.reflect.Proxy;

/**
 * the goal of this class is to play the background music of the game
 */

public class SimplePlayer implements Runnable
{ 
    private String path;

	public SimplePlayer(String path)
	{
    	this.path = path;
    }
	
    public void play()
    {
        try
        {
             FileInputStream fis = new FileInputStream(path);
             Player playMP3 = new Player(fis);
             playMP3.play();
        }  
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }


	@Override
	public void run() 
	{
		play();
	}



}