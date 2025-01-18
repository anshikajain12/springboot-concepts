package com.springbootproject.HATEOAS;

import org.springframework.hateoas.Link;

import java.util.ArrayList;
import java.util.List;

public class HateoasLinks {
    private List<Link> links = new ArrayList<>();

    public void addLinks(Link link) {
        links.add(link);
    }
}
