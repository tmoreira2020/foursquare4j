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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.thiagomoreira.foursquare.gson.ResponseDeserializaer;
import br.com.thiagomoreira.foursquare.model.Response;
import br.com.thiagomoreira.foursquare.model.Venue;
import br.com.thiagomoreira.foursquare.security.FoursquareAuthorizationInterceptor;
import br.com.thiagomoreira.foursquare.service.VenueService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Foursquare {

	protected VenueService venueService;

	public Foursquare(String clientId, String clientSecret) {
		this(clientId, clientSecret, null, false);
	}

	public Foursquare(String accessToken) {
		this(null, null, accessToken, false);
	}

	public Foursquare(String clientId, String clientSecret, String accessToken,
			boolean debug) {
		this(clientId, clientSecret, accessToken,
				"https://api.foursquare.com/", debug);
	}

	Foursquare(String clientId, String clientSecret, String accessToken,
			String baseUrl, boolean debug) {
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.registerTypeAdapter(new TypeToken<Response>() {
		}.getType(), new ResponseDeserializaer()).create();

		OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();

		if (debug) {
			HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

			interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

			httpClientBuilder.addInterceptor(interceptor);
		}

		httpClientBuilder
				.addInterceptor(new FoursquareAuthorizationInterceptor(
						clientId, clientSecret, accessToken));

		Retrofit.Builder builder = new Retrofit.Builder();
		Retrofit retrofit = builder.baseUrl(baseUrl)
				.addConverterFactory(GsonConverterFactory.create(gson))
				.client(httpClientBuilder.build()).build();

		venueService = retrofit.create(VenueService.class);
	}

	public Venue getVenue(String venueId) throws IOException {
		Call<Response> call = venueService.getVenue(venueId);

		retrofit2.Response<Response> response = call.execute();
		Response response2 = response.body();

		if (response.isSuccessful()) {

			return (Venue) response2.getResponse();
		} else {
			throw new IOException(response2.getMeta().getErrorDetail());
		}
	}

}
