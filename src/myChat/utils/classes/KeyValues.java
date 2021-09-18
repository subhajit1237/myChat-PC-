package myChat.utils.classes;

public class KeyValues {
	
	public static final String KEY_QUERY = "query";
    public static final String KEY_RESPONSE_MESSAGE = "response_message";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_RESPONSE_CODE = "response_code";
    public static final String KEY_SENDER = "sender";
    public static final String KEY_MESSAGE = "message";

    public static final int RESPONSE_CODE_SUCCESS = 1;
    public static final int RESPONSE_CODE_FAILURE = 2;

    public static final int QUERY_SEND_BIO = 7;
    public static final int QUERY_LOGIN_REQUEST = 3;   // Sent from the client to request a login 
    public static final int QUERY_SIGNUP_REQUEST = 4;  // Sent from the client to request a signup
    public static final int QUERY_SEND_MESSAGE = 5;

}
