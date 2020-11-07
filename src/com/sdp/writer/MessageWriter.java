package com.sdp.writer;

import com.sdp.factory.MessageFormatterFactory;
import com.sdp.format.*;

public class MessageWriter {
	public String writeMessage(String message)
	{
		IMessageFormatter iMessageFormatter=null; 

		iMessageFormatter=MessageFormatterFactory.create("pdf");
		String s1=iMessageFormatter.messageFormatter(message);
		return s1;
	}

}
