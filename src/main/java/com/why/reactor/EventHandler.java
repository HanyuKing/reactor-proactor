package com.why.reactor;

import java.nio.channels.SelectionKey;

public interface EventHandler {
 
   public void handleEvent(SelectionKey handle) throws Exception;
 
}