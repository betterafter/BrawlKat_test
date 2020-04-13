import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class BrawlStarsAPI {

    public void ShowPlayerInformation(String accessToken, String urls){
        try{

            URL url = new URL(urls);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + accessToken);

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));

            String line, data = "";
        
            while((line = in.readLine()) != null){
                data = data.concat(line);
                //System.out.println(line);
            }

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(data);
            JSONArray myBrawler = (JSONArray) jsonObject.get("brawlers");


            System.out.println("-------------------------" +  jsonObject.get("name") + "-------------------------");
            System.out.println("현재 트로피 : " + jsonObject.get("trophies") + "      " + "최대 트로피 : " + jsonObject.get("highestTrophies"));
            System.out.println("3 vs 3 : " + jsonObject.get("3vs3Victories" + "      " + "솔로 : " + jsonObject.get("soloVictories")
            + "      " + "듀오 : " + jsonObject.get("duoVictories")));

            System.out.println("-------------------------내 브롤러 정보-------------------------");
            for(int i = 0; i < myBrawler.size(); i++){
                JSONObject object = (JSONObject)myBrawler.get(i);
                System.out.println("-----" + object.get("name") + "-----");
                System.out.println("파워 레벨 : " + object.get("power") + "      " + "랭크 : " + object.get("power"));
                System.out.println("현재 트로피 : " + object.get("trophies") + "      " + "최대 트로피 : " + object.get("highestTrophies"));
                System.out.println("----------\n\n");

            }
            

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}