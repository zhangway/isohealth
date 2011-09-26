package com.isobar.isohealth.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.isobar.isohealth.GraphConstants;
import com.isobar.isohealth.models.Profile;
import com.isobar.isohealth.models.User;

public class ProfileService {
	public static Profile getProfile(String code) throws Exception {
		//User object contains URLs
		User user = UserService.getUser(code);
		ObjectMapper mapper = new ObjectMapper(); 
		String url = GraphConstants.REST_URL + user.getProfile();
		HttpURLConnection conn  = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestProperty("Accept", GraphConstants.MEDIA_PROFILE);
		conn.setRequestProperty("Authorization", "Bearer " + code);

		if (conn.getResponseCode() != 200) {
			throw new IOException(conn.getResponseMessage());
		}

		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		Profile profile = mapper.readValue(rd, Profile.class);
		conn.disconnect();
		return profile;
	}
}