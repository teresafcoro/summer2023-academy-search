package co.empathy.academy.search.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SearchController {

    @Value("${elasticsearch.cluster-name}")
    private String clusterName;

    @GetMapping("/search")
    public HashMap<String, String> search(@RequestParam String query) {
        HashMap<String, String> response = new HashMap<>();
        response.put("query", query);
        response.put("clusterName", clusterName);
        return response;
    }
}
