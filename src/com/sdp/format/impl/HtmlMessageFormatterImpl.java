package com.sdp.format.impl;

import com.sdp.format.IMessageFormatter;

public class HtmlMessageFormatterImpl implements IMessageFormatter{

	@Override
	public String messageFormatter(String message) {
		String formattedMessage=null;
		formattedMessage="<html><body>"+message+"</body></html>";
		return formattedMessage;
	}

}
