package request_repository;

import java.io.IOException;
import java.util.ArrayList;

import common_Methods.getdata;

public class Patch_request_repository {
	public static String baseuri()
	{
		String baseuri="https://reqres.in/";
		return baseuri;
	}
	public static String resource()
	{
		String resource = "api/users/2";
		return resource;
	}
	
	public static String Patch_request_tc1() throws IOException
	{
		 ArrayList<String> data=getdata.getDataExcel("patch_data","tc_1");
			System.out.println(data);
			String Name =data.get(2);
			String Job =data.get(3);

		String requestBody="{\r\n"
				+ "    \"name\": \""+Name+"\",\r\n"
				+ "    \"job\": \""+Job+"\"\r\n"
				+ "}";
		return requestBody;
	}

}
