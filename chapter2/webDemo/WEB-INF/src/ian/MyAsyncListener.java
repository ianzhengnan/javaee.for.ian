package ian;

import javax.servlet.AsyncListener;
import javax.servlet.AsyncEvent;
import javax.servlet.annotation.WebListener;

import java.io.IOException;

public class MyAsyncListener implements AsyncListener{

	public void onComplete(AsyncEvent event) throws IOException{
		System.out.println("-------------Async complete-------------");
	}

	public void onStartAsync(AsyncEvent event) throws IOException{
		System.out.println("-------------Async start----------------");
	}

	public void onTimeout(AsyncEvent event) throws IOException{
		System.out.println("-------------Async timeout----------------");
	}

	public void onError(AsyncEvent event) throws IOException{
		System.out.println("-------------Async Error-----------------");
	}
}