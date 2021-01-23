package com.krawed.daikokuten.connection;

import lombok.Data;
import org.jsoup.nodes.Document;

@Data
public class HtmlResponse {

  private final ConnectionResponse connectionResponse;

  private final Document document;

}
