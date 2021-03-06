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
  def calcType(calc: Calculator) = calc match{
    case calc.brand == "hp" && calc.model == "20B" => "financial"
    case calc.brand == "hp" && calc.model == "48G" => "scientific"
    case calc.brand == "hp" && calc.model == "30B" => "business"
    case => "unknown"
      
  }
  
}