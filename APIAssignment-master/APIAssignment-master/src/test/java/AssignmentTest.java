import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AssignmentTest {

    private String url= "https://api.spacexdata.com/v4/launches/latest";


    @Test
    public void assignmentTest(){
        given()
                .log().all().
        when()
                .get(url).
        then()
                .log().body()
                .assertThat()
                .body("fairings.recovery_attempt",equalTo(null))
                .statusCode(200);
    }
}
