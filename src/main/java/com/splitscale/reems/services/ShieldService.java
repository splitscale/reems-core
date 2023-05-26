package com.splitscale.reems.services;

public interface ShieldService<T, J> {
  void register(T request);
  T login(T request);
  J validate(String token, String validationData);
  String invalidate(String token);
}
