<?php
  require_once('Car.php');
  require_once('Account.php');
  require_once('UberX.php');

  print 'Hola Mundo';
  $driver = new Account("Vincent", "12343");
  $car = new Car("AWS43S", $driver, 2);
?>