import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
class HttpURLConnectionExample{
public static void main(String arg[]){
	try{
			  //URL url = new URL("https://reqres.in/api/users?page=2");
				URL url = new URL("http://www.example.com/api/get/1");

				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();

				int code = connection.getResponseCode();
		
				 if (code == HttpURLConnection.HTTP_OK) {// status 200
					Scanner s = new Scanner(url.openStream());
				while (s.hasNextLine()) {
					System.out.println(s.nextLine());
					break;
				} 
				}else if(code == HttpURLConnection.HTTP_NOT_FOUND){//status 404
					
					System.out.println(code);
				}else{//other than 200 and 400
				   System.out.println(code);
				}
		
	}catch(Exception e){}
}
}