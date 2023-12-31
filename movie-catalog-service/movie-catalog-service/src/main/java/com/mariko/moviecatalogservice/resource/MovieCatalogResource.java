package com.mariko.moviecatalogservice.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mariko.moviecatalogservice.models.CatalogItem;



@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalogItems(@PathVariable("userId") String userId) {
        return Collections.singletonList(
            new CatalogItem("Transformer", "Test",  6)
        );

    }
}
