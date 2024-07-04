
import 'package:flutter/material.dart';
import 'package:taxi_app/home.dart';
import 'package:taxi_app/login.dart';
import 'package:taxi_app/otp_verification.dart';


void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    initialRoute: "login",
    routes: {
      "login": (context) => const Login(),
      "otpVerification": (context) =>const OTPVerification(),
      "home":(context) => const Home(),
    },
  ));
}
