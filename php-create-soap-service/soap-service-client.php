<?php

echo 'Create and Consume SOAP Service';
echo nl2br("\n\n");

$client = new SoapClient( 'http://localhost/php-create-soap-service/ctof.wsdl' );

try {
	$response = $client->celsiusToFahrenheit( 36 );
	echo 'Celsius to Fahrenheit: ' . $response;
} catch ( SoapFault $sf ) {
	//echo $sf;
	echo 'Error:: ' . $sf->getMessage();
}

?>
