package com.sdp.format.impl;

import com.sdp.format.IMessageFormatter;

public class PDFMessageFormatterImpl implements IMessageFormatter{

	@Override
	public String messageFormatter(String message) {
		String formattedMessage=null;
		formattedMessage="<PDF>"+message+"</PDF>";
		return formattedMessage;
	}

}
