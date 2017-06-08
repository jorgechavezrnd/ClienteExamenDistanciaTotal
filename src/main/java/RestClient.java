import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Random;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;


public class RestClient {
    public static void main(String[] args) {
        dato1();
        dato2();
        dato3();
        dato4();
        dato5();
        dato6();
        dato7();
        dato8();
        dato9();
        dato10();
        dato11();
        dato2000();
    }

    public static void dato1() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 1.0f;
            Float longitude = 1.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato2() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 2.0f;
            Float longitude = 2.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato3() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 3.0f;
            Float longitude = 3.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato4() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 4.0f;
            Float longitude = 4.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato5() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 5.0f;
            Float longitude = 5.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato6() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 6.0f;
            Float longitude = 6.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato7() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 7.0f;
            Float longitude = 7.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato8() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 8.0f;
            Float longitude = 8.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato9() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 9.0f;
            Float longitude = 9.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato10() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 10.0f;
            Float longitude = 10.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    // CASO QUE SUPERA LOS 1000m DE DISTANCIA

    public static void dato11() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 11.0f;
            Float longitude = 11.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void dato2000() {
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();

            HttpPost postRequest = new HttpPost(
                    "http://localhost:8080/band");

            ArrayList<NameValuePair> postParameters;

            postParameters = new ArrayList<NameValuePair>();
            Random rand = new Random();

            Integer  step = 10;
            Integer bpms = 20;
            Integer distances = 30;
            Float latitude = 2000.0f;
            Float longitude = 2000.0f;
            Integer calories = 18;

            postParameters.add(new BasicNameValuePair("steps",step.toString()));
            postParameters.add(new BasicNameValuePair("bpm", bpms.toString()));
            postParameters.add(new BasicNameValuePair("distance", distances.toString()));
            postParameters.add(new BasicNameValuePair("latitude", latitude.toString()));
            postParameters.add(new BasicNameValuePair("longitude", longitude.toString()));
            postParameters.add(new BasicNameValuePair("calories", calories.toString()));
            postParameters.add(new BasicNameValuePair("user", "2"));

            postRequest.setEntity(new UrlEncodedFormEntity(postParameters));
            postRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}