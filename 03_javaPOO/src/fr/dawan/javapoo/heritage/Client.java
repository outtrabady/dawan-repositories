package fr.dawan.javapoo.heritage;

public class Client extends Utilisateur{
	
	private String numClient;
	private boolean subscribe;
	
	public Client() {
		
	}
	
	public Client(String numClient) {
		this.numClient = numClient;
	}
	
	public String getNumClient() {
		return this.numClient;
	}
	
	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}
	
	public boolean isSubscribe() {
		return this.subscribe;
	}
	
	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

}
