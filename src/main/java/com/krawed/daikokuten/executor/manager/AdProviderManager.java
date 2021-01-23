package com.krawed.daikokuten.executor.manager;

import com.krawed.daikokuten.provider.FlatProvider;

public interface AdProviderManager {

  Object runJobForLink(String url);

  Object scheduleNewLink(String url, String frequency);

  Object abortJob(String id);

  Object getStatusForExecutor(String id);

  Object getAllAds(String url, FlatProvider<?> provider);

}
