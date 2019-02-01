package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import com.google.gson.*;
import model.Account;

public class AccountDAO {
    public ArrayList<Account> retrieveAllResults(String customerId){
        ArrayList<Account> results = new ArrayList<Account>();
        String line;
        String response = "";

        URL url;
        HttpURLConnection con = null;
        StringBuilder tokenUrl;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader reader = null;

        try {
            // Retrieve results from DB
            url = new URL("https://techtrek-api-gateway.cfapps.io/accounts/deposit");
//            url = new URL("http://159.65.23.28:5000/selectAllMS");
            con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("GET");
            con.setRequestProperty("identity", "O4");
            con.setRequestProperty("token", "aa9a045b-4279-4d49-b099-d322a2eaecac");

            // Set Parameters in URL
            tokenUrl = new StringBuilder();
            // Table Name
            tokenUrl.append(URLEncoder.encode(customerId, "UTF-8"));

            outputStreamWriter = new OutputStreamWriter(con.getOutputStream());
            outputStreamWriter.write(tokenUrl.toString());
            outputStreamWriter.flush();

            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while((line = reader.readLine()) != null){
                response += line;
            }

            // Convert string result to JSON Object

            //Create GSON object
            Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
            JsonObject json = (JsonObject) new com.google.gson.JsonParser().parse(response);
            JsonArray jArray = json.getAsJsonArray();

            if (jArray != null && jArray.size() != 0){
                // Add all pilot info
                Account r = new Account();
                for (int i = 0; i < jArray.size(); i++){
                    JsonObject resultInfo = (JsonObject) jArray.get(i);
                    JsonElement accountId = resultInfo.get("accountId");
                    JsonElement type = resultInfo.get("type");
                    JsonElement displayName = resultInfo.get("displayName");
                    JsonElement accountNumber = resultInfo.get("accountNumber");

                    r.setAccountId(accountId.getAsInt());
                    r.setType(type.getAsString());
                    r.setDisplayName(displayName.getAsString());
                    r.setAccountNumber(accountNumber.getAsInt());

                    results.add(r);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStreamWriter!=null){
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(con!=null) {
                con.disconnect();
            }
        }
        return results;
    }
}
