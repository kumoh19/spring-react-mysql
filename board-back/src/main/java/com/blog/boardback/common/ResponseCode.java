package com.blog.boardback.common;

public interface ResponseCode {
    //HTTP Status 200
    String SUCCESS = "SU";

    //HTTP Status 400
    String VALIDATION_FAILED = "VF";
    String DUPLICATE_EMAIL = "DE";
    String DUPLICATE_NICKNAME = "DN";
    String DUPLICATE_TEL_NUMBER = "DT";
    String NOT_EXISTED_USER = "NU";
    String NOT_EXISTED_BOARD = "NB";

    //HTTP Status 401
    

    //HTTP Status 403

    //HTTP Status 500
}
