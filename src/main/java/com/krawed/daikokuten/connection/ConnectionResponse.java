package com.krawed.daikokuten.connection;

import java.util.Map;
import lombok.Data;

@Data
public class ConnectionResponse {

  //TODO CHANGE TO RESPONSE OF HTTP CLIENT
  private final String httpResponse;
  private final Map<String, String> cookies;
}
