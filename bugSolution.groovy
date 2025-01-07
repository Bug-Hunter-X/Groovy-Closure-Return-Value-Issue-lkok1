def someMethod(Closure c) { 
  def result = c() 
  return result 
}

println someMethod { 
  println 'Hello' 
  return 10 
}

println someMethod { 
  println 'World' 
}

// The solution explicitly captures and returns the result of the closure execution.