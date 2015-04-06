package part.partone

class SecScala {
  class Foo{}
  object FooMaker{
    def apply() = new Foo
     }
  val newFoo = FooMaker()
  
  class Bar{
    def apply()=0      
  }
  val bar = new Bar
  
  bar()
  
  object Timer{    
    var count = 0
    def currentCount(): Long = {
      count += 1
      count;      
    }
  }
  
  Timer.currentCount()
  
  class Bar2(foo: String)  
  object Bar{
  def apply(foo: String) = new Bar2(foo)
}
  object addOne extends Function1[Int, Int]{
    def apply(m: Int): Int = m +1    
  }
  addOne(1)
  
  class AddOne extends Function1[Int, Int]{
    def apply (m: Int): Int = m + 1    
  }
  
  val plusOne = new AddOne()
  
  plusOne(1)
  
  object colorHolder{
    val BLUE = "Blue"
   val RED = "Red"
  }  
//  def calcType(calc: Calculator) = calc match{
//    case calc.brand == "hp" && calc.model == "20B" => "financial"
//    case calc.brand == "hp" && calc.model == "48G" => "scientific"
//    case calc.brand == "hp" && calc.model == "30B" => "business"
//    case => "unknown"      
//  }
  case class Calculator(brand: String, model: String);
  
//  val hp20b = Calculator("hp", "20b");
  
//   val hp20b = Calculator("hp", "20b");
   
   val hp20B = Calculator("hp", "20b");
   
   hp20b == hp20B;
   
 val hp20b = Calculator("hp", "20B")
val hp30b = Calculator("hp", "30B")

def calcType(calc: Calculator) = calc match {
  case Calculator("hp", "20B") => "financial"
  case Calculator("hp", "48G") => "scientific"
  case Calculator("hp", "30B") => "business"
  case Calculator(ourBrand, ourModel) => "Calculator: %s %s is of unknown type".format(ourBrand, ourModel)
  case c@Calculator(_, _) => "Calculator: %s of unknown type".format(c)
}
 
 try {
  remoteCalculatorService.add(1, 2)
} catch {
  case e: ServerIsDownException => log.error(e, "the remote calculator service is unavailble. should have kept your trustry HP.")
} finally {
  remoteCalculatorService.close()
}

val result: Int = try {
  remoteCalculatorService.add(1, 2)
} catch {
  case e: ServerIsDownException => {
    log.error(e, "the remote calculator service is unavailble. should have kept your trustry HP.")
    0
  }
} finally {
  remoteCalculatorService.close()
}
}