package org.prog.testng;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.prog.dto.PersonDto;
import org.prog.dto.ResultsDto;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.containsString;

public class RestTests {

    //https://randomuser.me/api/?inc=gender,name,nat,id&noinfo
    //TODO: Add IdDto class (describing "id" field of a person)
    // add new Dto to existing PersonDto class
    // print "name" and "value" from IdDto

    @Test
    public void getRandomPersonTest() {
        RestAssured.baseURI = "https://randomuser.me/";
//        Response response =
//                RestAssured.get("api/?inc=gender,name,nat&noinfo");
//
//        response.prettyPrint();
//
//        ValidatableResponse vr = response.then();
//
//        vr.statusCode(200);
//        vr.contentType(ContentType.JSON);

        RequestSpecification rs = RestAssured.given()
                .header("X-Client", "prog qutomation")
                .body("reqeust body")
                .queryParam("inc", "gender,name,nat")
                .queryParam("noinfo")
                .queryParam("results", 10)
                .basePath("api/");
        rs.auth().basic("user", "password");

        Response r = rs.get();

        r.prettyPrint();

        r.then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body(containsString("gender"));

        ResultsDto dto = r.as(ResultsDto.class);
        System.out.println(dto.getResults().size());
        Assert.assertEquals(dto.getResults().size(), 10);
        boolean anyFemalePresent = false;
        for (PersonDto p : dto.getResults()) {
            if (p.getGender().equals("female")) {
                anyFemalePresent = true;
                break;
            }
        }
        Assert.assertTrue(anyFemalePresent, "No males found");
    }
}
