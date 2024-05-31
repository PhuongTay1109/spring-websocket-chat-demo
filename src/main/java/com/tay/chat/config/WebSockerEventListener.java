package com.tay.chat.config;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSockerEventListener {
	
	// listen to all the session disconnect event
	
	@EventListener
	public void handleWebSockerDisconnectEvent(SessionDisconnectEvent event) {

	}

}
