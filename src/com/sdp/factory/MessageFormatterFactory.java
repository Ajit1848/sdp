package com.sdp.factory;

import com.sdp.format.IMessageFormatter;
import com.sdp.format.impl.HtmlMessageFormatterImpl;
import com.sdp.format.impl.PDFMessageFormatterImpl;


public class MessageFormatterFactory {

	public static IMessageFormatter create(String type)
	{
		IMessageFormatter iMessageFormatter=null;

		if(type.equals("html"))
		{
			iMessageFormatter=new HtmlMessageFormatterImpl();
		}
		else if(type.equals("pdf"))
		{
			iMessageFormatter=new PDFMessageFormatterImpl();
		}
		return iMessageFormatter;
		
	}

}
