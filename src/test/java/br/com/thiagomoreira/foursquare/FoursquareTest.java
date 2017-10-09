/**
 * Copyright © 2017 Thiago Moreira (tmoreira2020@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.thiagomoreira.foursquare;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import br.com.thiagomoreira.foursquare.model.Venue;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okio.Buffer;

public class FoursquareTest {

	@Test
	public void getVenue() throws IOException {
		Foursquare untappd = new Foursquare(null, null, null,
				setup("/get-venue-test.json"), true);

		String venueId = "54f20825498efed69cf8f493";
		Venue venue = untappd.getVenue(venueId);

		Assert.assertNotNull(venue);
		Assert.assertEquals(venueId, venue.getId());;
	}

	@Test
	public void getVenueWithError() throws IOException {
		Foursquare untappd = new Foursquare(null, null, null,
				setup("/get-venue-with-error-test.json"), true);

		String venueId = "58658d5a9debdf61595fda8bc";

		try {
			untappd.getVenue(venueId);
		} catch (Exception e) {
			Assert.assertEquals(
					"Value 58658d5a9debdf61595fda8bc is invalid for venue id",
					e.getMessage());;
		}

	}

	protected String setup(String jsonPath) throws IOException {
		MockWebServer server = new MockWebServer();
		Buffer buffer = new Buffer();

		buffer.readFrom(getClass().getResourceAsStream(jsonPath));

		server.enqueue(new MockResponse().setBody(buffer));

		server.start();

		return server.url("/").toString();
	}

}
