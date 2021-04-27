package com.moodanalyzer.pp.utils.test;

public class MoodAnalyser {
	String msg;
	public MoodAnalyser(String msg) {
		this.msg = msg;
	}
	public String analyseMood() {
		if("Hello".equals(msg))
			return "SAD";
		else if("Happy".equals(msg))
			return "HAPPY";
		else if(msg == null)
			return "HAPPY";
		return "";
	}
}
