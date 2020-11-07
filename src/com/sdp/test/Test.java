package com.sdp.test;
import com.sdp.writer.*;
public class Test {

	public static void main(String[] args) {
		MessageWriter m=new MessageWriter();
		String s=m.writeMessage("Welcome");
		System.out.println(s);
	}

}
