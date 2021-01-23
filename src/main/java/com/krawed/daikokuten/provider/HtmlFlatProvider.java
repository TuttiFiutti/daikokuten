package com.krawed.daikokuten.provider;

import com.krawed.daikokuten.connection.ConnectionRequest;
import com.krawed.daikokuten.connection.ConnectionService;
import com.krawed.daikokuten.connection.HtmlResponse;

public interface HtmlFlatProvider extends FlatProvider<HtmlResponse> {

  @Override
  default HtmlResponse send(ConnectionService connectionService,
      ConnectionRequest connectionRequest) {
    return connectionService.getForHtml(connectionRequest);
  }
}
