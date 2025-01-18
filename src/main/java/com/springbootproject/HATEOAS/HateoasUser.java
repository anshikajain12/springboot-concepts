package com.springbootproject.HATEOAS;

import org.springframework.stereotype.Controller;

@Controller
public class HateoasUser {
    public HateoasUserResponse getUser() {
        HateoasUserResponse response = new HateoasUserResponse(
                "123",
                "ABC",
                "UNVERIFIED"
        );
        return response;
    }
}
