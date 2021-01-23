package com.krawed.daikokuten.connection;

import java.util.Map;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConnectionRequest {

  private final String url;
  //TODO Prepare different types of request body
  private final Map<String, String> body;
  private final Map<String, String> headers;
  private final Map<String, String> cookies;

}
