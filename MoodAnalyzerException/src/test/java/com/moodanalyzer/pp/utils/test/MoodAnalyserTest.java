package com.moodanalyzer.pp.utils.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.moodanalyzer.pp.utils.test.MoodAnalyzerException.ExceptionType;

public class MoodAnalyserTest {
	@Test
	public void moodAnalyzerShouldReturnSad() throws MoodAnalyzerException {
		MoodAnalyser mood = new MoodAnalyser("Hello");
		String moods = mood.analyseMood();
		assertEquals("SAD",moods);
	}
	@Test
	public void moodAnaylyzerShouldReturnHappy() throws MoodAnalyzerException {
		MoodAnalyser mood = new MoodAnalyser("Happy");
		String moods = mood.analyseMood();
		assertEquals("HAPPY",moods);
	}
	@Test
	public void moodAnaylyzerWhenNullShouldThrowException() throws MoodAnalyzerException {
		MoodAnalyser mood = new MoodAnalyser(null);
		try {
			mood.analyseMood();	
		}catch(MoodAnalyzerException e) {
			assertEquals(ExceptionType.NULL, e.type);
		}
	}
	@Test
	public void moodAnaylyzerWhenEmptyShouldReturnHappy() throws MoodAnalyzerException {
		MoodAnalyser mood = new MoodAnalyser("");
		try {
			mood.analyseMood();	
		}catch(MoodAnalyzerException e) {
			assertEquals(ExceptionType.EMPTY, e.type);
		}
	}
}