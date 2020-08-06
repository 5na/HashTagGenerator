package com.hashtag.pgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HashTagGenerator {

	public static List<String> getHashTag(String str) {
		return Arrays.stream(str.replaceAll(",","").split(" ")).sorted(Comparator.comparingInt(String::length).reversed())
				.limit(3).map(s -> "#" + s).collect(Collectors.toList());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the headline : ");
		String str = reader.readLine();
		List<String> hashTagList = getHashTag(str);
        System.out.println(hashTagList);
	}
}
