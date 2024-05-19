package com.blog.boardback.common;

public interface ResponseMessage {
    //HTTP Status 200
    String SUCCESS = "Success.";

    //HTTP Status 400
    String VALIDATION_FAILED = "Validation Failed.";
    String DUPLICATE_EMAIL = "Duplicate email.";
    String DUPLICATE_NICKNAME = "Duplicate tel number.";
    String DUPLICATE_TEL_NUMBER = "Duplicate nickname.";
    String NOT_EXISTED_USER = "This user does not exist.";
    String NOT_EXISTED_BOARD = "This board does not exist.";

    //HTTP Status 401
    String SIGN_IN_FAIL = "Login Information mismatch.";
    String AUTHORIZATION_FAIL = "Authorization Failed.";

    //HTTP Status 403
    String NO_PERMISSION = "Do not have permisson.";

    //HTTP Status 500
    String DATABASE_ERROR = "Database error.";
}
