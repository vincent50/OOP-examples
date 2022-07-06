<?php

class Car { 
    public $id;
    public $licence;
    public $driver;
    protected $passenger;

    function __construct($license, $driver, $passenger) {
        $this->license = $license;
        $this->driver = $driver;
        $this->passenger = $passenger;
    }

    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {

        if ($passenger == 4) {
            $this->passenger = $passenger;
        } else {
            print 'Necesitas asignar 4 pasajeros'
        }
    }
}
