package org.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://jsonplaceholder.typicode.com/posts/1");

        Invocation.Builder request = target.request();

        Response response = request.get();
        Post post = response.readEntity(Post.class);

        System.out.println(response.getStatus());
        System.out.println(post);

    }
}
