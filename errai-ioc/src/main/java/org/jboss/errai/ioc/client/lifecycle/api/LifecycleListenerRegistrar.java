package org.jboss.errai.ioc.client.lifecycle.api;

public interface LifecycleListenerRegistrar {
  
  public <T> Iterable<LifecycleListener<T>> getListeners(Class<? extends LifecycleEvent<T>> eventType, T instance);
  
  public <T> void registerListener(Class<T> lifecycleType, LifecycleListenerGenerator<T> generator);
  
  public <T> void unregisterListener(Class<T> lifecycleType, LifecycleListenerGenerator<T> generator);
  
  public <T> boolean endInstanceLifecycle(T instance);

}