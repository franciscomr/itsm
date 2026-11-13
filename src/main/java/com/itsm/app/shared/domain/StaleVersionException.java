package com.itsm.app.shared.domain;

public class StaleVersionException extends RuntimeException {
  public StaleVersionException(String message) {
    super(message);
  }
}
