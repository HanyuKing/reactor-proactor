package com.why.proactor;

import java.io.IOException;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class WriteCompletionHandler implements
        CompletionHandler<Integer, SessionState> {
 
  private AsynchronousSocketChannel socketChannel;
 
  public WriteCompletionHandler(
    AsynchronousSocketChannel socketChannel) {
    this.socketChannel = socketChannel;
  }
 
  @Override
  public void completed(
    Integer bytesWritten, SessionState attachment) {
    try {

      Thread.sleep(5000);
      socketChannel.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 
  @Override
  public void failed(Throwable exc, SessionState attachment) {
   // Handle write failure.....
  }
 
}