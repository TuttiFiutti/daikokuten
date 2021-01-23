package com.krawed.daikokuten.executor.manager;

import com.krawed.daikokuten.connection.ConnectionService;
import com.krawed.daikokuten.connection.HtmlResponse;
import com.krawed.daikokuten.provider.FlatProvider;
import java.util.List;

public interface AdProviderExecutor {

  List<Object> acquireAds(ConnectionService connectionService, String url,
      FlatProvider<HtmlResponse> provider);
}
