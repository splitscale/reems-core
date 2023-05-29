package com.splitscale.reems.core.services;

public interface FileExporter<T> {
  T createFile();
  Byte[] fileToBytes(T file);
}
