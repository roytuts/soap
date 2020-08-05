<?php

echo 'SOAP Web Service Consume using PHP';
echo nl2br("\n\n");

/*SOAP Web Service Call Using SoapClient*/

/*$wsdl   = 'https://www.w3schools.com/xml/tempconvert.asmx?WSDL';
$client = new SoapClient($wsdl, array('trace'=>1));  // The trace param will show you errors

$input_celsius = 36;
// web service input param
$request_param = array(
    'Celsius' => $input_celsius
);

try {
    $responce_param = $client->CelsiusToFahrenheit($request_param);
	echo $input_celsius . ' Celsius => ' . $responce_param->CelsiusToFahrenheitResult . ' Fahrenheit';
} catch (Exception $e) { 
    echo "<h2>Exception Error</h2>"; 
    echo $e->getMessage(); 
}*/

/*SOAP Web Service Call Using NUSOAP*/

/*require_once('lib/nusoap.php');

$wsdl   = "https://www.w3schools.com/xml/tempconvert.asmx?WSDL";
$client = new nusoap_client($wsdl, 'wsdl');

$action = "CelsiusToFahrenheit"; // webservice method name

$result = array();

$input_celsius = 36;
$input = '<CelsiusToFahrenheit xmlns="https://www.w3schools.com/xml/"><Celsius>' . $input_celsius . '</Celsius></CelsiusToFahrenheit>';

if (isset($action))
{
    $result['response'] = $client->call($action, $input);
}

//echo $result['response']['CelsiusToFahrenheitResult'];
echo $input_celsius . ' Celsius => ' . $result['response']['CelsiusToFahrenheitResult'] . ' Fahrenheit';*/

/*SOAP Web Service Call Using CURL*/

$webservice_url = "https://www.w3schools.com/xml/tempconvert.asmx";

$input_celsius = 36;

$request_param = '<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Body>
    <CelsiusToFahrenheit xmlns="https://www.w3schools.com/xml/">
      <Celsius>' . $input_celsius . '</Celsius>
    </CelsiusToFahrenheit>
  </soap12:Body>
</soap12:Envelope>';

$headers = array(
    'Content-Type: text/xml; charset=utf-8',
    'Content-Length: '.strlen($request_param)
);

$ch = curl_init($webservice_url);
curl_setopt ($ch, CURLOPT_POST, true);
curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);
curl_setopt ($ch, CURLOPT_POSTFIELDS, $request_param);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_SSL_VERIFYHOST, false);
curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false);

$data = curl_exec ($ch);

$result = $data;

if ($result === FALSE) {
    printf("CURL error (#%d): %s<br>\n", curl_errno($ch),
    htmlspecialchars(curl_error($ch)));
}

curl_close ($ch);

echo $input_celsius . ' Celsius => ' . $data . ' Fahrenheit';

?>