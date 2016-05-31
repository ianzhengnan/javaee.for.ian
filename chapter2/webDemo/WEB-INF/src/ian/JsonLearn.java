package ian;

import javax.json.*;

public class JsonLearn{

	public static void main(String[] args) {
		
		/*JsonArray value = Json.createArrayBuilder()
	     .add(Json.createObjectBuilder()
	         .add("type", "home")
	         .add("number", "212 555-1234"))
	     .add(Json.createObjectBuilder()
	         .add("type", "fax")
	         .add("number", "646 555-4567"))
	     .build();*/

		JsonArrayBuilder jb = Json.createArrayBuilder();

		jb.add(Json.createObjectBuilder()
				.add("type", "home")
				.add("number", "021-21231231"))
			.add(Json.createObjectBuilder()
				.add("type", "fax")
				.add("number", "13762538768"));

		JsonArray value = jb.build(); 

		System.out.println(value);

	}
}