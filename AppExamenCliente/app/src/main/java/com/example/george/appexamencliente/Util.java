package com.example.george.appexamencliente;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by George on 03/07/2016.
 */
public class Util {

    private Util() {
    }

    public static String execJsonGetRequest (String url) throws ClientProtocolException, IOException
    {
        HttpClient httpclient = new DefaultHttpClient();

        HttpGet httpGet = new HttpGet("http://192.168.0.8:8080/ApiServicesCliente/service/"+url);
        httpGet.setHeader("content-type","application/json");

        HttpResponse response = httpclient.execute(httpGet);

        String jsonResult = EntityUtils.toString(response.getEntity());
        return jsonResult;
    }

}
