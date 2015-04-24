package de.kumbeiz.goeuro;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;

import de.kumbeiz.goeuro.model.Location;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws URISyntaxException,
			ClientProtocolException, IOException {
		if (args.length < 1) {
			System.out.println("No location provided!");
		}
		if (args.length > 1) {
			System.out.println("Too much parameters!");
		}
		String locationParam = args[0];

		URI uri = new URIBuilder().setScheme("http").setHost("api.goeuro.com")
				.setPath("/api/v2/position/suggest/en/" + locationParam)
				.build();

		HttpGet httpGet = new HttpGet(uri);

		HttpClient httpClient = HttpClients.createDefault();
		HttpResponse response = httpClient.execute(httpGet);
		HttpEntity entity = response.getEntity();

		ObjectMapper mapper = new ObjectMapper();

		Location[] locations = mapper.readValue(entity.getContent(),
				Location[].class);

		CSVWriter writer = new CSVWriter(new FileWriter("Result.csv"), '\t');

		for (Location location : locations) {
			String[] entry = { location.getId() + "", location.getName(),
					location.getType(),
					location.getGeo_position().getLatitude() + "",
					location.getGeo_position().getLongitude() + "" };
			writer.writeNext(entry);
		}
		writer.close();

	}
}
