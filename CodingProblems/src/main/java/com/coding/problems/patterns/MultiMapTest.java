package com.coding.problems.patterns;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/abc")
public class MultiMapTest {

	@Value("#{${valuesMap}}")
	private Map<String, Integer> valuesMap;

	@Value("${HOME}")
	private String homeDir;

//	public static void main(String[] args) {
//		MultiMapTest multiMapTest = new MultiMapTest();
//		multiMapTest.test();
//	}

	@GetMapping("/test")
	public void test() {
		System.out.println("Value" + homeDir);
		for (Entry<String, Integer> entry : valuesMap.entrySet()) {

			System.out.println("Value" + entry.getKey());
		}

	}

}
