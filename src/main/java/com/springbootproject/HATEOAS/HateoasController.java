package com.springbootproject.HATEOAS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hateoas")
public class HateoasController {
    @Autowired
    HateoasUser user;

    @PostMapping(path = "/adduser")
    public ResponseEntity<HateoasUserResponse> addUser() {
        HateoasUserResponse response = user.getUser();

        //our business logic to determine which verify API need to be invoked.
        Link verifyLink = WebMvcLinkBuilder.linkTo(HateoasController.class)
                .slash("sms-verify-finish")
                .slash(response.getUserId())
                .withRel("verify")
                .withType("POST");
//        Link verifyLink = Link.of("/api/hateoas/sms-verify-finish/" + response.getUserId())
//                .withRel("verify")
//                .withType("POST");
        response.addLinks(verifyLink);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
