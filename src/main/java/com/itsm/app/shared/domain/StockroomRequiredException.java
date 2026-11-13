package com.itsm.app.shared.domain;

public class StockroomRequiredException extends RuntimeException {
  public StockroomRequiredException(String message) {
    super(message);
  }
}
