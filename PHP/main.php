<?php
  require_once('Car.php');
  require_once('Account.php');
  require_once('UberX.php');

  print 'Hola Mundo'. "\xA";
  $driver = new Account("Vincent", "12343");
  $driver->printData();

  $car = new Car("AWS43S", $driver, 2);
  $uberX = new UberX("DFG#23", $driver, 4, "Marca", "Modelo jaja");

  print $uberX->driver->name;
?>