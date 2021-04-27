package com.moodanalyzer.pp.utils.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void moodAnalyzerShouldReturnSad() {
		MoodAnalyser mood = new MoodAnalyser();
		String moods = mood.analyseMood("Hello");
		assertEquals("SAD",moods);
	}
	@Test
	public void moodAnaylyzerShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser();
		String moods = mood.analyseMood("Happy");
		assertEquals("HAPPY",moods);
	}
}