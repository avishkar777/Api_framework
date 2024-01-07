package endpoints;

import io.restassured.response.Response;
import payload.CreateUser;
import utilities.ReadPropertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static io.restassured.RestAssured.*;

public class CandidateEndpoints {

    private String Token=ReadPropertiesFiles.getProperty("token");
    public Response GetCandidates(){
        Response res=
                given()
                        .header("Authorization","Bearer "+Token).
                when()
                        .get(Routes.getAllCandidate_url);
        return res;
    }
    public Response SearchCandidate(Map<String,String> hs){
        Response res=
                given()
                        .header("Authorization","Bearer "+Token)
                        .queryParams(hs).
                when()
                        .get(Routes.searchCandidate_url);

        return res;

    }

    public Response SearchCandidateBySlug(String slug_id){
        Response res=
                given()
                        .header("Authorization","Bearer "+Token)
                        .pathParam("Candidate_slug",slug_id).
                when()
                        .get(Routes.searchCandidateBySlug);
        return res;
    }

    public Response HiringStageOfCandidate()
}