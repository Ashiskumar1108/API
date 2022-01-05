import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

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
                .body("fairings",equalTo(null)).

                and().


            header("content-length", equalTo("972")).

                and()

                .statusCode(200);
    }
}
