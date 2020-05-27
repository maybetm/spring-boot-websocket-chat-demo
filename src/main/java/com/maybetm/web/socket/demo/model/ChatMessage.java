package com.maybetm.web.socket.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by rajeevkumarsingh on 24/07/17.
 */
@Getter
@Setter
public class ChatMessage
{

  private MessageType type;
  private String content;
  private String sender;

  public enum MessageType
  {
    CHAT,
    JOIN,
    LEAVE
  }
}
