package myChat.controller;

import java.util.HashMap;

import myChat.utils.classes.CredentialNetwork;
import myChat.utils.classes.KeyValues;
import myChat.utils.interfaces.CredentialNetworkListener;
import static myChat.utils.classes.Hash.hashUp;

public class LoginGUIController implements CredentialNetworkListener{
	
	private CredentialNetwork credentialNetwork;
	
	public LoginGUIController() {
		credentialNetwork = new CredentialNetwork(this);
	}
	
	public void onLoginClicked(String username, String password) {
		HashMap<String, Object> message = new HashMap<>();
		password = hashUp(password);
		message.put(KeyValues.KEY_QUERY, KeyValues.QUERY_LOGIN_REQUEST);
        message.put(KeyValues.KEY_USERNAME, username);
        message.put(KeyValues.KEY_PASSWORD, password);
        credentialNetwork.attemptLogin(message);
	}

	@Override
	public void onConnectionUnSuccessful(String message) {
		System.out.println(message);
	}

	@Override
	public void onErrorWhileOperation(String message) {
		System.out.println(message);
	}

	@Override
	public void onOperationSuccessful(String message) {
		System.out.println(message);
	}

}
