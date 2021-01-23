package com.krawed.daikokuten.provider;

import com.krawed.daikokuten.connection.ConnectionRequest;
import com.krawed.daikokuten.connection.ConnectionService;

public interface FlatProvider<T> {

  int fetchFarthestPageNumber(T url);

  String urlFor(int pageNumber);

  String extractAdsFrom(T response);

  T send(ConnectionService connectionService, ConnectionRequest connectionRequest);

}
