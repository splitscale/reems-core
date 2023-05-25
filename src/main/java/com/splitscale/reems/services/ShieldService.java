package com.splitscale.reems.services;

public interface ShieldService<T, J> {
  String register(T request);
  T login(T request);
  J validate(String token, String id);
  String invalidate(String token);
}
