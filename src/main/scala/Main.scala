/*object hw1 extends eecs.cs478 {*/
@main def main : Unit =
  def userName = "Unbothered1"

  def multAll(m: Int, list: List[Int]): List[Int] = {
    //val multAllResult:List[Int] = List.empty
    def multAllVectMult(m: Int, list: List[Int]): List[Int] = {
      if (list.isEmpty) list//multAllResult
      else (m*list.head)::multAllVectMult(m,list.tail)
    }
    multAllVectMult(m, list)
  }
  //Testing Function multAll
  var testInt : Int = 2
  var testList : List[Int] = List(1,2,3,4,5,6)
  println("Test multiAll: " + multAll(testInt, testList))

  /*IGNORE CODE--> test("multAll", multAll _, "m", "list")*/

  def addToBack(elem: Int, list: List[Int]): List[Int] = {
    if (list.isEmpty) elem::list
    else list.head::addToBack(elem,list.tail)
  }
  //Testing Function addToBack
  testInt = 2
  testList = List(1,2,3,4,5,6)
  println("Test addToBack: " + addToBack(testInt, testList))
  /*IGNORE CODE--> test("addToBack", addToBack _, "elem", "list")*/

  def reverse1(list: List[Int]): List[Int] = {
    if (list.isEmpty) list
    else addToBack(list.head,reverse1(list.tail))
  }
  //Testing Function reverse1
  testList = List(1,2,3,4,5,6)
  println("Test reverse1: " + reverse1(testList))
  /*IGNORE CODE--> test("reverse1", reverse1 _, "list")*/

  def zipWithIndex(list: List[String]) : List[(String, Int)] = {
    val index:Int = 0
    val zippedLst = List.empty[(String,Int)]
    def zipper(index:Int, zippedLst:List[(String,Int)],list:List[String]):List[(String, Int)] = {
      if (list.isEmpty) zippedLst
      else zipper(index+1,(list.head,index)::zippedLst,list.tail)
    }

    def reverse(list: List[(String,Int)]): List[(String,Int)] = {
      val lstReved = List.empty[(String,Int)]
      def reversal(lstReved:List[(String,Int)],list:List[(String,Int)]):List[(String,Int)] = {
        if (list.isEmpty) lstReved
        else reversal(list.head::lstReved,list.tail)
      }
      reversal(lstReved,list)
    }
    reverse(zipper(index,zippedLst,list))
  }
  //Testing Function zipWithIndex
  var testStrList : List[String] = List("a","b","c","d","e")
  println("Test zipWithIndex: " + zipWithIndex(testStrList))
  /*IGNORE CODE--> test("zipWithIndex", zipWithIndex _, "list")*/

  def reverse2(list: List[Int]): List[Int] = {
    val lstReved = List.empty[Int]
    def reversal(lstReved:List[Int],list:List[Int]):List[Int] = {
      if (list.isEmpty) lstReved
      else reversal(list.head::lstReved,list.tail)
    }
    reversal(lstReved,list)
  }
  //Testing Function reverse2
  println("Test reverse2: " + reverse2(testList))
  /*IGNORE CODE--> test("reverse2", reverse2 _, "list")*/



   /*IGNORE CODE--> val reversed:List[Int] = List.empty
    def prepender(originList:List[Int],otherList:List[Int]):List[Int] = {
      if (originList.isEmpty) otherList
      else prepender(originList.head::otherList,originList.tail)
    }
    def prepender2(originList:List[Int],otherList:List[Int]):List[Int] = {
      if (originList.isEmpty) otherList
      else prepender(originList.head::otherList,originList.tail)
    }
    val backedLst:List[Int] =  elem::prepender(list,reversed)
    prepender2(reversed,backedLst)*/
