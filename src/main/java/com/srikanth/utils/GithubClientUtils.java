package com.srikanth.utils;


import com.srikanth.model.Commit;
import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class GithubClientUtils {

    private String ownerName;
    private String repoName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public int getCommits(String ownerName, String repoName) {

        this.ownerName = ownerName;
        this.repoName = repoName;

        String url = "https://api.github.com/repos/" + ownerName + "/" + repoName + "/commits";

        RestTemplate restTemplate = new RestTemplate();

       ResponseEntity<List<Commit>> responseEntity = restTemplate.exchange(url, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Commit>>() {
        });



        return responseEntity.getBody().size();



    }


}
