package com.google.oacurl.oauth;

import net.oauth.OAuthConsumer;

public class OAuthAccessor extends net.oauth.OAuthAccessor {
	private static final long serialVersionUID = 1L;
	
	public String tokenRefresh = "";
	
	public OAuthAccessor(OAuthConsumer consumer) {
		super(consumer);
	}
}
