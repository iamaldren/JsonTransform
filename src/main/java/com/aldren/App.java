package com.aldren;

import com.aldren.transformation.JsonTransform;
import io.vertx.core.json.JsonObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JsonObject json = new JsonObject();
        json.put("studentId", "200610464");
        json.put("studentName", "John Doe");
        json.put("studentAge", 20);
        json.put("studentStatus", 1);
        json.put("studentSection", 0);
        json.put("studentOrganization", "Dance Wars");
        json.put("studentGPA", "1.69");

        JsonTransform transform = new JsonTransform();
        System.out.println(transform.joltTransform(json.toString()));
    }
}
