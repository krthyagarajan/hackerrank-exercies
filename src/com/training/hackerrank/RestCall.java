package com.training.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestCall {

	public static int getNumDraws(int year) throws IOException {
		URL url = new URL("https://jsonmock.hackerrank.com/api/football_matches?year=2011&page=1");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept", "application/json");

		if (connection.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ connection.getResponseCode());
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(
				(connection.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			/*
			 * ObjectMapper mapper = new ObjectMapper(); Map obj = mapper.readValue(output,
			 * Map.class); System.out.println(obj.get("data"));
			 */
		}

		connection.disconnect();

		return 0;
	}
}
