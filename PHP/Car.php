<?php

class Car { 
    public $id = integer;
    public $licence = string;
    public $driver;
    public $passenger = string;

    public function __constructor($license, $driver, $passenger) {
        $this->license = $license;
        $this->driver = $driver;
        $this->passenger = $passenger;
    }
}
