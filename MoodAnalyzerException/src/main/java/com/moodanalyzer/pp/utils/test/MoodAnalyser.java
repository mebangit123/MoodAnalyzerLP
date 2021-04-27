package com.moodanalyzer.pp.utils.test;

public class MoodAnalyser {
	public String analyseMood(String msg) {
		if("Hello".equals(msg))
			return "SAD";
		else if("Happy".equals(msg))
			return "HAPPY";
		else
			return null;
	}
}
