package com.moodanalyzer.pp.utils.test;

import com.moodanalyzer.pp.utils.test.MoodAnalyzerException.ExceptionType;

public class MoodAnalyser {
	String msg;
	public MoodAnalyser(String msg) {
		this.msg = msg;
	}
	public String analyseMood() throws MoodAnalyzerException {
		if("Hello".equals(msg))
			return "SAD";
		else if("Happy".equals(msg))
			return "HAPPY";
		else if(msg == null)
			throw new MoodAnalyzerException(ExceptionType.NULL, "Null value was encountered");
		else if(msg.length() == 0)
			throw new MoodAnalyzerException(ExceptionType.EMPTY, "Empty string ");
		return "";
	}
}

class MoodAnalyzerException extends Exception {
	public enum ExceptionType {
		IVALID, EMPTY,NULL
	}
	ExceptionType type;
	public MoodAnalyzerException(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}
}