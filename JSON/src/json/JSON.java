package json;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;
import org.json.simple.JSONObject;


/**
 *
 * @author Randy Beckford
 */
 class JSON {

   public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   JSONObject obj1 = new JSONObject();
	   Contact contact1 = new Contact();
	   Contact contact2 = new Contact();
           
	  contact1.firstname = "Mark";
          contact1.lastname = "Johnson";
          contact1.email = "mj@gmail.com";
          contact1.phone = "1234567889";
          	   
	  obj1.put("lastName", contact1.lastname);
          obj1.put("firstName", contact1.firstname);
          obj1.put("email", contact1.email);
          obj1.put("phone", contact1.phone);
                  
	  
	  contact2.firstname = obj1.get("firstname").toString();
	  contact2.lastname= obj1.get("lastname").toString();
	  contact2.email= obj1.get("email").toString();
	  contact2.phone= obj1.get("phone").toString();
          
         System.out.print(obj1);	  
         System.out.println(contact1);
         System.out.println(contact2);
         
  String urlString = "https://jsonplaceholder.typicode.com/posts/1";       
         try {
// Send JSON
    URL url = new URL(urlString);
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setDoOutput(true);
    connection.setRequestProperty("content-type", "application/json; charset=utf-8");
    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
     wr.write(obj1.toString());
// Receive JSON
    InputStream is = new URL(urlString).openStream();
    BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
    StringBuilder sb = new StringBuilder();
    int counter;
    while ((counter = reader.read()) != -1) {
    sb.append((char) counter);
}
    String jsonString = sb.toString();
    is.close();
    System.out.println(jsonString);
}   catch (Exception e) {
    System.out.println(e);
}

   }
   
   
}