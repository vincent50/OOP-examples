<?php

class UberX extends Car{ 
    public $brand = string;
    public $model = string;

    public function __constructor($license, $driver, $passenger, $brand, $model) {
      parent::__constructor($license,$driver,$passenger);
      $this->brand = $brand;
      $this->model = $model;
  }
}
