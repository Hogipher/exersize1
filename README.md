Exersize 1

Purpose of Exersize 1 is to become familiar with recursion and the syntax of Scala. Recursion is utilized in this exersize by taking a full list as an argument and calling the function within it with the tail of the list as an argument instead. Each function ends when the tail of the list is an empty list. This same consept is used with different effects in the functions in this exersize.

The location of the following functions is exersize1/src/main/scala/main.scala

def multAll(m: Int, list: List[Int]): List[Int] = {}
This Function returns a list of integers from the arguments list and m. The resulting list of integers come from multiplying each integer in the argument list with the argument m. 

def addToBack(elem: Int. list: List[Int]): List[Int] = {}
This Function takes an integer called elem and a list called list and adds elem the the right end of the list.

def reverse1(list: list[Int]): List[Int] = {}
uses the function addToBack to reverse the sequence of elements in a given list.

def zipWithIndex(list: List[String] : List[(String, Int)] = {}
This function takes a list of strings as an argument and returns a list of tuples with a string and integer. The Integer in each tuple will ascend in value by 1 from left to right starting at zero.
