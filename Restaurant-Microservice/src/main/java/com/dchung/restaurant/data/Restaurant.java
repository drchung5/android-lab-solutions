package com.dchung.restaurant.data;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Restaurant {

  protected Restaurant(){}

  public Restaurant(@NotNull String name) {
    this.name = name;
  }

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long restaurant_id;

  @NotNull
  private String name;

  @NotNull
  private String review;

  @NotNull
  private Integer rating;

  @NotNull
  private String cuisine;


}
