package myChat.utils.interfaces;

public interface CredentialNetworkListener {
	
	// Gets triggered if the connection was unsuccessful. Returns a message.
    void onConnectionUnSuccessful(String message);

    // Gets triggered when some error has been encountered while attempting to login
    void onErrorWhileLogin(String message);

    //Gets triggered if login was successful
    void onSuccessfulLogin(String message);
    
}