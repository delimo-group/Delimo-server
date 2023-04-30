package com.cos.security1.controller.status;

public class ResponseMessage {
    public static final String LOGIN_SUCCESS = "인증 성공";
    public static final String LOGIN_FAILED = "인증 실패";
    public static final String SIGNIN_SUCCESS = "회원 가입 성공";
    public static final String EMAIL_OK = "사용 가능한 이메일입니다.";
    public static final String RESOLUTION_UPDATED = "다짐이 수정되었습니다.";
    public static final String EMAIL_EXISTED = "이미 사용 중인 이메일입니다.";
    public static final String NOT_FOUND_USER = "회원을 찾을 수 없습니다.";
    public static final String UNAUTHORIZED = "회원 인증 실패";
    public static final String MEMBER_INFO_SUCCESS = "회원의 정보를 성공적으로 불러왔습니다.";
    public static final String FRIEND_REQUESTED_SUCCESS = "친구 신청을 성공적으로 보냈습니다.";
    public static final String FRIEND_NOT_FOUND = "친구 검색에 실패했습니다.";
    public static final String REQUEST_EXISTED = "친구 신청이 이미 완료됐습니다.";
    public static final String REQUEST_FAILED = "자기 자신에게 친구 신청을 보낼 수 없습니다.";
    public static final String FRIEND_FOUND = "친구 검색 성공";
    public static final String INTERNAL_SERVER_ERROR = "서버 내부 에러";
    public static final String DB_ERROR = "데이터 베이스 에러";
    public static final String API_CALL_ERROR = "API 호출 실패";
    public static final String API_CALL_SUCCESS = "API 호출 성공";
}
