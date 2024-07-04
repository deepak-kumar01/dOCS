import 'package:flutter/material.dart';

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        margin: const EdgeInsets.only(left: 25, right: 25),
        alignment: Alignment.center,
        child: const SingleChildScrollView(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text("Welcome",
                  style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold)),
              Text("+91 8400593718",
                  style: TextStyle(fontSize: 16), textAlign: TextAlign.center),
              SizedBox(height: 10),
              Text("You have been LoggedIn successfully!!",
                  style: TextStyle(fontSize: 16), textAlign: TextAlign.center),
            ],
          ),
        ),
      ),
    );
  }
}
