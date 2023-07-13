package com.masai;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ApiFetchMain {

	public static void main(String[] args) {
		 CloseableHttpClient httpClient = HttpClients.createDefault();

	        try {
	            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/todos"); // Replace with your API endpoint URL
	            CloseableHttpResponse response = httpClient.execute(request);

	            try {
	                HttpEntity entity = response.getEntity();
	                String responseBody = EntityUtils.toString(entity);

	                // Process the response body here
	                System.out.println(responseBody);
	            } finally {
	                response.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                httpClient.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	}
}
