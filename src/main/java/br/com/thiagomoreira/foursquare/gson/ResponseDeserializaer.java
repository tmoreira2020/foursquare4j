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
package br.com.thiagomoreira.foursquare.gson;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import br.com.thiagomoreira.foursquare.model.Meta;
import br.com.thiagomoreira.foursquare.model.Response;
import br.com.thiagomoreira.foursquare.model.Venue;

public class ResponseDeserializaer implements JsonDeserializer<Response> {

	@Override
	public Response deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {

		JsonObject rootJsonObject = json.getAsJsonObject();
		Meta meta = context.deserialize(rootJsonObject.get("meta"), Meta.class);
		Response response = new Response();

		response.setMeta(meta);;

		JsonObject responseJsonObject = rootJsonObject.get("response")
				.getAsJsonObject();

		if (responseJsonObject.has("venue")) {
			Venue venue = context.deserialize(responseJsonObject.get("venue"),
					Venue.class);

			response.setResponse(venue);
		}

		return response;
	}
}
