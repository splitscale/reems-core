package com.splitscale.reems.services;

public interface FileExporter<T> {
  T createFile();
  Byte[] fileToBytes(T file);
}
