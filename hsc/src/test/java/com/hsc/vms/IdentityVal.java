package com.hsc.vms;

import org.json.JSONObject;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class IdentityVal

{
	@Test(priority = 1, enabled = true)
	public void generateToken() {
		try {

			JSONObject requestBody = new JSONObject();
			requestBody.put("username", "admin");
			requestBody.put("password", "Alert1234");

			String endpoint = "http://192.168.192.184/api/auth/token";
			System.out.println("Response body in string---------: " + requestBody.toString());

			ValidatableResponse response = given().queryParam("grant_type", "password")
					.header("Content-Type", "application/json").body(requestBody.toString()).when().post(endpoint)
					.then().statusCode(200);

			response.log().body();
			System.out.println("Successfully generated the access token ********");

			String token = response.extract().path("access_token");

			System.out.println("access_token**********: " + token);

		} catch (

		Exception e) {
			e.printStackTrace();

		}
	}

	public void createIdentity() {
		try {
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
