package part.partone

object FiirstScala {
  def main(args: Array[String]) {
    var two = 1+1;
    two = 3;
    var name = "steve";
    name = "team";    
  }
  def addOne(m: Int): Int = m + 1
  
  val three = addOne(2);
  
  def threeF() = 1 + 2;
  threeF();
  threeF;
  (x: Int) => x + 1;  
  res0(1);
  
  val addOne2 = (x: Int) => x + 1;  
  
  addOne2(2);
  
  def timesTwo(i : Int) : Int = { 
    println("hello world");
    i * 2;
    }
  
  
  { i: Int => 
    println("hello world")
    i*2
    }
  
  def adder(m: Int, n: Int) = m + n;
  
  val add2 = adder(2,_:Int)
  
  add2(3);
  
  def multiply(m:Int)(n: Int): Int = m * n;
  
  multiply(2)(6);
  
  val timesTwo = multiply(2) _;
  
  timesTwo(3);
   
  (adder _).curried
  
  def capitalizeAll(args: String*)  = {
    args.map{ arg =>
      arg.capitalize
      
    }
  }
  
  
  class Calculator(brand : String){
    /*
     * 생성자
     * */
    
    val color : String = if(brand == "TI"){
      "blue"
    }else if(brand == "HP"){
      "black"
    }else {
      "white"
    }    
    def add(m: Int, n:Int): Int = m+n;
  }
  
  val calc = new Calculator("HP");
  
  calc.color;
  
  calc.add(1,2)
  
  calc.brand
  
  class C {
    var acc = 0;
    def minc = { acc += 1}
    val finc = { () => acc += 1}
  }
  
  val c = new C
  
  
  c.minc
  
  c.finc
  
  class ScientificCalculator(brand: String) extends Calculator(brand){
    def log(m: Double, base:Double)= math.log(m) / math.log(base)
  }
  
  class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand){
    def log(m: Int): Double = log(m, math.exp(1))
  }
  
  abstract class Shape{
    def getArea():Int        
  }
  
  class Circle(r:Int) extends Shape{
    def getArea():Int = {r*r*3}    
  }
  
  val s = new Shape
  
  val c = new Circle(2)
  
  
  trait Car{
    val brand: String
  }
  trait Shiny{
    val shineRefraction: Int
  }
  
  class BMW extends Car with Shiny {
    val brand = "BMW"
    val shineRefraction = 12
  }
  
  trait Chach[K, V]{
    def get(key: K): V
    def put(key: K, value: V)
    def delete(key: K)
    def remove[K] (key: K)
  }
  
  val times = 1
  
  times match{
    case i if i == 1 => "one"
    case i if i == 2 => "two"
    case _ => "some other number"
  }
  
  def bigger(o: Any): Any={
    o match {
      case i: Int if i < 0 => i -i
      case i: Int => i +1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text : String => text + "s"
    }
  }   
  
}