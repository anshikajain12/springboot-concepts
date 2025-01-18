package com.springbootproject.HATEOAS;

import lombok.Data;

@Data
public class HateoasUserResponse extends HateoasLinks {
    private String userId;
    private String name;
    private String verifyStatus;

    public HateoasUserResponse(String userId, String name, String verifyStatus) {
        this.userId = userId;
        this.name = name;
        this.verifyStatus = verifyStatus;
    }
}

