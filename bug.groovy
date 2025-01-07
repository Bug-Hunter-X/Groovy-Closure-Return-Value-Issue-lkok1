def someMethod(Closure c) { 
  c() 
}

someMethod { 
  println 'Hello' 
  return 10 
}

println someMethod { 
  println 'World' 
}

//Expected output: 
//Hello
//World
//10

//Actual output: 
//Hello
//World