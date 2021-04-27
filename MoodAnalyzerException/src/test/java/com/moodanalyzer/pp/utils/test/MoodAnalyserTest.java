package com.moodanalyzer.pp.utils.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void moodAnalyzerShouldReturnSad() {
		MoodAnalyser mood = new MoodAnalyser("Hello");
		String moods = mood.analyseMood();
		assertEquals("SAD",moods);
	}
	@Test
	public void moodAnaylyzerShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser("Happy");
		String moods = mood.analyseMood();
		assertEquals("HAPPY",moods);
	}
	@Test
	public void moodAnaylyzerWhenNullShouldReturnHappy() {
		MoodAnalyser mood = new MoodAnalyser(null);
		String moods = mood.analyseMood();
		assertEquals("HAPPY",moods);
	}
}