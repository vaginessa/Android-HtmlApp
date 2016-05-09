package com.lostteam.htmltemplate;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.support.v4.widget.*;

public class MainActivity extends Activity 
{
	
	WebView myWebView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		myWebView = (WebView)findViewById(R.id.webview);
		// Enables JavaScript
		myWebView.getSettings().setJavaScriptEnabled(true);
		// Loads index.html
		myWebView.loadUrl("file:///android_asset/index.html");
		myWebView.setWebViewClient(new myWebViewClient() {
				public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
					myWebView.loadUrl("file:///android_asset/error.html");

				}  
			});
		final SwipeRefreshLayout swipeLayout = (SwipeRefreshLayout)findViewById(R.id.swipe);

        swipeLayout.setColorScheme(android.R.color.holo_blue_bright,
								   android.R.color.holo_blue_bright,
								   android.R.color.holo_blue_bright,
								   android.R.color.holo_blue_bright);
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {

                @Override public void onRefresh()
				{

					myWebView.reload();

					new Thread() 
					{
						public void run(){
							SystemClock.sleep(1500);
							swipeLayout.setRefreshing(false);


						};
					}.start();



                }
			});
			
}
	@Override
	public void onBackPressed()
	{
		if (myWebView.canGoBack())
		{
			myWebView.goBack();
		}
		else
		{
			super.onBackPressed();
		}
	}


	
			
			
			
	public class myWebViewClient extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			view.loadUrl(url);
			return true;
		}



	
	
}

}


