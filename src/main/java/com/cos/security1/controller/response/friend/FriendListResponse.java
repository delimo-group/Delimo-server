package com.cos.security1.controller.response.friend;

import com.cos.security1.controller.status.ResponseMessage;
import com.cos.security1.controller.status.StatusCode;
import lombok.Builder;
import lombok.Data;


@Data
public class FriendListResponse {
    int code;
    String message;
    Object data;


    public FriendListResponse() {
        this.code = StatusCode.OK;
        this.message = ResponseMessage.FRIEND_LIST_SUCCESSFUL;
        this.data = null;
    }

    @Builder
    public FriendListResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
