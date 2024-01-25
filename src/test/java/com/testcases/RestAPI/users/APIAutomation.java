package com.testcases.RestAPI.users;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.pojo.UsersPOJO;
import com.utility.Constant;
import com.utility.Util;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class APIAutomation {
    public static int id;

    @Test (priority = 1)
    public void getUser() throws Exception{
        RequestSpecification rs = RestAssured
                .given()
                .headers("Authorization", Constant.authToken);

        Response resp = rs
                .when()
                .get(Constant.endPoint + "/" + id)
                .thenReturn();

        resp.prettyPrint();
        resp.then().statusCode(200);
        String body = resp.body().asString();
        int oId = JsonPath.read(body,"$.id");
        Assert.assertEquals(id, oId);
    }

    @Test (priority = 2)
    public void deleteUser() throws Exception{
        RequestSpecification rs = RestAssured
                .given()
                .headers("Authorization", Constant.authToken);

        Response resp = rs
                .when()
                .delete(Constant.endPoint + "/" + id)
                .thenReturn();

        resp.prettyPrint();
        resp.then().statusCode(204);
    }

    @Test
    public void getAllUser() throws Exception{
        RequestSpecification rs = RestAssured
                .given()
                .headers("Authorization", Constant.authToken);

        Response resp = rs
                .when()
                .get(Constant.endPoint)
                .thenReturn();

        resp.prettyPrint();
        resp.then().statusCode(200);
        String body = resp.body().asString();
        List<Integer> ids = JsonPath.read(body,"$[*].id");
        Assert.assertTrue(ids.contains(id));

        LinkedHashMap<String, String> obj_0 = JsonPath.read(body,"$[0]");
        Assert.assertTrue(obj_0.containsValue("ppp1222"));
        Assert.assertTrue(obj_0.containsValue("ppp99971.pp@gmail.com"));
        Assert.assertTrue(obj_0.containsValue("male"));
        Assert.assertTrue(obj_0.containsValue("active"));

    }

    @Test
    public void createUser()throws Exception{

        // POST -> Request -> url + body + headers + authorization
        // Response -> status code; status line; response body; headers

        // object to string -> serialization
        // string to object -> de-serialization

        UsersPOJO u1 = new UsersPOJO("ppp1222", "male", "ppp99971.pp@gmail.com","active");
        RestAssured.baseURI = Constant.baseUrl;

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(u1);

        RequestSpecification rs = RestAssured
                .given()
                .header("Authorization",Constant.authToken)
                .header("Content-Type", "application/json")
                //.header("Content-Type", ContentType.JSON)
                .body(u1);

         Response resp = rs
                 .when()
                 .post(Constant.endPoint)
                 .thenReturn();

         resp.prettyPrint();
         resp.then().statusCode(201);
         resp.then().statusLine("HTTP/1.1 201 Created");
         String body = resp.body().asString(); // de-serialization
         id = JsonPath.read(body,"$.id");
         String name = JsonPath.read(body,"$.name");
         System.out.println(">>>>>> " + id);
         Assert.assertEquals(name, u1.getName());

    }

    @Test(priority = 1)
    public void updateUser()throws Exception{
        UsersPOJO u1 = new UsersPOJO("Pankaj", "male", "op.p8888p@gmail.com","active");
        RestAssured.baseURI = Constant.baseUrl;

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(u1);

        RequestSpecification rs = RestAssured
                .given()
                .header("Authorization",Constant.authToken)
                .header("Content-Type", "application/json")
                //.header("Content-Type", ContentType.JSON)
                .body(u1);

        Response resp = rs
                .when()
                .put(Constant.endPoint + "/" + id)
                .thenReturn();

        resp.prettyPrint();
        resp.then().statusCode(200);
        resp.then().statusLine("HTTP/1.1 200 OK");
        String body = resp.body().asString();
        String name = JsonPath.read(body,"$.name");
        Assert.assertEquals(name, u1.getName());
    }

//    @Test
//    public void createUser1()throws Exception{
//
//        UsersPOJO u1 = new UsersPOJO("ppp1222", "male", "ppp71.pp@gmail.com","active");
//        RestAssured.baseURI = Constant.baseUrl;
//
//        String payload = Util.convertToString(u1);
//        RequestSpecification rs = Util.RS_Post(payload);
//        Response resp = Util.R_Post(rs);
//        Util.validateStatusCode(resp,201);
//
//        resp.then().statusLine("HTTP/1.1 201 Created");
//        String body = resp.body().asString(); // de-serialization
//        int i = JsonPath.read(body,"$.id");
//        String name = JsonPath.read(body,"$.name");
//        System.out.println(">>>>>> " + i);
//
//        Assert.assertEquals(name, u1.getName());
//
//        /// GET
//
//        RequestSpecification rs1 = RestAssured
//                .given()
//                .headers("Authorization", Constant.authToken);
//
//        Response resp1 = rs1
//                .when()
//                .get(Constant.endPoint + "/" + i)
//                .thenReturn();
//
//        resp1.prettyPrint();
//        resp1.then().statusCode(200);
//        String body1 = resp1.body().asString();
//        int id = JsonPath.read(body1,"$.id");
//        Assert.assertEquals(i, id);
//
//    }
}
